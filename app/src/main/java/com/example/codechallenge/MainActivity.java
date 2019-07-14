package com.example.codechallenge;

import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button Button01;
    private Button Button02;

   

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Button01 = (Button) findViewById(R.id.activity_b);
        Button02 = (Button) findViewById(R.id.activity_c);

        Button01.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Open Activity B (About ALC 4.0)

                Intent intent1 = new Intent(MainActivity.this, ActivityB.class);
                MainActivity.this.startActivity(intent1);

            }
        });

        Button02.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Open Activity C (My profile)

                Intent intent2 = new Intent(MainActivity.this, ActivityC.class);
                MainActivity.this.startActivity(intent2);
            }
        });


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
