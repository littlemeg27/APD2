package com.example.ravenmargret.academia;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddFinishedFragment extends Fragment implements View.OnClickListener
{
    EditText classNameTextView;
    EditText classWeightTextView;
    EditText classGradeTextView;

    String className;
    Double classWeight;
    Double classGrade;

    private DatabaseReference mDatabase;

    public AddFinishedFragment()
    {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_finished, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);

        mDatabase = FirebaseDatabase.getInstance().getReference();

        classNameTextView = (EditText)getView().findViewById(R.id.classNameTextView);
        classWeightTextView = (EditText)getView().findViewById(R.id.classWeightTextView);
        classGradeTextView = (EditText)getView().findViewById(R.id.classGradeTextView);
    }

    @Override
    public void onClick(View v)
    {
        className = classNameTextView.getText().toString();
        classWeight = Double.parseDouble(classWeightTextView.getText().toString());
        classGrade = Double.parseDouble(classGradeTextView.getText().toString());

        writeNewUser(className, classWeight, classGrade);

        Toast.makeText(getActivity(), "Saved", Toast.LENGTH_LONG).show();
    }

    private void writeNewUser(String className, Double classWeight, Double classGrade)
    {
        FinishedClass finished = new FinishedClass(className, classWeight, classGrade);

        mDatabase.child("name").child(className).setValue(finished);
        mDatabase.child("weight").child(classWeight).setValue(finished);
        mDatabase.child("grade").child(classGrade).setValue(finished);
    }
}
