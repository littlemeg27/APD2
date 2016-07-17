package com.example.ravenmargret.academia;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class FinishedListActivity extends AppCompatActivity
{
    FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finished_list);

        manager = getFragmentManager();

        FinishedListFragment finishedListFragment = new FinishedListFragment();
        showFragment(finishedListFragment);
    }

    private void showFragment(Fragment finishedListFrag)
    {
        manager.beginTransaction().replace(R.id.container, finishedListFrag, "finishedListFrag").commit();
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
