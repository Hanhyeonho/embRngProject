package com.example.emb_ver01.activitys;

import android.app.admin.DeviceAdminReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.Toast;

public class DPMReciver extends DeviceAdminReceiver {
	static SharedPreferences getSamplePreferences(Context context) {
		return context.getSharedPreferences(
				DeviceAdminReceiver.class.getName(), 0);
	};

	void showToast(Context context, CharSequence msg) {
		Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
	}

	@Override
	public void onEnabled(Context context, Intent intent) {
		// 기기권한이 설정되었을 경우
		showToast(context, "Device Admin enabled");
	}

	@Override
	public CharSequence onDisableRequested(Context context, Intent intent) {
		return "This is an optional message to warn the user about disabling.";
	}

	@Override
	public void onDisabled(Context context, Intent intent) {
		// 기기 권한이 해제 됬을 경우
		showToast(context, "Device Admin Disabled");
	}

	@Override
	public void onPasswordChanged(Context context, Intent intent) {
		// 패스워드 상태가 변경되었을 경우
		showToast(context, "Password Change");
	}

	@Override
	public void onPasswordFailed(Context context, Intent intent) {
		// 패스워드 입력이 실패했을 겨우
		showToast(context, "PasswordFailed");
	}

	@Override
	public void onPasswordSucceeded(Context context, Intent intent) {
		// 패스워드를 정상적으로 입력했을 경우
		showToast(context, "PasswordSucceeded");
	}

}
