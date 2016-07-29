package com.example.ravenmargret.academia;


import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class AddOnGoingFragment extends Fragment
{
    private DatabaseReference onGoingDatabase;

    EditText assignmentNameTextView;
    EditText assignmentWeightTextView;
    EditText assignmentGradeTextView;

    String assignmentName;
    Double assignmentWeight;
    Double assignmentGrade;

    ArrayList<String> editTextArray = new ArrayList<>();

    public AddOnGoingFragment()
    {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        onGoingDatabase = FirebaseDatabase.getInstance().getReference();

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_on_going, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);

        assignmentNameTextView = (EditText)getView().findViewById(R.id.assignmentNameTextView);
        assignmentWeightTextView = (EditText)getView().findViewById(R.id.assignmentWeightTextView);
        assignmentGradeTextView = (EditText)getView().findViewById(R.id.assignmentGradeTextView);

        assignmentName = assignmentNameTextView.getText().toString();
        assignmentWeight = Double.parseDouble(assignmentWeightTextView.getText().toString());
        assignmentGrade = Double.parseDouble(assignmentGradeTextView.getText().toString());
    }

    public void createNewLine(Bundle savedInstanceState)
    {
        //LinearLayout item = (LinearLayout)getView().findViewbyId(R.id.action_add_on_going);

        View child = getActivity().getLayoutInflater().inflate(R.layout.fragment_add_on_going, null);
        //item.addView(child);

        Toast.makeText(getActivity(), "Line added", Toast.LENGTH_LONG).show();
    }

    public void writeNewUser(String classID, String className, Double classWeight, Double classGrade)
    {
        FinishedClass finished = new FinishedClass(className, classWeight, classGrade);

        onGoingDatabase.child("onGoing").child(classID).setValue(finished);
    }

}
