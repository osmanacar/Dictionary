package com.example.dictionary;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FragmentKelime extends Fragment {
    ListView kelimeListesi;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_kelime, container, false);
        kelimeListesi = (ListView) view.findViewById(R.id.kelimeListesi);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(), R.array.kelimeler, android.R.layout.simple_list_item_1);
        kelimeListesi.setAdapter(adapter);

        kelimeListesi.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MyListener listener = (MyListener) getActivity();
                listener.sendData(position);
            }
        });

        return view;
    }
}
