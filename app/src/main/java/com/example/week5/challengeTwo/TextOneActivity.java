package com.example.week5.challengeTwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.week5.R;

public class TextOneActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_one);
        textView = findViewById(R.id.text_one);
        Bundle bundle = getIntent().getExtras();
        String text = bundle.getString(ChallengeTwoMain.TEXT);
        textView.setText(text);

    }
}
