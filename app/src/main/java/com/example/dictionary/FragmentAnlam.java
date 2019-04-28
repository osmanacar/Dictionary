package com.example.dictionary;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentAnlam extends Fragment {
    TextView anlam;
    String[] anlamlar;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_anlam, container, false);

        anlam = (TextView) view.findViewById(R.id.textViewAnlam);
        anlamlar = getResources().getStringArray(R.array.anlamlar);
        anlam.setText(anlamlar[0]);

        return view;
    }

    public void konuAciklamasi(int pos) {
        anlam.setText(anlamlar[pos]);
    }
}
