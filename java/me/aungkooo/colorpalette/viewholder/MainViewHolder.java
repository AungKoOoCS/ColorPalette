package me.aungkooo.colorpalette.viewholder;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import me.aungkooo.colorpalette.DetailActivity;
import me.aungkooo.colorpalette.R;
import me.aungkooo.colorpalette.listener.OnItemClickListener;
import me.aungkooo.colorpalette.model.Color;


public class MainViewHolder extends RecyclerViewHolder<Color> implements OnItemClickListener<Color>
{
    private View rectangle;
    private TextView txtColorName, txtColorCode;

    public MainViewHolder(View itemView, Context context)
    {
        super(itemView, context);
        rectangle = itemView.findViewById(R.id.rectangle);
        txtColorName = (TextView) itemView.findViewById(R.id.txt_color_name);
        txtColorCode = (TextView) itemView.findViewById(R.id.txt_main_color_code);
    }

    @Override
    public void onBind(final Color item)
    {
        String colorCode = "#" + getContext().getString(item.getRectangleColor()).toUpperCase().substring(3);

        rectangle.setBackgroundTintList(getContext().getColorStateList(item.getRectangleColor()));
        txtColorName.setText(getContext().getString(item.getColorName()));
        txtColorName.setTextColor(getContext().getColor(item.getRectangleColor()));
        txtColorCode.setText(colorCode);
        txtColorCode.setTextColor(getContext().getColor(item.getRectangleColor()));

        getView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClick(item);
            }
        });
    }

    @Override
    public void onItemClick(Color item)
    {
        Intent intent = new Intent(getContext(), DetailActivity.class);
        intent.putExtra(getContext().getString(R.string.rectangle_color_value),
                getContext().getString(item.getColorName()));

        ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation(
                (Activity) getContext(),
                rectangle,
                getContext().getString(R.string.transition_rectangle)

        );

        if(intent.resolveActivity(getContext().getPackageManager()) != null) {
            getContext().startActivity(intent, activityOptions.toBundle());
        }
    }
}
