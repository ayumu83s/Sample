package jp.co.itochin.sample;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

class PkmnUnitView extends LinearLayout implements View.OnClickListener {
	public PkmnUnitView(Context context) {
		super(context);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public PkmnUnitView(Context context, AttributeSet attrs) {
		super(context, attrs);
		Log.d("PkmnUnitView", "PkmnUnitView");
		// TODO 自動生成されたコンストラクター・スタブ
		LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View layout = inflater.inflate(R.layout.test, this);
		
		Button button = (Button)layout.findViewById(R.id.atk_btn);
		button.setOnClickListener(this);
		TextView textview = (TextView)layout.findViewById(R.id.atk);
		textview.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		// TODO 自動生成されたメソッド・スタブ
		Log.d("PkmnUnitView", "onClick");
		if (v.getId() == R.id.atk) {
			TextView tv = (TextView)findViewById(R.id.atk);
			tv.setText("●");
		}
	}
}
