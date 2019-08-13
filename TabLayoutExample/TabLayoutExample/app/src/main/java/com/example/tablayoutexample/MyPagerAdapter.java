package com.example.tablayoutexample;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

public class MyPagerAdapter extends FragmentStatePagerAdapter {

    private List<String> mTabList;

    public MyPagerAdapter(FragmentManager fm, List<String> tabList) {
        super(fm);
        mTabList = tabList;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return  new FirstFragment();
        } else {
            return new SecondFragment();
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mTabList.get(position);
    }

    @Override
    public int getCount() {
        return mTabList.size();
    }
}
