@call set_path
@set JAVA_HOME=C:\Program Files (x86)\Java\jdk1.6.0_38
@cd .\%1\
android update project -p .
copy /y ../build.properties .
@call c:\Utilitaires\ant\bin\ant release
@cd ..
