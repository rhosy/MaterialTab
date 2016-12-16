package com.ronggosukowati.materialtab.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.ronggosukowati.materialtab.fragment.Tab1Fragment;
import com.ronggosukowati.materialtab.fragment.Tab2Fragment;

/**
 * Created by ronggosukowati on 16/10/16.
 */

public class TabFragmentPagerAdapter extends FragmentPagerAdapter {

    //Nama Tab
    String [] title = new String[] {
            "Tab 1", "Tab 2"
    };

    public TabFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0 :
                fragment = new Tab1Fragment();
                break;
            case 1 :
                fragment = new Tab2Fragment();
                break;
            default:
                fragment = null;
        }
        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }

    @Override
    public int getCount() {
        return title.length;
    }
}
