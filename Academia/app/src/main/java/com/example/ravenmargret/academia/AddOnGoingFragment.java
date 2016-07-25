package com.example.ravenmargret.academia;


import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class AddOnGoingFragment extends Fragment implements View.OnClickListener
{
    private DatabaseReference mDatabase;

    Button addLineButton;
    EditText projectName;
    EditText projectWeight;
    EditText projectGrade;

    ArrayList<EditText> projectNameArrayList = new ArrayList<>();
    ArrayList<EditText> projectWeightArrayList = new ArrayList<>();
    ArrayList<EditText> projectGradeArrayList = new ArrayList<>();

    public AddOnGoingFragment()
    {
        // Required empty public constructor
    }

    public ArrayList<EditText> projectNameArrayList()
    {
        projectNameArrayList.add(projectName);

        return projectNameArrayList;
    }

    public ArrayList<EditText> projectWeightArrayList()
    {
        projectWeightArrayList.add(projectWeight);

        return projectWeightArrayList;
    }

    public ArrayList<EditText> projectGradeArrayList()
    {
        projectGradeArrayList.add(projectGrade);

        return projectGradeArrayList;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        mDatabase = FirebaseDatabase.getInstance().getReference();

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_on_going, container, false);
    }

//    @Override
//    public void onActivityCreated(Bundle savedInstanceState)
//    {
//        super.onActivityCreated(savedInstanceState);
//
//        projectName = (EditText)getView().findViewById(R.id.projectName);
//        projectWeight = (EditText)getView().findViewById(R.id.projectWeight);
//        projectGrade = (EditText)getView().findViewById(R.id.projectGrade);
//
//        findViewById(R.id.fab_submit_post).setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View v)
//            {
//                submitPost();
//            }
//        });
//    }

    @Override
    public void onClick(View v)
    {
        addLineButton = (Button)getView().findViewById(R.id.addLine);
        addLineButton.setOnClickListener(this);

        projectNameArrayList();
        projectWeightArrayList();
        projectGradeArrayList();

        Toast.makeText(getActivity(), "Line added", Toast.LENGTH_LONG).show();
    }
}
