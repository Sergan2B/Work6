package com.example.work6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.SongViewHolder> {

    private ArrayList<SongModel> songs;
    private onClickItem onClickItem;

    public SongAdapter(ArrayList<SongModel> songs, onClickItem onClickItem) {
        this.songs = songs;
        this.onClickItem = onClickItem;
    }


    @NonNull
    @Override
    public SongViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SongViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_songs, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull SongViewHolder holder, int position) {
        holder.onBind(songs.get(position));
        holder.itemView.setOnClickListener(view -> onClickItem.onClick(position));
    }

    @Override
    public int getItemCount() {
        return songs.size();
    }

    static class SongViewHolder extends RecyclerView.ViewHolder {

        private TextView tvNameSong, tvSingerSing, tvNumber, etTime;

        public SongViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNameSong = itemView.findViewById(R.id.nameSong);
            tvSingerSing = itemView.findViewById(R.id.singer);
            tvNumber = itemView.findViewById(R.id.numberSinger);
            etTime = itemView.findViewById(R.id.textTime);
        }

        public void onBind(SongModel songModel) {
            tvNameSong.setText(songModel.getNameSong());
            tvSingerSing.setText(songModel.getSingerSong());
            tvNumber.setText(songModel.getNumber());
            etTime.setText(songModel.getTime());
        }
    }
}
