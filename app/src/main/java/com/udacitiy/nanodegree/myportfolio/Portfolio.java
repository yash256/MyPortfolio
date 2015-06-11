package com.udacitiy.nanodegree.myportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Portfolio extends Activity implements View.OnClickListener {

    Button spotify, library, xyz, scores, capstone, bigger;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);
        spotify=(Button) findViewById(R.id.spotify);
        library=(Button) findViewById(R.id.library);
        xyz=(Button) findViewById(R.id.xyz);
        scores=(Button) findViewById(R.id.scores);
        bigger=(Button) findViewById(R.id.bigger);
        capstone=(Button) findViewById(R.id.capstone);
        spotify.setOnClickListener((View.OnClickListener) this);
        xyz.setOnClickListener((View.OnClickListener) this);
        bigger.setOnClickListener((View.OnClickListener) this);
        scores.setOnClickListener((View.OnClickListener) this);
        capstone.setOnClickListener((View.OnClickListener) this);
        library.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_portfolio, menu);
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

    @Override
    public void onClick(View v) {
        int id=v.getId();
        String msg="This button will launch my ";
        String temp="";
        switch (id){
            case R.id.spotify:
                temp="spotify app";
                break;
            case R.id.library:
                temp="library app";
                break;
            case R.id.scores:
                temp="scores app";
                break;
            case R.id.bigger:
                temp="build it bigger app";
                break;
            case R.id.capstone:
                temp="capstone app";
                break;
            case R.id.xyz:
                temp="xyz reader app";
                break;
        }
        msg+=temp;
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
    }
}
