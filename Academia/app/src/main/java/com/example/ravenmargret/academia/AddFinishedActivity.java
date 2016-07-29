package com.example.ravenmargret.academia;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.BottomBarTab;
import com.roughike.bottombar.OnMenuTabClickListener;
import com.roughike.bottombar.OnTabClickListener;

public class AddFinishedActivity extends AppCompatActivity
{
    FragmentManager manager;
    String cid;
    String name;
    Double weight;
    Double grade;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_finished);

        manager = getFragmentManager();

        AddFinishedFragment addFinishedFragment = new AddFinishedFragment();
        showFragment(addFinishedFragment);
    }

    private void showFragment(Fragment addFinishedFrag)
    {
        manager.beginTransaction().replace(R.id.container, addFinishedFrag, "addFinishedFrag").commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.add_finished_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_save_finished)
        {
            AddFinishedFragment fragment = (AddFinishedFragment) getFragmentManager().findFragmentById(R.id.container);
            fragment.writeNewUser(cid, name, weight, grade);

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
