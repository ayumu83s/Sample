package jp.co.itochin.sample;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.util.Log;
import android.widget.Toast;

@SuppressLint("NewApi")
public class MainActivity extends Activity implements View.OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		// Set up the action bar.  
        final ActionBar actionBar = getActionBar();  
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);  
  
        actionBar.addTab(actionBar.newTab()   
                .setText("ジャッジくんメモ")   
                .setTabListener(new TabListener<JudgeFragment>(   
                        this, "tag1", JudgeFragment.class)));   
        actionBar.addTab(actionBar.newTab()   
                .setText("所持ポケモンリスト")   
                .setTabListener(new TabListener<HaveListFragment>(   
                        this, "tag2", HaveListFragment.class)));
		
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
