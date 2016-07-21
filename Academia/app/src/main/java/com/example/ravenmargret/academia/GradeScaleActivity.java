package com.example.ravenmargret.academia;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class GradeScaleActivity extends AppCompatActivity
{
    FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade_scale);

        manager = getFragmentManager();

        GradeScaleFragment gradeScaleFragment = new GradeScaleFragment();
        showFragment(gradeScaleFragment);
    }

    private void showFragment(Fragment gradeScaleFrag)
    {
        manager.beginTransaction().replace(R.id.container, gradeScaleFrag, "gradeScaleFrag").commit();
    }
}
