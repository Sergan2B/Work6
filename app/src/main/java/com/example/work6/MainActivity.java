package com.example.work6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity /*implements red*/ implements onClickItem {
    private FragmentManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager = getSupportFragmentManager();
        initFragmentLast();
    }
    private void initFragmentLast() {
        getSupportFragmentManager().beginTransaction().add(R.id.containerFirst, new FragmentMain()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.containerSecond, new FragmentLast()).commit();
    }

    @Override
    public void onClick(int pos) {
    }
}