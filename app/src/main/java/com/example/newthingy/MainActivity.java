package com.example.newthingy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends FragmentActivity {
    private RecyclerView mRecyclerView;
    private ListAdapter mAdapter;

    private Facility[] dummyData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dummyData = new Facility[]{new Facility("Addison's Cafe", "1212 Baker St.", "Swag","TX"), new Facility("Addison's Cafe", "1212 Baker St.", "Swag","TX"), new Facility("Addison's Cafe", "1212 Baker St.", "Swag","TX"), new Facility("Addison's Cafe", "1212 Baker St.", "Swag","TX"), new Facility("Addison's Cafe", "1212 Baker St.", "Swag","TX"), new Facility("Addison's Cafe", "1212 Baker St.", "Swag","TX"), new Facility("Addison's Cafe", "1212 Baker St.", "Swag","TX"), new Facility("Addison's Cafe", "1212 Baker St.", "Swag","TX")};

        mRecyclerView = findViewById(R.id.recyclerView);
        mAdapter = new ListAdapter(this, dummyData);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}