package com.example.tab_layout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
TabLayout TL;
ViewPager VP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        TL = findViewById( R.id.TabLayout );
        VP = findViewById( R.id.ViewPager );
        TL.setupWithViewPager( VP );

        List<String> list=new ArrayList<>(  );
        list.add( "CHATS" );
        list.add("STATUS");
        list.add( "CALLS" );

       myAdapter  MA=new myAdapter( getSupportFragmentManager(),list );  //CONNECT MY myAdapter
        VP.setAdapter( MA );
    }
}
