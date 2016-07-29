package com.example.ravenmargret.academia;


import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class GradeScaleFragment extends Fragment
{
    private DatabaseReference gradeScaleDatabase;

    EditText

    public GradeScaleFragment()
    {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        gradeScaleDatabase = FirebaseDatabase.getInstance().getReference();

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_grade_scale, container, false);
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

    public void writeNewUser(String classID, String className, Double classWeight, Double classGrade)
    {
        FinishedClass finished = new FinishedClass(className, classWeight, classGrade);

        gradeScaleDatabase.child("finished").child(classID).setValue(finished);

        Toast.makeText(getActivity(), "Class Added", Toast.LENGTH_LONG).show();
    }

}
