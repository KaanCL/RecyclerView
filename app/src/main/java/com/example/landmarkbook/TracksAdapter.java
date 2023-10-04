package com.example.landmarkbook;

import android.view.View;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.landmarkbook.databinding.RecyclerRowBinding;

import java.util.ArrayList;

public class TracksAdapter extends RecyclerView.Adapter<TracksAdapter.TracksHolder> {

    ArrayList<tracks> trackList;

    public TracksAdapter(ArrayList<tracks>trackList){
        this.trackList=trackList;
    }


    @NonNull
    @Override
    public TracksHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       RecyclerRowBinding recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
       return new TracksHolder(recyclerRowBinding);

    }

    @Override
    public void onBindViewHolder(@NonNull TracksHolder holder, int p) {
         holder.binding.recyclerViewTextView.setText(trackList.get(p).name);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(), DetailsActivity.class);
                Singleton singleton=Singleton.getInstance();
                singleton.setChosenTrack(trackList.get(p));
                holder.itemView.getContext().startActivity(intent);
            }
        });



    }

    @Override
    public int getItemCount() {
        return trackList.size();
    }

    public class TracksHolder extends RecyclerView.ViewHolder{

        private RecyclerRowBinding binding;

        public TracksHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }

}
