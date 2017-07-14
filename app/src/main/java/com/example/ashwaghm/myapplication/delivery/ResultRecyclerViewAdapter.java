package com.example.ashwaghm.myapplication.delivery;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.ashwaghm.myapplication.R;
import com.example.ashwaghm.myapplication.dummy.Student;
import com.example.ashwaghm.myapplication.dummy.StudentResult;

import java.util.List;

/**
 * Created by ashwaghm on 09-Jul-17.
 */

public class ResultRecyclerViewAdapter extends RecyclerView.Adapter<ResultRecyclerViewAdapter.ResultDetailsViewHolder> {

    private final List<StudentResult> mValues;

    public ResultRecyclerViewAdapter(List<StudentResult> mValues) {
        this.mValues = mValues;
    }

    @Override
    public ResultDetailsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.result_card, parent, false);
        return new ResultRecyclerViewAdapter.ResultDetailsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ResultDetailsViewHolder holder, int position) {
        StudentResult studentResult = mValues.get(position);
        holder.mItem = studentResult;
        holder.mExamView.setText(studentResult.examName);
        ArrayAdapter adapter = new ScoreArrayAdapter(holder.mScores.getContext(), R.layout.score_line, studentResult.scoreList);
        holder.mScores.setAdapter(adapter);
        UIUtils.setListViewHeightBasedOnItems(holder.mScores);
        adapter.notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ResultDetailsViewHolder extends RecyclerView.ViewHolder {

        public final View mView;
        public final TextView mExamView;
        public final ListView mScores;
        public StudentResult mItem;


        public ResultDetailsViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            mExamView = (TextView) itemView.findViewById(R.id.exam);
            mScores = (ListView) itemView.findViewById(R.id.scores);

        }
    }
}
