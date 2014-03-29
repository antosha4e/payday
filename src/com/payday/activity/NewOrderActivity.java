package com.payday.activity;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import com.example.PayDay.R;
import com.payday.adapter.OrderItemsListAdapter;
import com.payday.adapter.OrderListAdapter;

/**
 * User: antosha
 * Date: 2/22/14
 */
public class NewOrderActivity extends Activity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Remove title bar
//        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.new_order_activity);

        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


        View rootView = findViewById(android.R.id.content);
        listView = (ListView) rootView.findViewById(R.id.listView);

        View header = getLayoutInflater().inflate(R.layout.new_order_header, null);
        View footer = getLayoutInflater().inflate(R.layout.new_order_footer, null);

        //listView.addHeaderView(header);
        //listView.addFooterView(footer);

        String[] names = { "Anton", "Ura", "Valera"};
        ArrayAdapter<String> adapter = new OrderItemsListAdapter(this, names);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(parent.getContext(), "Click ListItem Number " + position, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
