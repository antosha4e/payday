package com.payday.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import com.example.PayDay.R;
import com.payday.adapter.ContactListAdapter;
import com.payday.adapter.OrderListAdapter;

/**
 * User: antosha
 * Date: 2/9/14
 */
public class ContactsFragment extends Fragment {
    private ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_contacts, container, false);

        listView = (ListView) rootView.findViewById(R.id.listView);

        String[] names = { "Антон", "Валерыч", "Полосатый"};
        ArrayAdapter<String> adapter = new ContactListAdapter(this.getActivity(), names);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast tt = Toast.makeText(parent.getContext(), "Click ListItem Number " + position, Toast.LENGTH_LONG);
                tt.setDuration(0);
                tt.show();
            }
        });

        return rootView;
    }
}