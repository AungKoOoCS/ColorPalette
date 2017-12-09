package me.aungkooo.colorpalette;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.ButterKnife;
import me.aungkooo.colorpalette.adapter.ColorAdapter;
import me.aungkooo.colorpalette.model.Color;


public class DetailActivity extends AppCompatActivity
{
    private Toolbar toolbar;
    private RecyclerView recyclerColorAccent, recyclerColorOther;
    private TextView txtColorDensityPrimary, txtColorCodePrimary,
            txtColorDensityPrimaryDark, txtColorCodePrimaryDark;
    private CardView rectangleLongDark;
    private View rectangleLong;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        toolbar = (Toolbar) findViewById(R.id.toolbar_detail);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        String color = intent.getStringExtra(getString(R.string.rectangle_color_value));

        if(getSupportActionBar() != null)
        {
            getSupportActionBar().setTitle(color);
        }

        recyclerColorAccent = ButterKnife.findById(this, R.id.recycler_color_accent);
        recyclerColorOther = ButterKnife.findById(this, R.id.recycler_color_other);
        TextView txtAccent = ButterKnife.findById(this, R.id.txt_accent);
        txtColorCodePrimary = ButterKnife.findById(this, R.id.txt_color_code_primary);
        txtColorDensityPrimary = ButterKnife.findById(this, R.id.txt_color_density_primary);
        txtColorCodePrimaryDark = ButterKnife.findById(this, R.id.txt_color_code_primary_dark);
        txtColorDensityPrimaryDark = ButterKnife.findById(this, R.id.txt_color_density_primary_dark);

        rectangleLong = findViewById(R.id.rectangle_long);
        rectangleLongDark = ButterKnife.findById(this, R.id.rectangle_long_dark);

        int white = R.color.white, black = R.color.black;

        switch (color)
        {
            case "Red":
                setupRecyclerColorAccent(
                        R.color.red_accent_1, black,
                        R.color.red_accent_2, white,
                        R.color.red_accent_3, white,
                        R.color.red_accent_4, white
                );
                setupRecyclerOtherColor(
                        R.color.red_0, black,
                        R.color.red_1, black,
                        R.color.red_2, black,
                        R.color.red_3, black,
                        R.color.red_4, white,
                        R.color.red_5, white,
                        R.color.red_6, white,
                        R.color.red_7, white,
                        R.color.red_8, white,
                        R.color.red_9, white
                );
                setThemeColor(R.color.red, R.color.red_dark, white, white);
                break;

            case "Pink":
                setupRecyclerColorAccent(
                        R.color.pink_accent_1, black,
                        R.color.pink_accent_2, white,
                        R.color.pink_accent_3, white,
                        R.color.pink_accent_4, white
                );
                setupRecyclerOtherColor(
                        R.color.pink_0, black,
                        R.color.pink_1, black,
                        R.color.pink_2, black,
                        R.color.pink_3, white,
                        R.color.pink_4, white,
                        R.color.pink_5, white,
                        R.color.pink_6, white,
                        R.color.pink_7, white,
                        R.color.pink_8, white,
                        R.color.pink_9, white
                );
                setThemeColor(R.color.pink, R.color.pink_dark, white, white);
                break;

            case "Purple":
                setupRecyclerColorAccent(
                        R.color.purple_accent_1, black,
                        R.color.purple_accent_2, white,
                        R.color.purple_accent_3, white,
                        R.color.purple_accent_4, white
                );
                setupRecyclerOtherColor(
                        R.color.purple_0, black,
                        R.color.purple_1, black,
                        R.color.purple_2, black,
                        R.color.purple_3, white,
                        R.color.purple_4, white,
                        R.color.purple_5, white,
                        R.color.purple_6, white,
                        R.color.purple_7, white,
                        R.color.purple_8, white,
                        R.color.purple_9, white
                );
                setThemeColor(R.color.purple, R.color.purple_dark, white, white);
                break;

            case "Deep Purple":
                setupRecyclerColorAccent(
                        R.color.purple_deep_accent_1, black,
                        R.color.purple_deep_accent_2, white,
                        R.color.purple_deep_accent_3, white,
                        R.color.purple_deep_accent_4, white
                );
                setupRecyclerOtherColor(
                        R.color.purple_deep_0, black,
                        R.color.purple_deep_1, black,
                        R.color.purple_deep_2, black,
                        R.color.purple_deep_3, white,
                        R.color.purple_deep_4, white,
                        R.color.purple_deep_5, white,
                        R.color.purple_deep_6, white,
                        R.color.purple_deep_7, white,
                        R.color.purple_deep_8, white,
                        R.color.purple_deep_9, white
                );
                setThemeColor(R.color.purple_deep, R.color.purple_deep_dark, white, white);
                break;

            case "Indigo":
                setupRecyclerColorAccent(
                        R.color.indigo_accent_1, black,
                        R.color.indigo_accent_2, white,
                        R.color.indigo_accent_3, white,
                        R.color.indigo_accent_4, white
                );
                setupRecyclerOtherColor(
                        R.color.indigo_0, black,
                        R.color.indigo_1, black,
                        R.color.indigo_2, black,
                        R.color.indigo_3, white,
                        R.color.indigo_4, white,
                        R.color.indigo_5, white,
                        R.color.indigo_6, white,
                        R.color.indigo_7, white,
                        R.color.indigo_8, white,
                        R.color.indigo_9, white
                );
                setThemeColor(R.color.indigo, R.color.indigo_dark, white, white);
                break;

            case "Blue":
                setupRecyclerColorAccent(
                        R.color.blue_accent_1, black,
                        R.color.blue_accent_2, white,
                        R.color.blue_accent_3, white,
                        R.color.blue_accent_4, white
                );
                setupRecyclerOtherColor(
                        R.color.blue_0, black,
                        R.color.blue_1, black,
                        R.color.blue_2, black,
                        R.color.blue_3, black,
                        R.color.blue_4, black,
                        R.color.blue_5, white,
                        R.color.blue_6, white,
                        R.color.blue_7, white,
                        R.color.blue_8, white,
                        R.color.blue_9, white
                );
                setThemeColor(R.color.blue, R.color.blue_dark, white, white);
                break;

            case "Light Blue":
                setupRecyclerColorAccent(
                        R.color.blue_light_accent_1, black,
                        R.color.blue_light_accent_2, black,
                        R.color.blue_light_accent_3, black,
                        R.color.blue_light_accent_4, white
                );
                setupRecyclerOtherColor(
                        R.color.blue_light_0, black,
                        R.color.blue_light_1, black,
                        R.color.blue_light_2, black,
                        R.color.blue_light_3, black,
                        R.color.blue_light_4, black,
                        R.color.blue_light_5, black,
                        R.color.blue_light_6, white,
                        R.color.blue_light_7, white,
                        R.color.blue_light_8, white,
                        R.color.blue_light_9, white
                );
                setThemeColor(R.color.blue_light, R.color.blue_light_dark, black, white);
                break;

            case "Cyan":
                setupRecyclerColorAccent(
                        R.color.cyan_accent_1, black,
                        R.color.cyan_accent_2, black,
                        R.color.cyan_accent_3, black,
                        R.color.cyan_accent_4, black
                );
                setupRecyclerOtherColor(
                        R.color.cyan_0, black,
                        R.color.cyan_1, black,
                        R.color.cyan_2, black,
                        R.color.cyan_3, black,
                        R.color.cyan_4, black,
                        R.color.cyan_5, black,
                        R.color.cyan_6, black,
                        R.color.cyan_7, white,
                        R.color.cyan_8, white,
                        R.color.cyan_9, white
                );
                setThemeColor(R.color.cyan, R.color.cyan_dark, black, white);
                break;

            case "Teal":
                setupRecyclerColorAccent(
                        R.color.teal_accent_1, black,
                        R.color.teal_accent_2, black,
                        R.color.teal_accent_3, black,
                        R.color.teal_accent_4, black
                );
                setupRecyclerOtherColor(
                        R.color.teal_0, black,
                        R.color.teal_1, black,
                        R.color.teal_2, black,
                        R.color.teal_3, black,
                        R.color.teal_4, black,
                        R.color.teal_5, white,
                        R.color.teal_6, white,
                        R.color.teal_7, white,
                        R.color.teal_8, white,
                        R.color.teal_9, white
                );
                setThemeColor(R.color.teal, R.color.teal_dark, white, white);
                break;

            case "Green":
                setupRecyclerColorAccent(
                        R.color.green_accent_1, black,
                        R.color.green_accent_2, black,
                        R.color.green_accent_3, black,
                        R.color.green_accent_4, black
                );
                setupRecyclerOtherColor(
                        R.color.green_0, black,
                        R.color.green_1, black,
                        R.color.green_2, black,
                        R.color.green_3, black,
                        R.color.green_4, black,
                        R.color.green_5, black,
                        R.color.green_6, white,
                        R.color.green_7, white,
                        R.color.green_8, white,
                        R.color.green_9, white
                );
                setThemeColor(R.color.green, R.color.green_dark, black, white);
                break;

            case "Light Green":
                setupRecyclerColorAccent(
                        R.color.green_light_accent_1, black,
                        R.color.green_light_accent_2, black,
                        R.color.green_light_accent_3, black,
                        R.color.green_light_accent_4, black
                );
                setupRecyclerOtherColor(
                        R.color.green_light_0, black,
                        R.color.green_light_1, black,
                        R.color.green_light_2, black,
                        R.color.green_light_3, black,
                        R.color.green_light_4, black,
                        R.color.green_light_5, black,
                        R.color.green_light_6, black,
                        R.color.green_light_7, white,
                        R.color.green_light_8, white,
                        R.color.green_light_9, white
                );
                setThemeColor(R.color.green_light, R.color.green_light_dark, black, white);
                break;

            case "Lime":
                setupRecyclerColorAccent(
                        R.color.lime_accent_1, black,
                        R.color.lime_accent_2, black,
                        R.color.lime_accent_3, black,
                        R.color.lime_accent_4, black
                );
                setupRecyclerOtherColor(
                        R.color.lime_0, black,
                        R.color.lime_1, black,
                        R.color.lime_2, black,
                        R.color.lime_3, black,
                        R.color.lime_4, black,
                        R.color.lime_5, black,
                        R.color.lime_6, black,
                        R.color.lime_7, black,
                        R.color.lime_8, black,
                        R.color.lime_9, white
                );
                setThemeColor(R.color.lime, R.color.lime_dark, black, black);
                break;

            case "Yellow":
                setupRecyclerColorAccent(
                        R.color.yellow_accent_1, black,
                        R.color.yellow_accent_2, black,
                        R.color.yellow_accent_3, black,
                        R.color.yellow_accent_4, black
                );
                setupRecyclerOtherColor(
                        R.color.yellow_0, black,
                        R.color.yellow_1, black,
                        R.color.yellow_2, black,
                        R.color.yellow_3, black,
                        R.color.yellow_4, black,
                        R.color.yellow_5, black,
                        R.color.yellow_6, black,
                        R.color.yellow_7, black,
                        R.color.yellow_8, black,
                        R.color.yellow_9, black
                );
                setThemeColor(R.color.yellow, R.color.yellow_dark, black, black);
                break;

            case "Amber":
                setupRecyclerColorAccent(
                        R.color.amber_accent_1, black,
                        R.color.amber_accent_2, black,
                        R.color.amber_accent_3, black,
                        R.color.amber_accent_4, black
                );
                setupRecyclerOtherColor(
                        R.color.amber_0, black,
                        R.color.amber_1, black,
                        R.color.amber_2, black,
                        R.color.amber_3, black,
                        R.color.amber_4, black,
                        R.color.amber_5, black,
                        R.color.amber_6, black,
                        R.color.amber_7, black,
                        R.color.amber_8, black,
                        R.color.amber_9, black
                );
                setThemeColor(R.color.amber, R.color.amber_dark, black, black);
                break;

            case "Orange":
                setupRecyclerColorAccent(
                        R.color.orange_accent_1, black,
                        R.color.orange_accent_2, black,
                        R.color.orange_accent_3, black,
                        R.color.orange_accent_4, black
                );
                setupRecyclerOtherColor(
                        R.color.orange_0, black,
                        R.color.orange_1, black,
                        R.color.orange_2, black,
                        R.color.orange_3, black,
                        R.color.orange_4, black,
                        R.color.orange_5, black,
                        R.color.orange_6, black,
                        R.color.orange_7, black,
                        R.color.orange_8, black,
                        R.color.orange_9, black
                );
                setThemeColor(R.color.orange, R.color.orange_dark, black, black);
                break;

            case "Deep Orange":
                setupRecyclerColorAccent(
                        R.color.orange_deep_accent_1, black,
                        R.color.orange_deep_accent_2, black,
                        R.color.orange_deep_accent_3, white,
                        R.color.orange_deep_accent_4, white
                );
                setupRecyclerOtherColor(
                        R.color.orange_deep_0, black,
                        R.color.orange_deep_1, black,
                        R.color.orange_deep_2, black,
                        R.color.orange_deep_3, black,
                        R.color.orange_deep_4, black,
                        R.color.orange_deep_5, white,
                        R.color.orange_deep_6, white,
                        R.color.orange_deep_7, white,
                        R.color.orange_deep_8, white,
                        R.color.orange_deep_9, white
                );
                setThemeColor(R.color.orange_deep, R.color.orange_deep_dark, white, white);
                break;

            case "Brown":
                setupRecyclerOtherColor(
                        R.color.brown_0, black,
                        R.color.brown_1, black,
                        R.color.brown_2, black,
                        R.color.brown_3, black,
                        R.color.brown_4, black,
                        R.color.brown_5, white,
                        R.color.brown_6, white,
                        R.color.brown_7, white,
                        R.color.brown_8, white,
                        R.color.brown_9, white
                );
                txtAccent.setVisibility(View.GONE);
                setThemeColor(R.color.brown, R.color.brown_dark, white, white);
                break;

            case "Grey":
                setupRecyclerOtherColor(
                        R.color.grey_0, black,
                        R.color.grey_1, black,
                        R.color.grey_2, black,
                        R.color.grey_3, black,
                        R.color.grey_4, black,
                        R.color.grey_5, black,
                        R.color.grey_6, white,
                        R.color.grey_7, white,
                        R.color.grey_8, white,
                        R.color.grey_9, white
                );
                txtAccent.setVisibility(View.GONE);
                setThemeColor(R.color.grey, R.color.grey_dark, black, white);
                break;

            case "Blue Grey":
                setupRecyclerOtherColor(
                        R.color.grey_blue_0, black,
                        R.color.grey_blue_1, black,
                        R.color.grey_blue_2, black,
                        R.color.grey_blue_3, black,
                        R.color.grey_blue_4, white,
                        R.color.grey_blue_5, white,
                        R.color.grey_blue_6, white,
                        R.color.grey_blue_7, white,
                        R.color.grey_blue_8, white,
                        R.color.grey_blue_9, white
                );
                txtAccent.setVisibility(View.GONE);
                setThemeColor(R.color.grey_blue, R.color.grey_blue_dark, white, white);
                break;

        }
    }

    private void setupRecyclerColorAccent(int color1, int txtColor1,
                                     int color2, int txtColor2,
                                     int color3, int txtColor3,
                                     int color4, int txtColor4)
    {
        ArrayList<Color> itemList = new ArrayList<>();

        int[] backgroundColor = {color1, color2, color3, color4};
        int[] txtColor = {txtColor1, txtColor2, txtColor3, txtColor4};
        int[] density = {R.string.a_100, R.string.a_200, R.string.a_400, R.string.a_700};

        for(int i = 0; i < 4; i++)
        {
            itemList.add(new Color(backgroundColor[i], txtColor[i], density[i]));
        }

        recyclerColorAccent.setHasFixedSize(true);
        recyclerColorAccent.setLayoutManager(new LinearLayoutManager(this));
        recyclerColorAccent.setAdapter(new ColorAdapter(this, itemList));
    }

    private void setupRecyclerOtherColor(int color1, int txtColor1,
                                    int color2, int txtColor2,
                                    int color3, int txtColor3,
                                    int color4, int txtColor4,
                                    int color5, int txtColor5,
                                    int color6, int txtColor6,
                                    int color7, int txtColor7,
                                    int color8, int txtColor8,
                                    int color9, int txtColor9,
                                    int color10, int txtColor10)
    {
        ArrayList<Color> itemList = new ArrayList<>();

        int[] backgroundColor = {color1, color2, color3, color4, color5,
                color6, color7, color8, color9, color10};
        int[] txtColor = {txtColor1, txtColor2, txtColor3, txtColor4, txtColor5,
                txtColor6, txtColor7, txtColor8, txtColor9, txtColor10};
        int[] density = {R.integer.d_50, R.integer.d_100, R.integer.d_200, R.integer.d_300,
                R.integer.d_400, R.integer.d_500, R.integer.d_600, R.integer.d_700,
                R.integer.d_800, R.integer.d_900};

        for(int i = 0, len = backgroundColor.length; i < len; i++)
        {
            itemList.add(new Color(backgroundColor[i], txtColor[i], density[i]));
        }

        recyclerColorOther.setHasFixedSize(true);
        recyclerColorOther.setLayoutManager(new LinearLayoutManager(this));
        recyclerColorOther.setAdapter(new ColorAdapter(this, itemList));
    }

    private void setThemeColor(int colorPrimary, int colorPrimaryDark, int txtColorPrimary, int txtColorPrimaryDark)
    {
        if(getSupportActionBar() != null)
        {
            getSupportActionBar().setBackgroundDrawable(getDrawable(colorPrimary));
        }
        getWindow().setStatusBarColor(getColor(colorPrimaryDark));

        toolbar.setTitleTextColor(getColor(txtColorPrimary));
        if(toolbar.getNavigationIcon() != null)
        {
            toolbar.getNavigationIcon().setTint(getColor(txtColorPrimary));
        }

        String colorCodePrimary = "#" + getString(colorPrimary).toUpperCase().substring(3);
        String colorCodePrimaryDark = "#" + getString(colorPrimaryDark).toUpperCase().substring(3);

        rectangleLong.setBackgroundTintList(this.getColorStateList(colorPrimary));

        txtColorCodePrimaryDark.setText(colorCodePrimaryDark);
        rectangleLongDark.setCardBackgroundColor(this.getColor(colorPrimaryDark));

        txtColorCodePrimary.setText(colorCodePrimary);
        txtColorCodePrimary.setTextColor(this.getColor(txtColorPrimary));
        txtColorDensityPrimary.setTextColor(this.getColor(txtColorPrimary));

        txtColorCodePrimaryDark.setTextColor(this.getColor(txtColorPrimaryDark));
        txtColorDensityPrimaryDark.setTextColor(this.getColor(txtColorPrimaryDark));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();
        switch (id)
        {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
