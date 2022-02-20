package com.geektech.recyclefragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class MainFragment extends Fragment {
private ArrayList<String> contacts;
private RecyclerView recyclerView;
private ContactAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contact, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        recyclerView =view.findViewById(R.id.recycler);
        adapter = new ContactAdapter(contacts);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        contacts = new ArrayList<>();
        contacts.add("0708356912");
        contacts.add("0701011141");
        contacts.add("0709434056");
        contacts.add("0504170550");
        contacts.add("0507300500");
        contacts.add("0550844425");
        contacts.add("0704096919");
        contacts.add("0500680810");
        contacts.add("0550478923");
        contacts.add("0704618816");

    }
}