package com.anishparajuli.pn.pocketnurse;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class about extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    public void anish(View v){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://fb.com/anish.parajuli.96/")));
    }
    public void sudip(View v){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://fb.com/sudip.bhattarai.14/")));
    }
    public void sat(View v){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://fb.com/satyarth.upadhyaya/")));
    }

}
