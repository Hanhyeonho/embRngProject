package com.example.emb_ver01;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class RngService extends Service {

	public void onCreate() {
		
	}
	
	public void onDestroy() {
		
		super.onDestroy();
	}
	
	public int onStartCommand(Intent intent, int flags, int startId) {
		
		return Service.START_STICKY;
	}
	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
