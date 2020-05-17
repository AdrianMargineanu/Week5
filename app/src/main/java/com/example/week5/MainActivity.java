package com.example.week5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.week5.ChallengeFour.ChallengeFourMainActivity;
import com.example.week5.challengeThree.ChallengeThreeActivityMain;
import com.example.week5.challengeTwo.ChallengeTwoMain;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void challenge1(View view) {
        startActivity(new Intent(MainActivity.this,ChallengeOne.class));
    }

    public void challenge2(View view) {
        startActivity(new Intent(MainActivity.this, ChallengeTwoMain.class));
    }

    public void challenge3(View view) {
        startActivity(new Intent(MainActivity.this, ChallengeThreeActivityMain.class));
    }

    public void challenge4(View view) {
        startActivity(new Intent(MainActivity.this, ChallengeFourMainActivity.class));
    }
}
