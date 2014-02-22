package com.payday.activity;

import android.app.Activity;
import android.os.Bundle;
import com.example.PayDay.R;

/**
 * User: antosha
 * Date: 2/22/14
 */
public class NewOrderActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Remove title bar
//        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.main_activity);

        // Initilization
        //viewPager = (ViewPager) findViewById(R.id.pager);
    }
}
