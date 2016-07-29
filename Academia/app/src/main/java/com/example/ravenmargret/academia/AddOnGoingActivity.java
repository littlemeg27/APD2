package com.example.ravenmargret.academia;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabClickListener;

public class AddOnGoingActivity extends AppCompatActivity
{
    FragmentManager manager;
    private BottomBar mBottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_on_going);

        manager = getFragmentManager();

        AddOnGoingFragment addOnGoingFragment = new AddOnGoingFragment();
        showFragment(addOnGoingFragment);
    }

    private void showFragment(Fragment addOnGoingFrag)
    {
        manager.beginTransaction().replace(R.id.container, addOnGoingFrag, "addOnGoingFrag").commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.on_going_add_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_save_on_going)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
