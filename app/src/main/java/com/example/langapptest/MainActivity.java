package com.example.langapptest;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompat {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ImageButton en = findViewById(R.id.btn_en);
        ImageButton fr = findViewById(R.id.btn_fr);
        ImageButton es = findViewById(R.id.btn_sp);
        LanguageManager lang = new LanguageManager(this);
        en.setOnClickListener(view ->
        {
          lang.updateResource("en");
          recreate();
        });
        fr.setOnClickListener(view ->
        {
            lang.updateResource("fr");
            recreate();

        });
        es.setOnClickListener(view ->
        {
            lang.updateResource("es");
            recreate();

        });
        findViewById(R.id.btn_go).setOnClickListener(View ->
        {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
    });

    }
}