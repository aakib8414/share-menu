package com.aakib.intentscategeory;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class QuoteActivity extends AppCompatActivity {

    Button share;
    TextView quote;
    TextView customFont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quote);
        getSupportActionBar().hide();

        share = findViewById(R.id.btn_share);
        quote = findViewById(R.id.quote);
        customFont = findViewById(R.id.tv_custom_font);

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String shareText = quote.getText().toString();
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.setType("text/plain");
                sendIntent.putExtra(Intent.EXTRA_TEXT, shareText);
                startActivity(sendIntent);
            }
        });

        customFont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuoteActivity.this, CustomFont.class));
                finish();
            }
        });
    }
}