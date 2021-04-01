package com.example.tugasrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.Button;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;
    // we user ArrayList to populate data in RecyclerView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.rvdata);

        addData();

        adapter = new MahasiswaAdapter(mahasiswaArrayList);
        //selesai ngatur data dari adapter, kemudian di tempel ke Recyclerview nya
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Dimas Maulana", "999", "081222","email"));
        mahasiswaArrayList.add(new Mahasiswa("Budi", "000", "081222", "email"));
        mahasiswaArrayList.add(new Mahasiswa("Ani", "222", "083333", "email budi"));
        Mahasiswa Sari = new Mahasiswa("Sari", "xxx" , "000", "sari@gmail.com");
        mahasiswaArrayList.add(Sari);
        mahasiswaArrayList.add(new Mahasiswa("Umar Setyawan", "190", "0x0xx930", "email.email"));
    }
}