package com.example.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.landmarkbook.databinding.ActivityDetailsBinding;
import com.example.landmarkbook.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    String track;
    ArrayList<tracks> tracksArrayList;
    private ActivityMainBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        tracksArrayList = new ArrayList<>();

        //Data

        tracks imola = new tracks("Imola","Italy",R.drawable.imola);
        tracks istanbulpark = new tracks("IstanbulPark","Turkey",R.drawable.istanbulpark);
        tracks redbullring= new tracks("RedbullRing","Austria",R.drawable.redbullring);
        tracks silverstone= new tracks("Silverstone","GreatBritain",R.drawable.silverstone);
        tracks suzuka= new tracks("Suzuka","Japan",R.drawable.suzuka);


        tracksArrayList.add(imola);
        tracksArrayList.add(istanbulpark);
        tracksArrayList.add(redbullring);
        tracksArrayList.add(silverstone);
        tracksArrayList.add(suzuka);


        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        TracksAdapter tracksAdapter = new TracksAdapter(tracksArrayList);
        binding.recyclerView.setAdapter(tracksAdapter);



        /*
        //Adapter
        //ListView

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1,
                tracksArrayList.stream().map(landmark ->landmark.name).collect(Collectors.toList())
        );
        binding.listView.setAdapter(arrayAdapter);

        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent =new Intent(MainActivity.this,DetailsActivity.class);

                intent.putExtra("tracks",tracksArrayList.get(i));
                startActivity(intent);

            }
        });
  */




    }
}