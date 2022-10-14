package com.example.jazzpleaseapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityLineUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line_up);
    }

    public void MoveLineUp(View view) {
        Intent intent = new Intent(ActivityLineUp.this, ActivityLineUp.class);
        startActivity(intent);
    }

    public void MoveNewsFeed(View view) {
        Intent intent = new Intent(ActivityLineUp.this, ActivityNewsFeed.class);
        startActivity(intent);
    }

    public void MoveSchedule(View view) {
        Intent intent = new Intent(ActivityLineUp.this, ActivitySchedule.class);
        startActivity(intent);
    }

    public void MoveTicket(View view) {
        Intent intent = new Intent(ActivityLineUp.this, ActivityTicket.class);
        startActivity(intent);
    }

    public void MoveHome(View view) {
        Intent intent = new Intent(ActivityLineUp.this, ActivityHome.class);
        startActivity(intent);
    }
}