package com.example.tab_layout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

public class myAdapter extends FragmentStatePagerAdapter {

    private  List<String> List1;

    public myAdapter(FragmentManager fm, List<String> List) {
        super( fm );
        List1=List;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Fragment1 fg1 = new Fragment1();
                return fg1;
            case 1:
                Fragment2 fg2=new Fragment2();
                return fg2;
            case 2:
                Fragment3 fg3=new Fragment3();
                return fg3;
                default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return List1.get( position );
    }
    @Override
    public int getCount() {
        return List1.size();
    }
}
