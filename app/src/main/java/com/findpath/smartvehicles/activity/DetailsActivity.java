package com.findpath.smartvehicles.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.findpath.smartvehicles.R;

public class DetailsActivity extends AppCompatActivity {

    TextView markertext;
    TextView address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        String title = getIntent().getStringExtra("title");
        String address = getIntent().getStringExtra("address");

        // Now you can use 'title' and 'address' to display in your activity
        // For example, if you have TextViews with ids 'textViewTitle' and 'textViewAddress':
        TextView textViewTitle = findViewById(R.id.Marker_title);
        TextView textViewAddress = findViewById(R.id.address);

        textViewTitle.setText(title);
        textViewAddress.setText(address);

    }
}