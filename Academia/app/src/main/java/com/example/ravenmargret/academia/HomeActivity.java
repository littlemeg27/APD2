package com.example.ravenmargret.academia;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

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
        mBottomBar.setOnMenuTabClickListener(new OnMenuTabClickListener()
        {
            @Override
            public void onMenuTabSelected(@IdRes int menuItemId)
            {
                if (menuItemId == R.id.action_home)
                {
                    Intent homeIntent = new Intent(HomeActivity.this, HomeActivity.class);
                    startActivity(homeIntent);
                }
                else if(menuItemId == R.id.action_on_going)
                {
                    Intent onGoingIntent = new Intent(HomeActivity.this, OnGoingListActivity.class);
                    startActivity(onGoingIntent);
                }
                else if (menuItemId == R.id.action_finished)
                {
                    Intent finishedIntent = new Intent(HomeActivity.this, FinishedListActivity.class);
                    startActivity(finishedIntent);
                }
                else if (menuItemId == R.id.action_grade_scale)
                {
                    Intent gradeScaleIntent = new Intent(HomeActivity.this, GradeScaleActivity.class);
                    startActivity(gradeScaleIntent);
                }
            }

            @Override
            public void onMenuTabReSelected(@IdRes int menuItemId)
            {
                if (menuItemId == R.id.action_home)
                {
                    Intent homeIntent2 = new Intent(HomeActivity.this, HomeActivity.class);
                    startActivity(homeIntent2);
                }
                else if(menuItemId == R.id.action_on_going)
                {
                    Intent onGoingIntent2 = new Intent(HomeActivity.this, OnGoingListActivity.class);
                    startActivity(onGoingIntent2);
                }
                else if (menuItemId == R.id.action_finished)
                {
                    Intent finishedIntent2 = new Intent(HomeActivity.this, FinishedListActivity.class);
                    startActivity(finishedIntent2);
                }
                else if (menuItemId == R.id.action_grade_scale)
                {
                    Intent gradeScaleIntent2 = new Intent(HomeActivity.this, GradeScaleActivity.class);
                    startActivity(gradeScaleIntent2);
                }
            }
        });

//        mBottomBar = BottomBar.attachShy((CoordinatorLayout) findViewById(R.id.myCoordinator),
//                findViewById(R.id.myScrollingContent), savedInstanceState);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
        mBottomBar.onSaveInstanceState(outState);
    }

    private void showFragment(Fragment homeFrag)
    {
        manager.beginTransaction().replace(R.id.container, homeFrag, "homeFrag").commit();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
