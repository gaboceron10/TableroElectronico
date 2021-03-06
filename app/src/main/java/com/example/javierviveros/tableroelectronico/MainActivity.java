package com.example.javierviveros.tableroelectronico;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private String[] velocids;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        velocids = getResources().getStringArray(R.array.speedItems);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void digiText(View v) {
        FragmentManager fragmentManager = getSupportFragmentManager();

        TextDialog speed = new TextDialog();
                speed.show(fragmentManager, "DigiText");
    }

    public void selectDirecc(View v) {
        FragmentManager fragmentManager = getSupportFragmentManager();

        DirectionDialog speed = new DirectionDialog();
        speed.show(fragmentManager, "SelectDirecc");
    }

    public void selectSpeed(View v) {
        FragmentManager fragmentManager = getSupportFragmentManager();

        SpeedDialog speed = new SpeedDialog();
        speed.show(fragmentManager, "SelectSpeed");
    }

    private void msgToast(String s){
        Toast.makeText(MainActivity.this, s, Toast.LENGTH_LONG).show();
    }
}
