package com.example.healingmate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class BookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        ImageButton mainbutton1 = (ImageButton) findViewById(R.id.mainbutton1);
        mainbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        ImageButton sharebutton1 = (ImageButton) findViewById(R.id.sharebutton1);
        sharebutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ShareActivity.class);
                startActivity(intent);
            }
        });

        ImageButton secretbutton1 = (ImageButton) findViewById(R.id.secretbutton1);
        secretbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SecretActivity.class);
                startActivity(intent);
            }
        });

        ImageButton bookbutton1 = (ImageButton) findViewById(R.id.bookbutton1);
        bookbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BookActivity.class);
                startActivity(intent);
            }
        });

        ImageButton settingbutton1 = (ImageButton) findViewById(R.id.settingbutton1);
        settingbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SettingActivity.class);
                startActivity(intent);
            }
        });

    }
}