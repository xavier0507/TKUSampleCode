package com.tku.unit1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Xavier on 2015/3/18.
 */
public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.layout);

		TextView myFirstAndroidAppText = (TextView) this.findViewById(R.id.text_my_first_android_app);
		myFirstAndroidAppText.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), getString(R.string.text_my_first_android), Toast.LENGTH_LONG).show();
			}
		});
	}
}
