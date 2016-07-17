package com.example.ravenmargret.academia;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class OnGoingListActivity extends AppCompatActivity
{

    FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_going_list);

        manager = getFragmentManager();

        OnGoingListFragment onGoingListFragment = new OnGoingListFragment();
        showFragment(onGoingListFragment);
    }

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
