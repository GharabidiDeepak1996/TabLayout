package com.example.tabswithicontext;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.text.GetChars;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
TabLayout tb;
ViewPager vp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        tb = findViewById( R.id.tablayout );
        vp = findViewById( R.id.viewpager );
        tb.setupWithViewPager( vp );

        List<String> name=new ArrayList<>(  );
        name.add( "one" );
        name.add("two");
        name.add("three");

        Myadapter md=new Myadapter(getSupportFragmentManager(),name );
        vp.setAdapter( md );
        setupTabIcons();
    }
    private void setupTabIcons() {
        tb.getTabAt( 0 ).setIcon( R.mipmap.ic_tab_favourite );
        tb.getTabAt( 1 ).setIcon( R.mipmap.ic_tab_call );
        tb.getTabAt( 2 ).setIcon( R.mipmap.ic_tab_contacts );
    }
}
