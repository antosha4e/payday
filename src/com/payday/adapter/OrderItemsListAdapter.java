package com.payday.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.example.PayDay.R;

/**
 * User: antosha
 * Date: 2/11/14
 */
public class OrderItemsListAdapter extends ArrayAdapter<String> {
    private final Context context;
    private final String[] values;

    public OrderItemsListAdapter(Context context, String[] values) {
        super(context, R.layout.new_order_list_item, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.new_order_list_item, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.nameTextView);
        textView.setText(values[position]);
        TextView textView1 = (TextView) rowView.findViewById(R.id.sumTextView);
        textView1.setText(getSum());

        return rowView;
    }

    private String getSum() {
        return (int)(Math.random() * 100) + " руб.";
    }
}