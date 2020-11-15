package com.example.newthingy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LocationSelectorActivity extends AppCompatActivity {
    private Button btn_search;
    private Button btn_location;
    private TextView text_zip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_selector);

        btn_location = findViewById(R.id.btn_location);
        btn_search = findViewById(R.id.btn_search);
        text_zip = findViewById(R.id.text_id);
    }

    public void findFacilities(View v) {
        //Verify input
        if (!text_zip.getText().toString().isEmpty()) {
            String zip = text_zip.getText().toString();

            //Load info
            Facility[] dummyData = new Facility[]{new Facility("Addison's Cafe", "1212 Baker St.", "Swag","TX"), new Facility("Addison's Cafe", "1212 Baker St.", "Swag","TX"), new Facility("Addison's Cafe", "1212 Baker St.", "Swag","TX"), new Facility("Addison's Cafe", "1212 Baker St.", "Swag","TX"), new Facility("Addison's Cafe", "1212 Baker St.", "Swag","TX"), new Facility("Addison's Cafe", "1212 Baker St.", "Swag","TX"), new Facility("Addison's Cafe", "1212 Baker St.", "Swag","TX"), new Facility("Addison's Cafe", "1212 Baker St.", "Swag","TX")};

            Intent newIntent = new Intent(LocationSelectorActivity.this, MainActivity.class);
            newIntent.putExtra("zipcode", zip);
            //Open new activity
            startActivity(newIntent);
        } else {
            text_zip.setError("Please try again");
        }
    }
}