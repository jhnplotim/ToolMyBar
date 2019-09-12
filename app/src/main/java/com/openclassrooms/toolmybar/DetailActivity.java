package com.openclassrooms.toolmybar;


import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class DetailActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detail);
		//1-configure Toolbar
		this.configureToolbar();
	}

	private void configureToolbar() {
		//Get the toolbar (Serialise)
		Toolbar toolbar = findViewById(R.id.toolbar);
		//Set the toolbar
		setSupportActionBar(toolbar);
		//Get a support ActionBar corresponding to this toolbar
		ActionBar ab = getSupportActionBar();
		//Enable the Up Button
		ab.setDisplayHomeAsUpEnabled(true);


	}
}
