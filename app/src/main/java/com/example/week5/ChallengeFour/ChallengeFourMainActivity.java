package com.example.week5.ChallengeFour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.week5.R;

import java.util.StringTokenizer;

import static android.content.Intent.ACTION_SEND_MULTIPLE;

public class ChallengeFourMainActivity extends AppCompatActivity {

    private EditText urlEditText;
    private EditText locationEditText;
    private EditText shareEditText;
    private EditText callEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge_four_main);
        urlEditText = findViewById(R.id.editTextURL);
        locationEditText = findViewById(R.id.editTextLocation);
        shareEditText = findViewById(R.id.editTextShare);
       callEditText = findViewById(R.id.editTextPHoneNumber);
    }

    public void openWebsiteOnclick(View view) {
        String url = urlEditText.getText().toString();
        Intent openWebsiteImplictIntent = new Intent(Intent.ACTION_VIEW);
        openWebsiteImplictIntent.setData(Uri.parse(url));
        if(openWebsiteImplictIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(openWebsiteImplictIntent);
        }else{
            Toast.makeText(this,"error on link", Toast.LENGTH_LONG).show();
        }
    }

    public void openLocationOnClick(View view) {
        String location =locationEditText.getText().toString();
        Uri shearch = Uri.parse("geo:0.0?q=" + location);
        Intent locationImplictIntent = new Intent(Intent.ACTION_VIEW,shearch);
        locationImplictIntent.setPackage("com.google.android.apps.maps");
        if(locationImplictIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(locationImplictIntent);
        }else{
            Toast.makeText(this,"error on Location", Toast.LENGTH_LONG).show();
        }
    }

    public void shareTextOnClick(View view) {
        String share = shareEditText.getText().toString();
        Intent shareImplicitIntent = new Intent(Intent.ACTION_SEND);
        shareImplicitIntent.putExtra(Intent.EXTRA_TEXT,share);
        shareImplicitIntent.setType("text/plain");
            startActivity(Intent.createChooser(shareImplicitIntent, ACTION_SEND_MULTIPLE));


    }

    public void calLOnClick(View view) {
        String phoneNumber = callEditText.getText().toString();
        Intent callImplictIntent = new Intent(Intent.ACTION_DIAL);
        callImplictIntent.setData(Uri.parse("tel:"+ phoneNumber));
        if(callImplictIntent.resolveActivity(getPackageManager()) != null){
            startActivity(callImplictIntent);
        }else{
            Toast.makeText(this,"error on call", Toast.LENGTH_LONG).show();
        }
    }
}
