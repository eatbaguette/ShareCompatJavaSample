package com.example.monkey.sharecompatjavasample;

import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private String url = "http://google.com";
    private String text = "this is text";
    private String TAG = "TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        share();
    }

    private void share() {
        ShareCompat.IntentBuilder builder = ShareCompat.IntentBuilder.from(this);
        builder.setChooserTitle("hoge")
                .setSubject(text)
                .setText(url)
                .setType("text/plain")
                .startChooser();
    }



}
