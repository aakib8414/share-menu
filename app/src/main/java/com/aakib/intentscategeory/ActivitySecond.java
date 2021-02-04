package com.aakib.intentscategeory;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivitySecond extends AppCompatActivity {

    TextView work, hard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        getSupportActionBar().hide();
        work = findViewById(R.id.work);
        hard = findViewById(R.id.hard);
        Button readQuote = findViewById(R.id.btn_quote_read);

        Intent intent = getIntent();
        String data = intent.getStringExtra("data");
        work.setText("Try to do " + data);
        hard.setText("try to learn " + data);

        readQuote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ActivitySecond.this, QuoteActivity.class));
            }
        });
    }
}