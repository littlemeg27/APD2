package com.example.ravenmargret.academia;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabClickListener;

public class GradeScaleActivity extends AppCompatActivity
{
    FragmentManager manager;
    private BottomBar mBottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade_scale);

        manager = getFragmentManager();

        GradeScaleFragment gradeScaleFragment = new GradeScaleFragment();
        showFragment(gradeScaleFragment);

        mBottomBar = BottomBar.attach(this, savedInstanceState);
        mBottomBar.setItems(R.menu.bottombar_menu);
        mBottomBar.setOnMenuTabClickListener(listenerobject);


        mBottomBar.mapColorForTab(0, "#757575");
        mBottomBar.mapColorForTab(1, "#757575");
        mBottomBar.mapColorForTab(2, "#757575");
        mBottomBar.mapColorForTab(3, "#757575");
        mBottomBar.noTopOffset();
        mBottomBar.setActiveTabColor("#009688");
    }

    OnMenuTabClickListener listenerobject = new OnMenuTabClickListener()
    {
        @Override
        public void onMenuTabSelected(@IdRes int menuItemId) {
            if (menuItemId == R.id.action_home) {
                Intent onGoingIntent = new Intent(GradeScaleActivity.this, HomeActivity.class);
                startActivity(onGoingIntent);
            } else if (menuItemId == R.id.action_finished) {
                Intent finishedIntent = new Intent(GradeScaleActivity.this, FinishedListActivity.class);
                startActivity(finishedIntent);
            } else if (menuItemId == R.id.action_on_going) {
                Intent gradeScaleIntent = new Intent(GradeScaleActivity.this, OnGoingListActivity.class);
                startActivity(gradeScaleIntent);
            }
        }

        @Override
        public void onMenuTabReSelected(@IdRes int menuItemId) {
            if (menuItemId == R.id.action_home) {
                Intent onGoingIntent2 = new Intent(GradeScaleActivity.this, HomeActivity.class);
                startActivity(onGoingIntent2);
            } else if (menuItemId == R.id.action_finished) {
                Intent finishedIntent2 = new Intent(GradeScaleActivity.this, FinishedListActivity.class);
                startActivity(finishedIntent2);
            } else if (menuItemId == R.id.action_on_going) {
                Intent gradeScaleIntent2 = new Intent(GradeScaleActivity.this, OnGoingListActivity.class);
                startActivity(gradeScaleIntent2);
            }
        }
    };

    private void showFragment(Fragment gradeScaleFrag)
    {
        manager.beginTransaction().replace(R.id.container, gradeScaleFrag, "gradeScaleFrag").commit();
    }
}
