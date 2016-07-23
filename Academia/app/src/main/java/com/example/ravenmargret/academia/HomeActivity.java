package com.example.ravenmargret.academia;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabClickListener;


public class HomeActivity extends AppCompatActivity
{
    FragmentManager manager;
    private BottomBar mBottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        manager = getFragmentManager();

        HomeFragment homeFragment = new HomeFragment();
        showFragment(homeFragment);

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
            if (menuItemId == R.id.action_on_going) {
                Intent onGoingIntent = new Intent(HomeActivity.this, OnGoingListActivity.class);
                startActivity(onGoingIntent);
            } else if (menuItemId == R.id.action_finished) {
                Intent finishedIntent = new Intent(HomeActivity.this, FinishedListActivity.class);
                startActivity(finishedIntent);
            } else if (menuItemId == R.id.action_grade_scale) {
                Intent gradeScaleIntent = new Intent(HomeActivity.this, GradeScaleActivity.class);
                startActivity(gradeScaleIntent);
            }
        }

        @Override
        public void onMenuTabReSelected(@IdRes int menuItemId) {
            if (menuItemId == R.id.action_on_going) {
                Intent onGoingIntent2 = new Intent(HomeActivity.this, OnGoingListActivity.class);
                startActivity(onGoingIntent2);
            } else if (menuItemId == R.id.action_finished) {
                Intent finishedIntent2 = new Intent(HomeActivity.this, FinishedListActivity.class);
                startActivity(finishedIntent2);
            } else if (menuItemId == R.id.action_grade_scale) {
                Intent gradeScaleIntent2 = new Intent(HomeActivity.this, GradeScaleActivity.class);
                startActivity(gradeScaleIntent2);
            }
        }
    };

    private void showFragment(Fragment homeFrag)
    {
        manager.beginTransaction().replace(R.id.container, homeFrag, "homeFrag").commit();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
        mBottomBar.onSaveInstanceState(outState);
    }
}
