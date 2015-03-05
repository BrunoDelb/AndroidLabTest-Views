package com.mma.androidlabtest;

import android.app.Activity;
import android.app.ListFragment;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Main extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getFragmentManager().findFragmentById (android.R.id.content) == null) {
            ArrayListFragment list = new ArrayListFragment();
            getFragmentManager().beginTransaction().add(android.R.id.content, list).commit();
        }
    }

    public static class ArrayListFragment 
						extends ListFragment {

        public void onActivityCreated(Bundle savedInstanceState) {
            super.onActivityCreated(savedInstanceState);
            setListAdapter(new ArrayAdapter<String>(
            	getActivity(), 
            	android.R.layout.simple_list_item_1, 
            	new String[] {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"}
            ));
        }

        public void onListItemClick(ListView l, View v, int position, long id) {
            Toast.makeText(getActivity(), "Item clicked: " + id, Toast.LENGTH_SHORT);
        }
    }
}
