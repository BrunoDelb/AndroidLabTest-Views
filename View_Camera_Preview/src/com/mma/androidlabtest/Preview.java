package com.mma.androidlabtest;

import java.io.IOException;

import android.content.Context;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

class Preview extends SurfaceView 
		implements SurfaceHolder.Callback {
		
    SurfaceHolder surfaceHolder;
    Camera camera;
    
    Preview(Context context) {
        super(context);
        surfaceHolder = getHolder();
        surfaceHolder.addCallback(this);
        surfaceHolder.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
    	camera = Camera.open();
        try {
        	camera.setPreviewDisplay(surfaceHolder);
		} catch (IOException e) {
		}
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    	camera.stopPreview();
    	camera = null;
    }

    public void surfaceChanged(SurfaceHolder holder, int format, int w, int h) {
        Camera.Parameters parameters = camera.getParameters();
        parameters.setPreviewSize(w, h);
        camera.setParameters(parameters);
        camera.startPreview();
    }
}
