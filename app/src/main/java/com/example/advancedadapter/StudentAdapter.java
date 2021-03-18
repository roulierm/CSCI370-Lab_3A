package com.example.advancedadapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class StudentAdapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater mInflator;
    private ArrayList<Student> mDataSource = new ArrayList<>();

    public StudentAdapter(Context mContext, ArrayList<Student> mDataSource) {
        mContext = mContext;
        mDataSource = mDataSource;
        mInflator = (LayoutInflater) mContext.getSystemService((Context.LAYOUT_INFLATER_SERVICE));

    }
    @Override
    public int getCount() {
        return mDataSource.size();

    }

    @Override
    public Object getItem(int i) {
        return mDataSource.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = mInflator.inflate(R.layout.list_view_row, parent, false);

        TextView lastNameView= rowView.findViewById(R.id.last_name);
        TextView firstNameView = rowView.findViewById(R.id.first_name);
        TextView majorView = rowView.findViewById(R.id.major);
        //TextView thumbnailView = rowView.findViewById(R.id.category_thumbnail);

        Student student = (Student) getItem(position);
        lastNameView.setText(student.getLastName());
        firstNameView.setText(student.getFirstName());
        majorView.setText(student.getMajor());



        return rowView;
    }


}
