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

public class OnGoingListActivity extends AppCompatActivity implements OnGoingListFragment.OnListFragmentInteractionListener
{
    FragmentManager manager;
    private BottomBar mBottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_going_list);

        manager = getFragmentManager();

        OnGoingListFragment onGoingListFragment = new OnGoingListFragment();
        showFragment(onGoingListFragment);

        mBottomBar = BottomBar.attach(this, savedInstanceState);
        mBottomBar.setItems(R.menu.bottombar_menu);
        mBottomBar.setOnMenuTabClickListener(listenerObject2);

        mBottomBar.mapColorForTab(0, "#757575");
        mBottomBar.mapColorForTab(1, "#757575");
        mBottomBar.mapColorForTab(2, "#757575");
        mBottomBar.mapColorForTab(3, "#757575");
        mBottomBar.noTopOffset();
    }

    OnMenuTabClickListener listenerObject2 = new OnMenuTabClickListener()
    {
        @Override
        public void onMenuTabSelected(@IdRes int menuItemId) {
            if (menuItemId == R.id.action_home) {
                Intent homeIntent = new Intent(OnGoingListActivity.this, HomeActivity.class);
                startActivity(homeIntent);
            } else if (menuItemId == R.id.action_finished) {
                Intent finishedIntent = new Intent(OnGoingListActivity.this, FinishedListActivity.class);
                startActivity(finishedIntent);
            } else if (menuItemId == R.id.action_grade_scale) {
                Intent gradeScaleIntent = new Intent(OnGoingListActivity.this, GradeScaleActivity.class);
                startActivity(gradeScaleIntent);
            }
        }

        @Override
        public void onMenuTabReSelected(@IdRes int menuItemId) {
            if (menuItemId == R.id.action_home) {
                Intent homeIntent2 = new Intent(OnGoingListActivity.this, HomeActivity.class);
                startActivity(homeIntent2);
            } else if (menuItemId == R.id.action_finished) {
                Intent finishedIntent2 = new Intent(OnGoingListActivity.this, FinishedListActivity.class);
                startActivity(finishedIntent2);
            } else if (menuItemId == R.id.action_grade_scale) {
                Intent gradeScaleIntent2 = new Intent(OnGoingListActivity.this, GradeScaleActivity.class);
                startActivity(gradeScaleIntent2);
            }
        }
    };

    private void showFragment(Fragment onGoingListFrag)
    {
        manager.beginTransaction().replace(R.id.container, onGoingListFrag, "onGoingListFrag").commit();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
