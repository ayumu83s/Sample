package jp.co.itochin.sample;

import android.os.Bundle;  
import android.annotation.SuppressLint;
import android.app.Fragment;  
import android.view.LayoutInflater;  
import android.view.View;  
import android.view.ViewGroup;  
  
@SuppressLint("NewApi")
public class HaveListFragment extends Fragment {  
    @Override  
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {  
        // 第３引数のbooleanは"container"にreturnするViewを追加するかどうか  
        //trueにすると最終的なlayoutに再度、同じView groupが表示されてしまうのでfalseでOKらしい  
        return inflater.inflate(R.layout.test, container, false);  
    }  
}  