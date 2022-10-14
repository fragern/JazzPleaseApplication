package com.example.jazzpleaseapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ActivityTicket extends AppCompatActivity {
    
    private Spinner spinner;
//    TextView stage_day1_text, stage_day2_text, stage_day3_text, ticket_day1_text, ticket_day2_text, ticket_day3_text;
    Spinner stage_day1, stage_day2, stage_day3, ticket_day1, ticket_day2, ticket_day3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket);

        stage_day1 = findViewById(R.id.stage_day1);
        stage_day2 = findViewById(R.id.stage_day2);
        stage_day3 = findViewById(R.id.stage_day3);
        ticket_day1 = findViewById(R.id.ticket_day1);
        ticket_day2 = findViewById(R.id.ticket_day2);
        ticket_day3 = findViewById(R.id.ticket_day3);

        ArrayList<String> sday1 = new ArrayList<>();
        ArrayList<String> sday2 = new ArrayList<>();
        ArrayList<String> sday3 = new ArrayList<>();
        ArrayList<String> tday1 = new ArrayList<>();
        ArrayList<String> tday2 = new ArrayList<>();
        ArrayList<String> tday3 = new ArrayList<>();

        sday1.add("Stage A");
        sday1.add("Stage B");
        sday1.add("Stage C");
        sday2.add("Stage A");
        sday2.add("Stage B");
        sday2.add("Stage C");
        sday3.add("Stage A");
        sday3.add("Stage B");
        sday3.add("Stage C");
        tday1.add("1");
        tday1.add("2");
        tday1.add("3");
        tday2.add("1");
        tday2.add("2");
        tday2.add("3");
        tday3.add("1");
        tday3.add("2");
        tday3.add("3");

        stage_day1.setAdapter(new ArrayAdapter<>(ActivityTicket.this, android.R.layout.simple_spinner_dropdown_item, sday1));
        stage_day1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ActivityTicket.this, "Selected: " + sday1.get(i), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        stage_day2.setAdapter(new ArrayAdapter<>(ActivityTicket.this, android.R.layout.simple_spinner_dropdown_item, sday2));
        stage_day2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ActivityTicket.this, "Selected: " + sday2.get(i), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        stage_day3.setAdapter(new ArrayAdapter<>(ActivityTicket.this, android.R.layout.simple_spinner_dropdown_item, sday3));
        stage_day3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ActivityTicket.this, "Selected: " + sday3.get(i), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ticket_day1.setAdapter(new ArrayAdapter<>(ActivityTicket.this, android.R.layout.simple_spinner_dropdown_item, tday1));
        ticket_day1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ActivityTicket.this, "Selected: " + tday1.get(i), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ticket_day2.setAdapter(new ArrayAdapter<>(ActivityTicket.this, android.R.layout.simple_spinner_dropdown_item, tday2));
        ticket_day2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ActivityTicket.this, "Selected: " + tday2.get(i), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ticket_day3.setAdapter(new ArrayAdapter<>(ActivityTicket.this, android.R.layout.simple_spinner_dropdown_item, tday3));
        ticket_day3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ActivityTicket.this, "Selected: " + tday3.get(i), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void MoveLineUp(View view) {
        Intent intent = new Intent(ActivityTicket.this, ActivityLineUp.class);
        startActivity(intent);
    }

    public void MoveNewsFeed(View view) {
        Intent intent = new Intent(ActivityTicket.this, ActivityNewsFeed.class);
        startActivity(intent);
    }

    public void MoveSchedule(View view) {
        Intent intent = new Intent(ActivityTicket.this, ActivitySchedule.class);
        startActivity(intent);
    }

    public void MoveTicket(View view) {
        Intent intent = new Intent(ActivityTicket.this, ActivityTicket.class);
        startActivity(intent);
    }

    public void MoveHome(View view) {
        Intent intent = new Intent(ActivityTicket.this, ActivityHome.class);
        startActivity(intent);
    }
}