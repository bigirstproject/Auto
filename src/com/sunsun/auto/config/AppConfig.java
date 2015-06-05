package com.sunsun.auto.config;

import com.sunsun.auto.AutoApplication;

public class AppConfig {

	public static final boolean HANDLE_CRASH = false;
	public static final boolean DEBUG = false;
	
	public static final float DENSITY = AutoApplication.getInstance()
			.getResources().getDisplayMetrics().density;
	public static final float SCALESITY = AutoApplication.getInstance()
			.getResources().getDisplayMetrics().scaledDensity;
	public static final int widthPx = AutoApplication.getInstance()
			.getResources().getDisplayMetrics().widthPixels;
	public static final int heightPx = AutoApplication.getInstance()
			.getResources().getDisplayMetrics().heightPixels;

}
