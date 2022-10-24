package com.example.profesional;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class ContentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        TextView textView = (TextView) findViewById(R.id.text_view);

        Intent intent = getIntent();
        String text = intent.getExtras().getString("key");
        textView.setText(text);
    }
}
