package com.example.ravenmargret.academia;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AddOnGoingFragment extends Fragment
{
    FirebaseD  database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("message");

    public AddOnGoingFragment()
    {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_on_going, container, false);
    }

}
