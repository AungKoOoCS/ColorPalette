package me.aungkooo.colorpalette.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import java.util.ArrayList;

import me.aungkooo.colorpalette.R;
import me.aungkooo.colorpalette.model.Color;
import me.aungkooo.colorpalette.viewholder.ColorViewHolder;

public class ColorAdapter extends RecyclerAdapter<ColorViewHolder, Color>
{

    public ColorAdapter(Context context, ArrayList<Color> itemList) {
        super(context, itemList);
    }

    @Override
    public ColorViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.item_color, parent, false);

        return new ColorViewHolder(view, getContext());
    }

    @Override
    public void onBindViewHolder(ColorViewHolder holder, int position)
    {
        Color item = getItemList().get(holder.getAdapterPosition());
        holder.onBind(item);
    }
}
