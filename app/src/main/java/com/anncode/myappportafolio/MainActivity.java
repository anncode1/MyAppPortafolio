package com.anncode.myappportafolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void spotifyStreamer(View view){
        Toast.makeText(this, getApplicationContext().getString(R.string.toast_spotify_launch), Toast.LENGTH_SHORT).show();

    }

    public void scoresApp(View view){
        Toast.makeText(this, getApplicationContext().getString(R.string.toast_scores_app_launch), Toast.LENGTH_SHORT).show();
    }

    public void libraryApp(View view){
        Toast.makeText(this, getApplicationContext().getString(R.string.toast_library_app_launch), Toast.LENGTH_SHORT).show();
    }

    public void buildItBigger(View view){
        Toast.makeText(this, getApplicationContext().getString(R.string.toast_build_it_bigger_launch), Toast.LENGTH_SHORT).show();
    }

    public void xyzReader(View view){
        Toast.makeText(this, getApplicationContext().getString(R.string.toast_xyz_reader_launch), Toast.LENGTH_SHORT).show();
    }

    public void capstoneMyOwnApp(View view){
        Toast.makeText(this, getApplicationContext().getString(R.string.toast_capstone_my_own_app_launch), Toast.LENGTH_SHORT).show();
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
}
