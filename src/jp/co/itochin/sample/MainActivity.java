package jp.co.itochin.sample;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.d("OnCreate", "kita!");
		Button resetBtn = (Button)findViewById(R.id.reset);
		resetBtn.setOnClickListener(this);
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
		// TODO 自動生成されたメソッド・スタブ
		Toast.makeText(this, "reset!", Toast.LENGTH_SHORT).show();
		
	}
	

}
