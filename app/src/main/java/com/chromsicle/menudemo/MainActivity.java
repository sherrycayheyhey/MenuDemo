package com.chromsicle.menudemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

//create 'menu' directory in res, then add a new menu resource file in that
//finally, fill in the main menu item titles and ids


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //this makes the menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        //get a MenuInflater then inflate it
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    //this is called when a menu item is selected by the user
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        //check the menu item id to see what to do with it
        switch (item.getItemId()) {
            case R.id.settings:
                Log.i("item selected", "settings clicked");
                return true;
            case R.id.help:
                Log.i("item selected", "help clicked");
                return true;
            default: return false;

        }
    }
}
