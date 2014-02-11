package com.payday.activity;

import android.app.ActionBar;
import android.app.Activity;
import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;
import com.example.PayDay.R;

public class TabbedActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.main_test);

        final ActionBar bar = getActionBar();
        bar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        bar.setDisplayOptions(0, ActionBar.DISPLAY_SHOW_TITLE);

//        bar.addTab(bar.newTab()
//                .setText("Simple")
//                .setTabListener(new TabListener<FragmentStack.CountingFragment>(
//                        this, "simple", FragmentStack.CountingFragment.class)));
    }
}
