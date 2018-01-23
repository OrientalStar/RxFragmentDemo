package com.demo.rxfragment.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.demo.rxfragment.R;
import com.trello.rxlifecycle2.components.RxFragment;

public class FragmentPage4 extends RxFragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {	
		return inflater.inflate(R.layout.fragment_4, null);
	}	
}