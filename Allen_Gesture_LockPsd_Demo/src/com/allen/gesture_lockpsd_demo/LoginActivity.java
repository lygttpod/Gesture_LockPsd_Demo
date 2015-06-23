package com.allen.gesture_lockpsd_demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.allen.gesture_lockpsd_demo.activity.GestureEditActivity;
import com.allen.gesture_lockpsd_demo.activity.GestureVerifyActivity;
import com.allen.gesture_lockpsd_demo.application.MyApplication;
import com.allen.gesture_lockpsd_demo.utils.SPUtils;
import com.allen.gesture_lockpsd_demo.utils.ToastUtil;

public class LoginActivity extends BaseActivity implements OnClickListener {

	private Button loginButton;
	private EditText usernameET, userpsdET;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
//		if (!SPUtils.get(MyApplication.getContext(), "gesturePsd", "")
//				.toString().equals("")) {
//			Intent intent = new Intent();
//			intent.setClass(this, GestureVerifyActivity.class);
//			startActivity(intent);
//		}
	}

	private void initView() {
		usernameET = (EditText) findViewById(R.id.editText_username);
		userpsdET = (EditText) findViewById(R.id.editText_userpsd);
		loginButton = (Button) findViewById(R.id.button_login);
		loginButton.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View view) {
		// TODO Auto-generated method stub
		switch (view.getId()) {
		case R.id.button_login:
			if (usernameET.getText().toString().trim().equals("")
					|| userpsdET.getText().toString().trim().equals("")) {
				ToastUtil.showLong(this, "用户名或密码不能为空！");
			} else {
				SPUtils.put(MyApplication.getContext(), "username", usernameET
						.getText().toString().trim());
				SPUtils.put(MyApplication.getContext(), "userpsd", userpsdET
						.getText().toString().trim());

				Intent intent = new Intent();
				intent.setClass(this, GestureEditActivity.class);
				startActivity(intent);
                finish();
			}

			break;

		default:
			break;
		}
	}

}
