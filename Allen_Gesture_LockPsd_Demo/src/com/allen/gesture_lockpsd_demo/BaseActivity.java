package com.allen.gesture_lockpsd_demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.allen.gesture_lockpsd_demo.activity.GestureVerifyActivity;
import com.allen.gesture_lockpsd_demo.utils.ActivityCollector;
import com.allen.gesture_lockpsd_demo.utils.AppUtils;
import com.allen.gesture_lockpsd_demo.utils.SPUtils;

public class BaseActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		ActivityCollector.addActivity(this);
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Object object = false;
		// SPUtils.get(this, "showGesture", new Boolean(false));
		if ((Boolean) SPUtils.get(this, "isbackground", false)) {
			Intent intent = new Intent();
			intent.setClass(this, GestureVerifyActivity.class);
			startActivity(intent);
		}
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		
		SPUtils.put(this, "isbackground", false);
		ActivityCollector.removeActivity(this);
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();

		if (AppUtils.isRunningBackground(this)) {
			SPUtils.put(this, "isbackground", true);
		}

	}

}
