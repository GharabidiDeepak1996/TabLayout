package com.example.tablayoutwithimages;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;


public class Myadapter extends FragmentStatePagerAdapter {
    public   List<String> mimage;

    public Myadapter(FragmentManager supportFragmentManager, List<String> image) {
        super(supportFragmentManager);
         mimage = image;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Tab1 tab1=new Tab1();
                return tab1;
            case 1:
                Tab2 tab2=new Tab2();
                return tab2;
            case 2:
                Tab3 tab3=new Tab3();
                return tab3;
                default:
                    return null;
        }

    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
                                       //we are nothing to display.
        return null;
    }

    @Override
    public int getCount() {
        return mimage.size();

    }
}
