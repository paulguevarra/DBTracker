package com.epicodus.dbtracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GamesActivity extends AppCompatActivity {
    private TextView mGameSearchTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);
        mGameSearchTextView = (TextView) findViewById(R.id.gameSearchTextView);
        Intent intent = getIntent();
        String gameSearch = intent.getStringExtra("gameSearch");
        mGameSearchTextView.setText("Here are all returned results for: " + gameSearch);
    }
}
