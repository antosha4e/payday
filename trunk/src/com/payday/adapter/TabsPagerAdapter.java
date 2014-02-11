package com.payday.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.payday.fragment.ContactsFragment;
import com.payday.fragment.OrderFragment;

/**
 * User: antosha
 * Date: 2/8/14
 */
public class TabsPagerAdapter extends FragmentPagerAdapter {
    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {
        switch (index) {
            case 0:
                // Top Rated fragment activity
                return new OrderFragment();
            case 1:
                // Games fragment activity
                return new ContactsFragment();
//            case 2:
//                Movies fragment activity
//                return new MoviesFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
