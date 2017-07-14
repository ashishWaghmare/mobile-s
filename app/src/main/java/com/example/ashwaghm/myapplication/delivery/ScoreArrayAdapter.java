package com.example.ashwaghm.myapplication.delivery;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.ashwaghm.myapplication.R;
import com.example.ashwaghm.myapplication.model.Score;

import java.util.List;

/**
 * Created by ashwaghm on 09-Jul-17.
 */

public class ScoreArrayAdapter extends ArrayAdapter<Score> {
    public ScoreArrayAdapter(@NonNull Context context, @LayoutRes int resource, List<Score> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.score_line, parent, false);

        }
        TextView display = (TextView) convertView.findViewById(R.id.score_display);
        display.setText(getItem(position).pretty());
        return convertView;
    }
}
