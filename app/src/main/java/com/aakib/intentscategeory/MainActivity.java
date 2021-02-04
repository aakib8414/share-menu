package com.aakib.intentscategeory;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvWorkHard = findViewById(R.id.tv_work_hard);

        tvWorkHard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textData = tvWorkHard.getText().toString();

                Intent intent = new Intent(MainActivity.this, ActivitySecond.class);
                intent.putExtra("data",textData);
                startActivity(intent);
                finish();
            }
        });
    }
}