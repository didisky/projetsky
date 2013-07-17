package com.example.projectsky;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		TextView coucou = null;
		super.onCreate(savedInstanceState);
		coucou = new TextView(this);
		coucou.setText("hello didi test numero 4");
		setContentView(coucou);
	}



}
