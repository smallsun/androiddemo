package com.example.unsizetest;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MsgAdapter extends ArrayAdapter<Msg> {

	private int resourceId;

	public MsgAdapter(Context context, int resource, List<Msg> objects) {
		super(context, resource, objects);
		resourceId = resource;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Msg msg = (Msg) getItem(position);
		View view;
		ViewHolder viewHolder;
		if (null == convertView) {
			view = LayoutInflater.from(getContext()).inflate(resourceId, null);
			viewHolder = new ViewHolder();
			viewHolder.setLeftLinearLayout((LinearLayout) view.findViewById(R.id.ui_msg_left_linear));
			viewHolder.setRightLinearLayout((LinearLayout) view.findViewById(R.id.ui_msg_right_linear));
			viewHolder.setRightTextView((TextView) view.findViewById(R.id.ui_msg_right_text));
			viewHolder.setLeftTextView((TextView) view.findViewById(R.id.ui_msg_left_text));
			view.setTag(viewHolder);
		} else {
			view = convertView;
			viewHolder = (ViewHolder) view.getTag();
		}
		if (msg.getType() == Msg.TYPE_RECEIVED) {
			viewHolder.getLeftLinearLayout().setVisibility(View.VISIBLE);
			viewHolder.getRightLinearLayout().setVisibility(View.GONE);
			viewHolder.getLeftTextView().setText(msg.getContent());
		} else if (Msg.TYPE_SENT == msg.getType()) {
			viewHolder.getRightLinearLayout().setVisibility(View.VISIBLE);
			viewHolder.getLeftLinearLayout().setVisibility(View.GONE);
			viewHolder.getRightTextView().setText(msg.getContent());
		}
		return view;
	}

}
