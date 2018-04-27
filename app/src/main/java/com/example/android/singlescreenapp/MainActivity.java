package com.example.android.singlescreenapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Calls E Corp when phone icon or phone number are clicked
    public void callECorp(View view) {
        String number = "5555555555";
        Uri call = Uri.parse("tel:" + number);
        Intent intent = new Intent(Intent.ACTION_DIAL, call);
        startActivity(intent);
    }

    // Emails E Corp when email icon or email address are clicked
    public void emailECorp(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        Uri uri = Uri.parse("mailto:angela.moss@e-corp-usa.com");
        intent.setData(uri);
        startActivity(intent);
    }

    // Visits E Corp site when website icon or url are clicked
    public void visitECorp(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.e-corp-online.com"));
        startActivity(intent);
    }
    // Visits fsociety site when fsociety icon is clicked
    public void visitFsociety(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.whoismrrobot.com"));
        startActivity(intent);
    }
}
