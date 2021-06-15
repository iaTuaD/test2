package com.example.recycleviewtt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import Hoa.Hoa;
import Khuvuc.Khuvuc;
import Khuvuc.KhuvucAdapter;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private KhuvucAdapter khuvucAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rcvTong);
        khuvucAdapter = new KhuvucAdapter(this);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        khuvucAdapter.setData(getlistKhuVuc());
        recyclerView.setAdapter(khuvucAdapter);

    }
    private List<Khuvuc> getlistKhuVuc() {
        List<Khuvuc> khuvucList = new ArrayList<>();

        List<Hoa> hoaList = new ArrayList<>();
        hoaList.add(new Hoa(R.drawable.dep, "Dep na"));
        hoaList.add(new Hoa(R.drawable.tim, "sadhvfch sdj"));
        hoaList.add(new Hoa(R.drawable.trong, "djcbasakbb"));
        hoaList.add(new Hoa(R.drawable.vang, "dbvsdbds"));
        hoaList.add(new Hoa(R.drawable.trong, "djcbasakbb"));
        hoaList.add(new Hoa(R.drawable.vang, "dbvsdbds"));
        hoaList.add(new Hoa(R.drawable.trong, "djcbasakbb"));
        hoaList.add(new Hoa(R.drawable.vang, "dbvsdbds"));

        khuvucList.add(new Khuvuc("Khu vuc 1", hoaList));
        khuvucList.add(new Khuvuc("Khu vuc 2", hoaList));
        khuvucList.add(new Khuvuc("Khu vuc 3", hoaList));
        khuvucList.add(new Khuvuc("Khu vuc 4", hoaList));
        khuvucList.add(new Khuvuc("Khu vuc 4", hoaList));
        khuvucList.add(new Khuvuc("Khu vuc 4", hoaList));

        return khuvucList;
    }
}