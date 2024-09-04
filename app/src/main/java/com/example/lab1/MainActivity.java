package com.example.lab1;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get references to the TextView and Button
        TextView MainText = findViewById(R.id.MainTextView);
        Button ChangeTxtBtn = findViewById(R.id.btnChangeText);
        Button ChangeColorBtn = findViewById(R.id.btnChangeColor);

        // Set an OnClickListener on the Button
        ChangeTxtBtn.setOnClickListener(v -> {
            // Change the text of the TextView when the button is clicked
            MainText.setText("Tekstas Pakeistas");
        });
        ChangeColorBtn.setOnClickListener(v -> {
            Random rngColor = new Random();
            int color = Color.rgb(rngColor.nextInt(256), rngColor.nextInt(256), rngColor.nextInt(256));
            MainText.setTextColor(color);
        });
    }
}
// komentaras