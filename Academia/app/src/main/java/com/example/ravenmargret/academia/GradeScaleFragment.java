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

    EditText letterGrade1TextView;
    EditText letterGrade2TextView;
    EditText letterGrade3TextView;
    EditText letterGrade4TextView;
    EditText letterGrade5TextView;
    EditText letterGrade6TextView;
    EditText letterGrade7TextView;
    EditText letterGrade8TextView;

    EditText firstGrade1TextView;
    EditText firstGrade2TextView;
    EditText firstGrade3TextView;
    EditText firstGrade4TextView;
    EditText firstGrade5TextView;
    EditText firstGrade6TextView;
    EditText firstGrade7TextView;
    EditText firstGrade8TextView;

    EditText secondGrade1TextView;
    EditText secondGrade2TextView;
    EditText secondGrade3TextView;
    EditText secondGrade4TextView;
    EditText secondGrade5TextView;
    EditText secondGrade6TextView;
    EditText secondGrade7TextView;
    EditText secondGrade8TextView;

    EditText gpa1TextView;
    EditText gpa2TextView;
    EditText gpa3TextView;
    EditText gpa4TextView;
    EditText gpa5TextView;
    EditText gpa6TextView;
    EditText gpa7TextView;
    EditText gpa8TextView;

    String letterGrade1;
    String letterGrade2;
    String letterGrade3;
    String letterGrade4;
    String letterGrade5;
    String letterGrade6;
    String letterGrade7;
    String letterGrade8;

    Double firstGrade1;
    Double firstGrade2;
    Double firstGrade3;
    Double firstGrade4;
    Double firstGrade5;
    Double firstGrade6;
    Double firstGrade7;
    Double firstGrade8;

    Double secondGrade1;
    Double secondGrade2;
    Double secondGrade3;
    Double secondGrade4;
    Double secondGrade5;
    Double secondGrade6;
    Double secondGrade7;
    Double secondGrade8;

    Double gpa1;
    Double gpa2;
    Double gpa3;
    Double gpa4;
    Double gpa5;
    Double gpa6;
    Double gpa7;
    Double gpa8;

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

        letterGrade1TextView = (EditText)getView().findViewById(R.id.letterGrade1TextView);
        letterGrade2TextView = (EditText)getView().findViewById(R.id.letterGrade2TextView);
        letterGrade3TextView = (EditText)getView().findViewById(R.id.letterGrade3TextView);
        letterGrade4TextView = (EditText)getView().findViewById(R.id.letterGrade4TextView);
        letterGrade5TextView = (EditText)getView().findViewById(R.id.letterGrade5TextView);
        letterGrade6TextView = (EditText)getView().findViewById(R.id.letterGrade6TextView);
        letterGrade7TextView = (EditText)getView().findViewById(R.id.letterGrade7TextView);
        letterGrade8TextView = (EditText)getView().findViewById(R.id.letterGrade8TextView);

        firstGrade1TextView = (EditText)getView().findViewById(R.id.firstGrade1TextView);
        firstGrade2TextView = (EditText)getView().findViewById(R.id.firstGrade2TextView);
        firstGrade3TextView = (EditText)getView().findViewById(R.id.firstGrade3TextView);
        firstGrade4TextView = (EditText)getView().findViewById(R.id.firstGrade4TextView);
        firstGrade5TextView = (EditText)getView().findViewById(R.id.firstGrade5TextView);
        firstGrade6TextView = (EditText)getView().findViewById(R.id.firstGrade6TextView);
        firstGrade7TextView = (EditText)getView().findViewById(R.id.firstGrade7TextView);
        firstGrade8TextView = (EditText)getView().findViewById(R.id.firstGrade8TextView);

        secondGrade1TextView = (EditText)getView().findViewById(R.id.secondGrade1TextView);
        secondGrade2TextView = (EditText)getView().findViewById(R.id.secondGrade2TextView);
        secondGrade3TextView = (EditText)getView().findViewById(R.id.secondGrade3TextView);
        secondGrade4TextView = (EditText)getView().findViewById(R.id.secondGrade4TextView);
        secondGrade5TextView = (EditText)getView().findViewById(R.id.secondGrade5TextView);
        secondGrade6TextView = (EditText)getView().findViewById(R.id.secondGrade6TextView);
        secondGrade7TextView = (EditText)getView().findViewById(R.id.secondGrade7TextView);
        secondGrade8TextView = (EditText)getView().findViewById(R.id.secondGrade8TextView);

        gpa1TextView = (EditText)getView().findViewById(R.id.gpa1TextView);
        gpa2TextView = (EditText)getView().findViewById(R.id.gpa2TextView);
        gpa3TextView = (EditText)getView().findViewById(R.id.gpa3TextView);
        gpa4TextView = (EditText)getView().findViewById(R.id.gpa4TextView);
        gpa5TextView = (EditText)getView().findViewById(R.id.gpa5TextView);
        gpa6TextView = (EditText)getView().findViewById(R.id.gpa6TextView);
        gpa7TextView = (EditText)getView().findViewById(R.id.gpa7TextView);
        gpa8TextView = (EditText)getView().findViewById(R.id.gpa8TextView);

        letterGrade1 = letterGrade1TextView.getText().toString();
        letterGrade2 = letterGrade2TextView.getText().toString();
        letterGrade3 = letterGrade3TextView.getText().toString();
        letterGrade4 = letterGrade4TextView.getText().toString();
        letterGrade5 = letterGrade5TextView.getText().toString();
        letterGrade6 = letterGrade6TextView.getText().toString();
        letterGrade7 = letterGrade7TextView.getText().toString();
        letterGrade8 = letterGrade8TextView.getText().toString();

        firstGrade1 = Double.parseDouble(firstGrade1TextView.getText().toString());
        firstGrade2 = Double.parseDouble(firstGrade2TextView.getText().toString());
        firstGrade3 = Double.parseDouble(firstGrade3TextView.getText().toString());
        firstGrade4 = Double.parseDouble(firstGrade4TextView.getText().toString());
        firstGrade5 = Double.parseDouble(firstGrade5TextView.getText().toString());
        firstGrade6 = Double.parseDouble(firstGrade6TextView.getText().toString());
        firstGrade7 = Double.parseDouble(firstGrade7TextView.getText().toString());
        firstGrade8 = Double.parseDouble(firstGrade8TextView.getText().toString());

        secondGrade1 = Double.parseDouble(secondGrade1TextView.getText().toString());
        secondGrade2 = Double.parseDouble(secondGrade2TextView.getText().toString());
        secondGrade3 = Double.parseDouble(secondGrade3TextView.getText().toString());
        secondGrade4 = Double.parseDouble(secondGrade4TextView.getText().toString());
        secondGrade5 = Double.parseDouble(secondGrade5TextView.getText().toString());
        secondGrade6 = Double.parseDouble(secondGrade6TextView.getText().toString());
        secondGrade7 = Double.parseDouble(secondGrade7TextView.getText().toString());
        secondGrade8 = Double.parseDouble(secondGrade8TextView.getText().toString());

        gpa1 = Double.parseDouble(gpa1TextView.getText().toString());
        gpa2 = Double.parseDouble(gpa2TextView.getText().toString());
        gpa3 = Double.parseDouble(gpa3TextView.getText().toString());
        gpa4 = Double.parseDouble(gpa4TextView.getText().toString());
        gpa5 = Double.parseDouble(gpa5TextView.getText().toString());
        gpa6 = Double.parseDouble(gpa6TextView.getText().toString());
        gpa7 = Double.parseDouble(gpa7TextView.getText().toString());
        gpa8 = Double.parseDouble(gpa8TextView.getText().toString());
    }

    public void writeNewUser(String userID, String letterGrade, Double numberGrade1, Double numberGrade2, Double gpaValue)
    {
        Scale scale = new Scale(letterGrade, numberGrade1, numberGrade2, gpaValue);

        gradeScaleDatabase.child("gradeScale").child(userID).setValue(scale);

        Toast.makeText(getActivity(), "Added Grade Scale", Toast.LENGTH_LONG).show();
    }

}
