package me.aungkooo.colorpalette;


import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import butterknife.ButterKnife;
import me.aungkooo.colorpalette.model.Color;
import me.aungkooo.colorpalette.adapter.MainAdapter;


public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = ButterKnife.findById(this, R.id.toolbar_main);
        setSupportActionBar(toolbar);
        if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }

        ImageView imgToolbar = ButterKnife.findById(this, R.id.img_toolbar);
        Picasso.with(this).load(R.drawable.style_color_introduction).resize(640, 360).into(imgToolbar);

        CollapsingToolbarLayout toolbarLayout = ButterKnife.findById(this, R.id.toolbar_layout_main);
        Utility.setTypeface(this, toolbarLayout, "luckiest_guy.ttf");

        ArrayList<Color> itemList = new ArrayList<>();

        int[] colors = {R.color.red, R.color.pink, R.color.purple, R.color.purple_deep,
                R.color.indigo, R.color.blue, R.color.blue_light, R.color.cyan,
                R.color.teal, R.color.green, R.color.green_light, R.color.lime,
                R.color.yellow, R.color.amber, R.color.orange, R.color.orange_deep,
                R.color.brown, R.color.grey, R.color.grey_blue};

        int[] colorNames = {R.string.red, R.string.pink, R.string.purple, R.string.purple_deep,
                R.string.indigo, R.string.blue, R.string.blue_light, R.string.cyan,
                R.string.teal, R.string.green, R.string.green_light, R.string.lime,
                R.string.yellow, R.string.amber, R.string.orange, R.string.orange_deep,
                R.string.brown, R.string.grey, R.string.grey_blue};

        for(int i = 0, len = colors.length; i < len; i++)
        {
            itemList.add(new Color(colors[i], colorNames[i]));
        }

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_main);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(new MainAdapter(this, itemList));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();
        switch (id)
        {
            case R.id.menu_about:
                Utility.showDialog(this, new AboutDialog());
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
