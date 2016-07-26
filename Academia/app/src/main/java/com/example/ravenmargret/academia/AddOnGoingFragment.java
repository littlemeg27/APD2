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
    //Firebase.setAndroidContext(this);

    Button addLineButton;
    EditText projectNameTextView;
    EditText projectWeightTextView;
    EditText projectGradeTextView;

    ArrayList<EditText> editTextArrayList = new ArrayList<>();

    public AddOnGoingFragment()
    {
        // Required empty public constructor
    }

    public ArrayList<EditText> editTextArrayList()
    {
        editTextArrayList.add(projectNameTextView);
        editTextArrayList.add(projectWeightTextView);
        editTextArrayList.add(projectGradeTextView);

        return editTextArrayList;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        mDatabase = FirebaseDatabase.getInstance().getReference();

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_on_going, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);

        projectNameTextView = (EditText)getView().findViewById(R.id.projectNameTextView);
        projectWeightTextView = (EditText)getView().findViewById(R.id.projectWeightTextView);
        projectGradeTextView = (EditText)getView().findViewById(R.id.projectGradeTextView);

        addLineButton = (Button)getView().findViewById(R.id.addLine);
        addLineButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        String projectName = projectNameTextView.getText().toString();
        Double projectWeight = Double.parseDouble(projectWeightTextView.getText().toString());
        Double projectGrade = Double.parseDouble(projectGradeTextView.getText().toString());

        editTextArrayList();

        Toast.makeText(getActivity(), "Line added", Toast.LENGTH_LONG).show();
    }
}
