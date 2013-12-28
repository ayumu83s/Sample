package jp.co.itochin.sample;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.d("OnCreate", "kita!");
		Button resetBtn = (Button)findViewById(R.id.reset);
		resetBtn.setOnClickListener(this);

		// http://y-anz-m.blogspot.jp/2010/11/android-linearlayout-expandablelistview.html
/*		int groupIds[] = {
				R.id.group1, R.id.group2, R.id.group3,
				R.id.group4, R.id.group5, R.id.group6
		};
		for (int i = 0; i < groupIds.length; i++) {
			LinearLayout ll = (LinearLayout)findViewById(groupIds[i]);
			Button atk_btn = (Button)ll.findViewById(R.id.atk_btn);
			atk_btn.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					Log.d("onClick", "atk");
					
				}
			});
			TextView atk = (TextView)ll.findViewById(R.id.atk);
			atk.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					Log.d("onClick", "atk view");
					
				}
			});
		
		}
*/
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		Log.d("onClick", "kita!");
		switch (v.getId()) {
		case R.id.reset:
			Toast.makeText(this, "reset!", Toast.LENGTH_SHORT).show();
			break;
		default:
			Toast.makeText(this, "etc", Toast.LENGTH_SHORT).show();
			break;
		}
	}
	

}
