package com.example.newthingy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private Facility[] localDataSet;
    private LayoutInflater mInflater;

    public ListAdapter(Context context, Facility[] dataset) {
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
        Facility curr = localDataSet[position];
        holder.text_place.setText(curr.name);
        holder.text_address.setText(curr.address);
        holder.text_cityState.setText(curr.getCityState());
    }

    @Override
    public int getItemCount() {
        return localDataSet.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView text_place;
        public final TextView text_address;
        public final TextView text_cityState;
        final ListAdapter mAdapter;

        public ViewHolder(View view, ListAdapter adapter) {
            super(view);

            text_place = (TextView)view.findViewById(R.id.text_place);
            text_address = (TextView)view.findViewById(R.id.text_address);
            text_cityState = (TextView)view.findViewById(R.id.text_cityState);
            this.mAdapter = adapter;
        }
    }
}
