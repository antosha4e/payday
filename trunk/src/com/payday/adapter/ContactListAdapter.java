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
public class ContactListAdapter extends ArrayAdapter<String> {
    private final Context context;
    private final String[] values;

    public ContactListAdapter(Context context, String[] values) {
        super(context, R.layout.orders_list_item, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.orders_list_item, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.textView);
        textView.setText(values[position]);
        TextView textView1 = (TextView) rowView.findViewById(R.id.textView1);
        textView1.setText(getSum());


//        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
//        textView.setText(values[position]);
////        Change the icon for Windows and iPhone
//        String s = values[position];
//        if (s.startsWith("iPhone")) {
//            imageView.setImageResource(R.drawable.no);
//        } else {
//            imageView.setImageResource(R.drawable.ok);
//        }

        return rowView;
    }

    private String getSum() {
        return (int)(Math.random() * 1000) + " руб.";
    }
}