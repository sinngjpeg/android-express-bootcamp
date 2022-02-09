package com.sinngjpeg.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtTitle = findViewById(R.id.title);
        TextView txtSubTitle = findViewById(R.id.subtitle);

        String title = "finge que veio do banco de dados";

        txtTitle.setText("Olá Mundo!");
        txtSubTitle.setText(title);
    }
}