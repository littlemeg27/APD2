package com.example.ravenmargret.academia;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class AddOnGoingFragment extends Fragment
{
//    FirebaseDatabase OnGoingDatabase = FirebaseDatabase.getInstance();
//    DatabaseReference OnGoingRef = OnGoingDatabase.getReference("message");

    EditText projectName;
    EditText projectWeight;
    EditText projectGrade;

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
