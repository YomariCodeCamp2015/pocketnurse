package com.anishparajuli.pn.pocketnurse;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;


public class news extends ActionBarActivity {

    WebView news;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        news=(WebView)findViewById(R.id.newsview);
        news.setWebViewClient(new WebViewClient());
        news.getSettings().setJavaScriptEnabled(true);
        news.loadUrl("http://www.cnn.com/health");
        news.requestFocus();
    }

    public void cnn(View v){
        news.loadUrl("http://www.cnn.com/health");
    }

    public void bbc(View v){
        news.loadUrl("http://www.bbc.co.uk/health");
    }

    public void yahoo(View v){
        news.loadUrl("http://www.yahoo.com/health");
    }

    public void wmd(View v){
        news.loadUrl("http://www.webmd.com");
    }


}
