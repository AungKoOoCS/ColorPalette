package me.aungkooo.colorpalette;


import android.content.Context;
import android.graphics.Typeface;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class Utility
{
    public static void showDialog(AppCompatActivity appCompatActivity, DialogFragment fragment)
    {
        fragment.show(appCompatActivity.getSupportFragmentManager(), null);
    }

    public static Typeface setTypeface(Context context, String fontPath)
    {
        return Typeface.createFromAsset(context.getAssets(), fontPath);
    }

    public static void setTypeface(Context context, CollapsingToolbarLayout toolbarLayout, String fontPath)
    {
        Typeface typeface = Typeface.createFromAsset(context.getAssets(), fontPath);
        toolbarLayout.setExpandedTitleTypeface(typeface);
        toolbarLayout.setCollapsedTitleTypeface(typeface);
    }
}
