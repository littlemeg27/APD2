package com.example.ravenmargret.academia;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabClickListener;

public class FinishedListActivity extends AppCompatActivity implements FinishedListFragment.OnListFragmentInteractionListener
{
    FragmentManager manager;
    private BottomBar mBottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finished_list);

        manager = getFragmentManager();

        FinishedListFragment finishedListFragment = new FinishedListFragment();
        showFragment(finishedListFragment);

//        mBottomBar = BottomBar.attach(this, savedInstanceState);
//        mBottomBar.setItems(R.menu.bottombar_menu);
//        mBottomBar.setOnMenuTabClickListener(listenerObject3);
//
//        mBottomBar.mapColorForTab(0, "#757575");
//        mBottomBar.mapColorForTab(1, "#757575");
//        mBottomBar.mapColorForTab(2, "#757575");
//        mBottomBar.mapColorForTab(3, "#757575");
//        mBottomBar.noTopOffset();
    }

//    OnMenuTabClickListener listenerObject3 = new OnMenuTabClickListener()
//    {
//        @Override
//        public void onMenuTabSelected(@IdRes int menuItemId)
//        {
//            if (menuItemId == R.id.action_on_going)
//            {
//                Intent onGoingIntent = new Intent(FinishedListActivity.this, OnGoingListActivity.class);
//                startActivity(onGoingIntent);
//            }
//            else if (menuItemId == R.id.action_home)
//            {
//                Intent homeIntent = new Intent(FinishedListActivity.this, HomeActivity.class);
//                startActivity(homeIntent);
//            }
//            else if (menuItemId == R.id.action_grade_scale)
//            {
//                Intent gradeScaleIntent = new Intent(FinishedListActivity.this, GradeScaleActivity.class);
//                startActivity(gradeScaleIntent);
//            }
//        }
//
//        @Override
//        public void onMenuTabReSelected(@IdRes int menuItemId)
//        {
//            if (menuItemId == R.id.action_home)
//            {
//                Intent homeIntent2 = new Intent(FinishedListActivity.this, HomeActivity.class);
//                startActivity(homeIntent2);
//            }
//            else if (menuItemId == R.id.action_on_going)
//            {
//                Intent finishedIntent2 = new Intent(FinishedListActivity.this, OnGoingListActivity.class);
//                startActivity(finishedIntent2);
//            }
//            else if (menuItemId == R.id.action_grade_scale)
//            {
//                Intent gradeScaleIntent2 = new Intent(FinishedListActivity.this, GradeScaleActivity.class);
//                startActivity(gradeScaleIntent2);
//            }
//        }
//    };

    private void showFragment(Fragment finishedListFrag)
    {
        manager.beginTransaction().replace(R.id.container, finishedListFrag, "finishedListFrag").commit();
    }

//    @Override
//    protected void onSaveInstanceState(Bundle outState)
//    {
//        super.onSaveInstanceState(outState);
//        mBottomBar.onSaveInstanceState(outState);
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item)
//    {
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings)
//        {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}
