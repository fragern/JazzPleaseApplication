package com.example.jazzpleaseapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    
    public void MoveAds(View view) {
        Intent intent = new Intent(ActivityHome.this, ActivityAds.class);
        startActivity(intent);
    }

    public void MoveLineUp(View view) {
        Intent intent = new Intent(ActivityHome.this, ActivityLineUp.class);
        startActivity(intent);
    }

    public void MoveNewsFeed(View view) {
        Intent intent = new Intent(ActivityHome.this, ActivityNewsFeed.class);
        startActivity(intent);
    }

    public void MoveSchedule(View view) {
        Intent intent = new Intent(ActivityHome.this, ActivitySchedule.class);
        startActivity(intent);
    }

    public void MoveTicket(View view) {
        Intent intent = new Intent(ActivityHome.this, ActivityTicket.class);
        startActivity(intent);
    }

    public void MoveHome(View view) {
        Intent intent = new Intent(ActivityHome.this, ActivityHome.class);
        startActivity(intent);
    }
}