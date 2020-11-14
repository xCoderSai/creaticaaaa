package com.example.newthingy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private String[] localDataSet;
    private LayoutInflater mInflater;

    public ListAdapter(Context context, String[] dataset) {
        mInflater = LayoutInflater.from(context);
        localDataSet = dataset;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.listing, parent, false);
        return new ViewHolder(view, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView.setText(localDataSet[position]);
    }

    @Override
    public int getItemCount() {
        return localDataSet.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView textView;
        final ListAdapter mAdapter;

        public ViewHolder(View view, ListAdapter adapter) {
            super(view);
            textView = (TextView)view.findViewById(R.id.textView);
            this.mAdapter = adapter;
        }
    }
}
