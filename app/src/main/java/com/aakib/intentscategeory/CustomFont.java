package com.aakib.intentscategeory;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CustomFont extends AppCompatActivity {

    TextView hindi, english, urdu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_font);

        hindi = findViewById(R.id.text_hindi);
        english = findViewById(R.id.text_english);
        urdu = findViewById(R.id.text_urdu);

        Typeface hindiFont = Typeface.createFromAsset(getAssets(),"font/hindi.ttf");
        hindi.setTypeface(hindiFont);

        Typeface eng = Typeface.createFromAsset(getAssets(),"font/english.ttf");
        english.setTypeface(eng);

        Typeface urduFont = Typeface.createFromAsset(getAssets(),"font/urdu.ttf");
        urdu.setTypeface(urduFont);
    }
}