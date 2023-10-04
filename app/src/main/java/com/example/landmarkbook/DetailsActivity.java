package com.example.landmarkbook;
import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.landmarkbook.databinding.ActivityDetailsBinding;
import com.example.landmarkbook.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class DetailsActivity extends AppCompatActivity {

     private ActivityDetailsBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);



        //Casting
        //tracks selectedTracks=(tracks) intent.getSerializableExtra("tracks");

        Singleton singleton = Singleton.getInstance();
        tracks selectedTracks=singleton.getSelectedTrack();


        binding.imageView.setImageResource(selectedTracks.image);
        binding.nameText.setText(selectedTracks.name);
        binding.countryText.setText(selectedTracks.country);

    }

public void back(View view){

    Intent intent = new Intent(DetailsActivity.this, MainActivity.class);
    startActivity(intent);

}






}
