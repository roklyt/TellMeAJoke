package com.example.showjokes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ShowJokeActivity extends AppCompatActivity {

    public static final String JOKE_EXTRA = "jokeExtra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_joke);

        TextView showJokeView = findViewById(R.id.tv_show_joke);

        Intent intent = getIntent();
        if(intent.hasExtra(JOKE_EXTRA)){
            showJokeView.setText(intent.getStringExtra(JOKE_EXTRA));
        }else{
            showJokeView.setText(R.string.no_joke);
        }

    }
}
