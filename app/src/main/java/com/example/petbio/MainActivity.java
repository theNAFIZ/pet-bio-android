package com.example.petbio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView catView;
    private ImageView dogView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        catView = (ImageView) findViewById(R.id.catViewID);
        dogView = (ImageView) findViewById(R.id.dogViewID);

        catView.setOnClickListener(this);
        dogView.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.catViewID:
                //TODO go to second activity
                Toast.makeText(MainActivity.this, "Cat Touched", Toast.LENGTH_SHORT).show();
                break;

            case R.id.dogViewID:
                //TODO go to second activity
                Toast.makeText(MainActivity.this, "Dog Touched", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}