package com.allen.gesture_lockpsd_demo.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Toast������
 * 
 * @File_name: ToastUtil.java
 * @Package_name: com.eastedge.safeinhand.utils
 * @Author allen
 * @Date : 2012-10-10����12:08:39
 * @Version 1.0
 */
public class ToastUtil {
	static Toast mToast;

	/**
	 * ��ʾ����Toast
	 * 
	 * @param context
	 * @param msg
	 * @param duration
	 */
	public static void showTest(Context context, String msg) {
		if (true) {
			if (mToast == null) {
				mToast = Toast.makeText(context, msg, Toast.LENGTH_SHORT);
			} else {
				mToast.setText(msg);
				mToast.setDuration(Toast.LENGTH_SHORT);
			}
			mToast.show();
			// Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
		}
	}

	/**
	 * ��ʱ����ʾToast
	 * 
	 * @param context
	 * @param msg
	 */
	public static void showShort(Context context, int resid) {
		// ���Toast������ʾ����ʱ������
		if (mToast == null) {
			mToast = Toast.makeText(context, resid, Toast.LENGTH_SHORT);
		} else {
			mToast.setText(resid);
			mToast.setDuration(Toast.LENGTH_SHORT);
		}
		mToast.show();
		// ����
		// Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
	}

	/**
	 * ��ʱ����ʾToast
	 * 
	 * @param context
	 * @param msg
	 */
	public static void showShort(Context context, String msg) {
		// ���Toast������ʾ����ʱ������
		if (mToast == null) {
			mToast = Toast.makeText(context, msg, Toast.LENGTH_SHORT);
		} else {
			mToast.setText(msg);
			mToast.setDuration(Toast.LENGTH_SHORT);
		}
		mToast.show();
		// ����
		// Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
	}

	/**
	 * ��ʱ����ʾToast
	 * 
	 * @param context
	 * @param msg
	 */
	public static void showLong(Context context, String msg) {
		if (mToast == null) {
			mToast = Toast.makeText(context, msg, Toast.LENGTH_LONG);
		} else {
			mToast.setDuration(Toast.LENGTH_LONG);
			mToast.setText(msg);
		}
		mToast.show();
		// Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
	}

	/**
	 * ��ʱ����ʾToast
	 * 
	 * @param context
	 * @param msg
	 */
	public static void showLong(Context context, int resid) {
		if (mToast == null) {
			mToast = Toast.makeText(context, resid, Toast.LENGTH_LONG);
		} else {
			mToast.setDuration(Toast.LENGTH_LONG);
			mToast.setText(resid);
		}
		mToast.show();
		// Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
	}
}
