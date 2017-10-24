package com.epicodus.dbtracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mFindGameButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFindGameButton = (Button) findViewById(R.id.findGameButton);
            mFindGameButton.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    //do something
                }
            });
    }
}
