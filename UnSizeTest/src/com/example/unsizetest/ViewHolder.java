package com.example.unsizetest;

import android.widget.LinearLayout;
import android.widget.TextView;

public class ViewHolder {
	private LinearLayout leftLinearLayout;
	private LinearLayout rightLinearLayout;
	private TextView leftTextView;
	private TextView rightTextView;
	public LinearLayout getLeftLinearLayout() {
		return leftLinearLayout;
	}
	public void setLeftLinearLayout(LinearLayout leftLinearLayout) {
		this.leftLinearLayout = leftLinearLayout;
	}
	public LinearLayout getRightLinearLayout() {
		return rightLinearLayout;
	}
	public void setRightLinearLayout(LinearLayout rightLinearLayout) {
		this.rightLinearLayout = rightLinearLayout;
	}
	public TextView getLeftTextView() {
		return leftTextView;
	}
	public void setLeftTextView(TextView leftTextView) {
		this.leftTextView = leftTextView;
	}
	public TextView getRightTextView() {
		return rightTextView;
	}
	public void setRightTextView(TextView rightTextView) {
		this.rightTextView = rightTextView;
	}
	

}
