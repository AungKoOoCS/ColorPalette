package me.aungkooo.colorpalette.viewholder;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import me.aungkooo.colorpalette.listener.OnItemClickListener;


public abstract class RecyclerViewHolder<OBJ> extends RecyclerView.ViewHolder
{
    private Context context;
    private View view;

    public RecyclerViewHolder(View itemView, Context context) {
        super(itemView);
        this.view = itemView;
        this.context = context;
    }

    public Context getContext() {
        return context;
    }

    public View getView() {
        return view;
    }

    public abstract void onBind(OBJ item);
}
