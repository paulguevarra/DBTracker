package com.epicodus.dbtracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//    public static final String TAG = MainActivity.class.getSimpleName();
    private Button mFindGameButton;
    private EditText mGameSearchEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGameSearchEditText = (EditText) findViewById(R.id.gameSearchEditText);
        mFindGameButton = (Button) findViewById(R.id.findGameButton);
        mFindGameButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String gameSearch = mGameSearchEditText.getText().toString();
//                Log.d(TAG, gameSearch);
                //do something
//                Toast.makeText(MainActivity.this, "Hello World!", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, GamesActivity.class);
                intent.putExtra("gameSearch", gameSearch);
                startActivity(intent);
            }
        });
    }
}
