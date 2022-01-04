package com.example.petbio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BioActivity extends AppCompatActivity {

    private ImageView petImageView;
    private TextView petName;
    private TextView petBio;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        petImageView = (ImageView) findViewById(R.id.avatar);
        petName = (TextView) findViewById(R.id.name);
        petBio = (TextView) findViewById(R.id.bioDetails);

        extras = getIntent().getExtras();

        if (extras != null) {
            String name = extras.getString("name");
            String bio = extras.getString("bio");

            setUp(name, bio);
        }

    }

    public void setUp(String name, String bio) {
        if (name.equals("Cat Kyle")) {
            petImageView.setImageDrawable(getResources().getDrawable(R.drawable.cat));
        } else if (name.equals("Dog Neil")) {
            petImageView.setImageDrawable(getResources().getDrawable(R.drawable.dog));
        }
        petName.setText(name);
        petBio.setText(bio);
    }
}