package com.example.adicodingsub;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class character_exp extends AppCompatActivity {
    public static final String Char_exp = "char_exp";
    private Button button;

    @Override
    protected void onCreate(Bundle savedThisInstanceState) {
        super.onCreate(savedThisInstanceState);
        setContentView(R.layout.char_exp);
        FloatingActionButton hometips = (FloatingActionButton) findViewById(R.id.hometips);
        hometips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(character_exp.this, MainActivity.class));
            }
        });
        button = (Button) findViewById(R.id.back_home);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(character_exp.this, MainActivity.class);
                startActivity(intent);
            }
        });
        TextView charName = findViewById(R.id.tv_item_name);
        TextView charDetail = findViewById(R.id.tv_item_detail);
        TextView charMoreDetail = findViewById(R.id.more_exp);
        ImageView imgCharOne = findViewById(R.id.img_item_photo);
        ImageView imgCharSec = findViewById(R.id.img_item_photo_sec);

        DMNS dmns =getIntent().getParcelableExtra(Char_exp);

        if (dmns !=null) {
        }
        charName.setText(dmns.getName());
        charDetail.setText(dmns.getDetail());
        charMoreDetail.setText(dmns.getMore_exp());
        Glide.with(this).load(dmns.getPhoto()).into(imgCharOne);
        Glide.with(this).load(dmns.getPhoto_sec()).into(imgCharSec);

    }


}
