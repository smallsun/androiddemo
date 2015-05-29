package com.example.listviewtest;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class FruitAdapter extends ArrayAdapter<Fruit>{

	private int resourceId;
	public FruitAdapter(Context context, int resource, List<Fruit> objects) {
		super(context, resource, objects);
		resourceId = resource;
		
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Fruit fruit = getItem(position);
		View view = LayoutInflater.from(getContext()).inflate(resourceId, null);
		ImageView imageView = (ImageView) view.findViewById(R.id.ui_fruit_image);
		TextView textView = (TextView) view.findViewById(R.id.ui_text);
		imageView.setImageResource(fruit.getImageId());
		textView.setText(fruit.getName());
		return view;
	}

}
