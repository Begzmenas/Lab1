package com.example.lab1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get references to the TextView and Button
        TextView MainText = findViewById(R.id.MainTextView);
        Button ChangeTxtBtn = findViewById(R.id.btnChangeText);

        // Set an OnClickListener on the Button
        ChangeTxtBtn.setOnClickListener(v -> {
            // Change the text of the TextView when the button is clicked
            MainText.setText("Tekstas Pakeistas");
        });
    }
}