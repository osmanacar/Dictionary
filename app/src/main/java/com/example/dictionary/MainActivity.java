package com.example.dictionary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements MyListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void sendData(int position) {
        FragmentAnlam fragmentAnlam = (FragmentAnlam) getFragmentManager().findFragmentById(R.id.fragmentAnlamLandscape);

        // Landcape Mod icin

        if (fragmentAnlam != null && fragmentAnlam.isVisible()) {
            fragmentAnlam.konuAciklamasi(position);
        }

        // Portrait Mod icin

        FragmentAnlam fragmentAnlam2 = (FragmentAnlam) getFragmentManager().findFragmentById(R.id.fragmentAnlamPortrait);


//            Intent intent = new Intent(this, Main2Activity.class);
//            intent.putExtra("position", position);
//            startActivity(intent);

        if (fragmentAnlam2 != null && fragmentAnlam2.isVisible()) {
            fragmentAnlam2.konuAciklamasi(position);
        }

    }
}
