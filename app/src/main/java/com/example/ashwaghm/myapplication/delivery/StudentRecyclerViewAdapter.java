package com.example.ashwaghm.myapplication.delivery;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ashwaghm.myapplication.R;
import com.example.ashwaghm.myapplication.StudentDetailActivity;
import com.example.ashwaghm.myapplication.StudentDetailFragment;
import com.example.ashwaghm.myapplication.model.Student;

import java.util.List;

/**
 * Created by ashwaghm on 09-Jul-17.
 */

public class StudentRecyclerViewAdapter
        extends RecyclerView.Adapter<StudentRecyclerViewAdapter.StudentSummaryViewHolder> {

    private final List<Student> mValues;
    private final Context mContext;
    private final boolean mTwoPane;

    public StudentRecyclerViewAdapter(Context context, boolean twoPane, List<Student> items) {
        mValues = items;
        mContext = context;
        mTwoPane = twoPane;
    }

    @Override
    public StudentSummaryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.student_list_content, parent, false);
        return new StudentSummaryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final StudentSummaryViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        //holder.mIdView.setText(mValues.get(position).id);
        holder.mContentView.setText(mValues.get(position).content);
        holder.mDetailsView.setText(mValues.get(position).details);

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mTwoPane) {
                    Bundle arguments = new Bundle();
                    arguments.putString(StudentDetailFragment.ARG_ITEM_ID, holder.mItem.id);
                    StudentDetailFragment fragment = new StudentDetailFragment();
                    fragment.setArguments(arguments);

                    ((FragmentActivity) mContext).getSupportFragmentManager().beginTransaction()
                            .replace(R.id.student_detail_container, fragment)
                            .commit();
                } else {
                    Context context = v.getContext();
                    Intent intent = new Intent(context, StudentDetailActivity.class);
                    intent.putExtra(StudentDetailFragment.ARG_ITEM_ID, holder.mItem.id);
                    context.startActivity(intent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class StudentSummaryViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        //public final TextView mIdView;
        public final TextView mContentView;
        public final TextView mDetailsView;
        public Student mItem;

        public StudentSummaryViewHolder(View view) {
            super(view);
            mView = view;
            // mIdView = (TextView) view.findViewById(R.id.id);
            mContentView = (TextView) view.findViewById(R.id.content);
            mDetailsView = (TextView) view.findViewById(R.id.details);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }
}

