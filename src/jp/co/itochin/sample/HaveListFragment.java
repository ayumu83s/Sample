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
        // ��R������boolean��"container"��return����View��ǉ����邩�ǂ���  
        //true�ɂ���ƍŏI�I��layout�ɍēx�A����View group���\������Ă��܂��̂�false��OK�炵��  
        return inflater.inflate(R.layout.test, container, false);  
    }  
}  