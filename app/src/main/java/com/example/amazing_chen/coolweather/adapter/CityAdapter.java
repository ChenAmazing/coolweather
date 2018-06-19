package com.example.amazing_chen.coolweather.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.amazing_chen.coolweather.R;

import java.util.List;

/**
 * Created by Amazing_Chen on 2018/6/12.
 */

public class CityAdapter extends RecyclerView.Adapter<CityAdapter.ViewHolder> {

    private final List<String> mdataList;

    static class ViewHolder extends RecyclerView.ViewHolder{

        private final Button cityName;

        public ViewHolder(View itemView) {
            super(itemView);
            cityName = (Button) itemView.findViewById(R.id.bt_city);
        }
    }

    public CityAdapter(List<String> dataList){
        mdataList = dataList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.city_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String city = mdataList.get(position);
        holder.cityName.setText(city);
    }

    @Override
    public int getItemCount() {
        return mdataList.size();
    }
}
