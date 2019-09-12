package com.openclassrooms.toolmybar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //1 - Configuring Toolbar
        this.configureToolbar();
        //2 - Serialise & configure ImageView
        this.configureImageView();
    }

    private void configureImageView() {
        //Serialise ImageView
        this.mImageView = findViewById(R.id.activity_main_logo_image_view);
        //Set on click listener on it
        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //launch detail activity
                launchDetailActivity();
            }
        });

    }

    private void launchDetailActivity() {
        Intent startDetailActivityIntent = new Intent(MainActivity.this,DetailActivity.class);
        this.startActivity(startDetailActivityIntent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //2 - Inflate the menu and add it to the Toolbar
        getMenuInflater().inflate(R.menu.menu_activity_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //3 - Handle actions on menu items
        switch (item.getItemId()){
            case R.id.menu_activity_main_params:
                Toast.makeText(this,"There is nothing to set up here, go your way ...", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_activity_main_search:
                Toast.makeText(this, "Search unavailable, ask rather the opinion of Google, it is better and faster.",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    private void configureToolbar() {
        //Get the toolbar view inside the activity layout
        Toolbar toolbar = findViewById(R.id.toolbar);
        //Set the Toolbar
        setSupportActionBar(toolbar);
    }
}
