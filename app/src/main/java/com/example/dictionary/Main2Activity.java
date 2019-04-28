package com.example.dictionary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();

        int pos = intent.getIntExtra("position", 0);

        FragmentAnlam fragmentAnlam = (FragmentAnlam) getFragmentManager().findFragmentById(R.id.fragmentAnlam);
        fragmentAnlam.konuAciklamasi(pos);
    }
}
