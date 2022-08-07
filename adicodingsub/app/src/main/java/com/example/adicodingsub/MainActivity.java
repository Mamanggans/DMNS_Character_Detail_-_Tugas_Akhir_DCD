package com.example.adicodingsub;

import androidx.appcompat.app.AppCompatActivity;
import com.example.adicodingsub.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvHeroes;
    private ArrayList<DMNS> list = new ArrayList<>();
    private String title = "Mode List";

    private void showSelectedHero(DMNS DMNS) {
        Toast.makeText(this, "Kamu memilih " + DMNS.getName(), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionbartitle(title);

        rvHeroes = findViewById(R.id.rv_heroes);
        rvHeroes.setHasFixedSize(true);

        list.addAll(CharData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvHeroes.setLayoutManager(new LinearLayoutManager(this));
        ListAdapter listAdapter = new ListAdapter(list);
        rvHeroes.setAdapter(listAdapter);
        listAdapter.setOnItemClickCallback(new ListAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(DMNS data) {
                Intent moveIntent = new Intent(MainActivity.this, character_exp.class);
                moveIntent.putExtra(character_exp.Char_exp, data);
                startActivity(moveIntent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    private void showSelected(DMNS DMNS) {
        Toast.makeText(this, "you chose " + DMNS.getName(), Toast.LENGTH_SHORT).show();
    }

    private void showRecyclerGrid() {
        rvHeroes.setLayoutManager(new GridLayoutManager(this, 2));
        Gridadapter gridadapter = new Gridadapter(list);
        rvHeroes.setAdapter(gridadapter);
        gridadapter.setOnItemClickCallback(new Gridadapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(DMNS data) {
                Intent moveIntent = new Intent(MainActivity.this, character_exp.class);
                moveIntent.putExtra(character_exp.Char_exp, data);
                startActivity(moveIntent);
            }
        });
    }

    private void showRecyclerCardView() {
        rvHeroes.setLayoutManager(new LinearLayoutManager(this));
        Cardviewadapter cardViewAdapter = new Cardviewadapter(list);
        rvHeroes.setAdapter(cardViewAdapter);
    }

    private void setActionbartitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());

        if (item.getItemId() == R.id.developer){
            Intent moveIntent = new Intent(MainActivity.this, Aboutdeveloper.class);
            startActivity(moveIntent);
        }
            return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                title = "list mode";
                showRecyclerList();
                break;

            case R.id.action_grid:
                title = "grid mode";
                showRecyclerGrid();
                break;

            case R.id.action_cardview:
                title = "cardview mode";
                showRecyclerCardView();
                break;

            case R.id.developer:
                showRecyclerCardView();
                break;
        }
        setActionbartitle(title);
    }
}
