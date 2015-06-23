package com.allen.gesture_lockpsd_demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.allen.gesture_lockpsd_demo.activity.GestureVerifyActivity;
import com.allen.gesture_lockpsd_demo.application.MyApplication;
import com.allen.gesture_lockpsd_demo.utils.SPUtils;

public class SplashActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		new Handler().postDelayed(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				if (!SPUtils.get(MyApplication.getContext(), "gesturePsd", "")
						.toString().equals("")) {
					Intent intent = new Intent();
					intent.setClass(MyApplication.getContext(),
							GestureVerifyActivity.class);
					startActivity(intent);
					SplashActivity.this.finish();
				} else {
					Intent intent = new Intent();
					intent.setClass(MyApplication.getContext(), LoginActivity.class);
					startActivity(intent);
					SplashActivity.this.finish();
				}
			}
		}, 3000);
	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub

	}
}
