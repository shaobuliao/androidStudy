package test.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.style.base.BaseFragment;
import com.style.framework.R;

public class EmotionBaseDataFrag extends BaseFragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mLayoutResID = R.layout.frag_emotion_base_info;
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void onLazyLoad() {

    }

}
