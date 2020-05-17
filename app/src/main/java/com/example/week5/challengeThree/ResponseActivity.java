package com.example.week5.challengeThree;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.week5.R;
import com.example.week5.challengeTwo.ChallengeTwoMain;

public class ResponseActivity extends AppCompatActivity {
    private TextView display;
    private TextView message;
    private EditText input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge_three_main);
        display = findViewById(R.id.Ak);
        message = findViewById(R.id.response);
        input = findViewById(R.id.message);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null) {
            String messafeFromActivity = bundle.getString(ChallengeThreeActivityMain.TAG);
            if (messafeFromActivity != null) {
                display.setText("Message received");
                message.setText(messafeFromActivity);
            }
        }
    }

    public void sendMessage(View view) {
        String send = input.getText().toString();
        Intent intent = new Intent();
        intent.putExtra(ChallengeThreeActivityMain.TAG,send);
        setResult(ResponseActivity.RESULT_OK,intent);
        finish();
    }
}
