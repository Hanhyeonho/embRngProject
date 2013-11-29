package com.example.emb_ver01.activitys;

import android.app.Activity;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

import com.example.emb_ver01.DPMReciver;
import com.example.emb_ver01.R;

public class WarningActivity extends Activity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_grid);
		
		getAdmin();
		
		GridView gridViewImages = (GridView)findViewById(R.id.gridview);
		ImageGridAdapter imageGridAdapter = new ImageGridAdapter(this);
		gridViewImages.setAdapter(imageGridAdapter);
		
		gridViewImages.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position,
					long id) {
				if (position == 0) {
					Intent intent = new Intent(WarningActivity.this, CurrentSelectedActivity.class);
					startActivity(intent);
				} else if (position == 1) {
					Intent intent = new Intent(WarningActivity.this, InputDateActivity.class);
					startActivity(intent);
				} else if (position == 2) {
					Intent intent = new Intent(WarningActivity.this, SelectAppsActivity.class);
					startActivity(intent);
				} else if (position == 3) {
					Intent intent = new Intent(WarningActivity.this, CurrentSelectedActivity.class);
					startActivity(intent);
				}
				
			}
			
			
		});
		
		
	}
	
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void getAdmin() {
		ComponentName adminComponent = new ComponentName(this, DPMReciver.class);
		
		Intent intent = new Intent(DevicePolicyManager.ACTION_ADD_DEVICE_ADMIN);
		intent.putExtra(DevicePolicyManager.EXTRA_DEVICE_ADMIN, adminComponent);
		intent.putExtra(DevicePolicyManager.EXTRA_ADD_EXPLANATION,"Needs to be added");
		startActivityForResult(intent, 1);
	}
}
