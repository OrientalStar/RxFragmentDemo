package com.demo.rxfragment.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.demo.rxfragment.R;
import com.trello.rxlifecycle2.components.RxFragment;

public class FragmentPage1 extends RxFragment {
	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_1, null);

		return view;
	}


}
