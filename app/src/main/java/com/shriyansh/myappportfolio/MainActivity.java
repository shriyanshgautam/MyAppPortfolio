package com.shriyansh.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


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


    public void popularMovies(View view){
        toast("This button will launch my popular movies app !");
    }

    public void stockHawk(View view){
        toast("This button will launch my stock hawk app !");
    }

    public void buildItBigger(View view){
        toast("This button will launch my build it bigger app !");
    }

    public void makeYourAppMaterial(View view){
        toast("This button will launch my make your app material app !");
    }

    public void goUbiquitous(View view){
        toast("This button will launch my go ubiquitous app !");
    }

    public void capstone(View view){
        toast("This button will launch my capstone app !");
    }

    public void toast(String text){
        Toast.makeText(MainActivity.this,text,Toast.LENGTH_SHORT).show();
    }
}
