package com.example.ravenmargret.academia;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.BottomBarTab;
import com.roughike.bottombar.OnMenuTabClickListener;
import com.roughike.bottombar.OnTabClickListener;

public class AddFinishedActivity extends AppCompatActivity
{
    FragmentManager manager;
    private BottomBar mBottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_finished);

        manager = getFragmentManager();

        AddFinishedFragment addFinishedFragment = new AddFinishedFragment();
        showFragment(addFinishedFragment);

        mBottomBar = BottomBar.attach(this, savedInstanceState);
        mBottomBar.setItems(R.menu.bottombar_menu);
        mBottomBar.setOnMenuTabClickListener(new OnMenuTabClickListener()
        {
            @Override
            public void onMenuTabSelected(@IdRes int menuItemId)
            {
                if (menuItemId == R.id.action_house)
                {
                    // The user selected item number one.
                }
            }

            @Override
            public void onMenuTabReSelected(@IdRes int menuItemId)
            {
                if (menuItemId == R.id.action_house)
                {
                    // The user reselected item number one, scroll your content to top.
                }
            }
        });

//        @Override
//        protected void onSaveInstanceState(Bundle outstate)
//        {
//            super.onSaveInstanceState(outState);
//            mBottomBar.onSaveInstanceState(outState);
//        }

        // Setting colors for different tabs when there's more than three of them.
        // You can set colors for tabs in three different ways as shown below.
//        mBottomBar.mapColorForTab(0, ContextCompat.getColor(this, R.color.colorAccent));
//        mBottomBar.mapColorForTab(1, 0xFF5D4037);
//        mBottomBar.mapColorForTab(2, "#7B1FA2");
//        mBottomBar.mapColorForTab(3, "#FF5252");
//        mBottomBar.mapColorForTab(4, "#FF9800");

    }



    private void showFragment(Fragment addFinishedFrag)
    {
        manager.beginTransaction().replace(R.id.container, addFinishedFrag, "addFinishedFrag").commit();
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
