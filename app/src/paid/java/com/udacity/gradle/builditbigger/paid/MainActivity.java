package com.udacity.gradle.builditbigger.paid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.showjokes.ShowJokeActivity;
import com.udacity.gradle.builditbigger.EndpointsAsyncTask;
import com.udacity.gradle.builditbigger.R;


public class MainActivity extends AppCompatActivity {

    public Context context;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progressBar);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {
            progressBar.setVisibility(View.VISIBLE);

            EndpointsAsyncTask someTask = new EndpointsAsyncTask(new EndpointsAsyncTask.OnEventListener<String>() {
                @Override
                public void onSuccess(String result) {
                    progressBar.setVisibility(View.GONE);

                    Intent intent = new Intent(getApplicationContext(), ShowJokeActivity.class);
                    intent.putExtra(ShowJokeActivity.JOKE_EXTRA, result);
                    getApplication().startActivity(intent);
                }

                @Override
                public void onFailure(Exception e) {
                    Toast.makeText(getApplicationContext(), R.string.load_joke_error, Toast.LENGTH_LONG).show();
                }
            });
            someTask.execute();
        }

}
