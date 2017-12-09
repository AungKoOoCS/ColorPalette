package me.aungkooo.colorpalette.adapter;


import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


import me.aungkooo.colorpalette.listener.OnItemClickListener;
import me.aungkooo.colorpalette.model.Color;
import me.aungkooo.colorpalette.R;
import me.aungkooo.colorpalette.viewholder.MainViewHolder;


public class MainAdapter extends RecyclerAdapter<MainViewHolder, Color>
{
    public MainAdapter(Context context, ArrayList<Color> itemList) {
        super(context, itemList);
    }

    @Override
    public MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.item_main, parent, false);

        return new MainViewHolder(view, getContext());
    }

    @Override
    public void onBindViewHolder(final MainViewHolder holder, int position)
    {
        Color item = getItemList().get(holder.getAdapterPosition());

        holder.onBind(item);
    }
}
