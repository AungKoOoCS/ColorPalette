package me.aungkooo.colorpalette.viewholder;


import android.content.Context;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import me.aungkooo.colorpalette.R;
import me.aungkooo.colorpalette.model.Color;

public class ColorViewHolder extends RecyclerViewHolder<Color>
{
    private CardView rectangleColor;
    private TextView txtColorDensity, txtColorCode;

    public ColorViewHolder(View itemView, Context context)
    {
        super(itemView, context);
        rectangleColor = (CardView) itemView.findViewById(R.id.rectangle_color);
        txtColorDensity = (TextView) itemView.findViewById(R.id.txt_color_density);
        txtColorCode = (TextView) itemView.findViewById(R.id.txt_color_code);
    }

    @Override
    public void onBind(Color item) {
        String colorCode = "#" + getContext().getString(item.getRectangleColor()).toUpperCase().substring(3);

        rectangleColor.setCardBackgroundColor(getContext().getColor(item.getRectangleColor()));
        txtColorDensity.setText(item.getColorDensity());
        txtColorDensity.setTextColor(getContext().getColor(item.getTxtColor()));
        txtColorCode.setText(colorCode);
        txtColorCode.setTextColor(getContext().getColor(item.getTxtColor()));
    }
}
