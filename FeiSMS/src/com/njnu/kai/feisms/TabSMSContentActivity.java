package com.njnu.kai.feisms;

import android.app.Activity;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;

public class TabSMSContentActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_sms);
	}

	@Override
	protected void onPause() {
		super.onPause();
	}

}