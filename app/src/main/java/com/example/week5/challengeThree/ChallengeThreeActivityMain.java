package com.example.week5.challengeThree;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.week5.R;
import com.example.week5.challengeTwo.ChallengeTwoMain;

public class ChallengeThreeActivityMain extends AppCompatActivity {
    public static final String TAG = "Message";
    public static final  int TAG_CHANNEL = 1564;
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

    }

    public void sendMessage(View view) {
        Intent intent = new Intent(ChallengeThreeActivityMain.this, ResponseActivity.class);
        intent.putExtra(TAG,input.getText().toString());
        startActivityForResult(intent,TAG_CHANNEL);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == TAG_CHANNEL && resultCode == ResponseActivity.RESULT_OK){
            input.setText("");
            String replay = data.getStringExtra(TAG);
            display.setText("Replay received");
            message.setText(replay);
        }
    }
}
