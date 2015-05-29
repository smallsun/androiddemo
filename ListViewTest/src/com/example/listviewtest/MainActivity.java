package com.example.listviewtest;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private List<Fruit> fruitList =new ArrayList<Fruit>();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initData();
		FruitAdapter adapter = new FruitAdapter(MainActivity.this, R.layout.fruit, fruitList);
		ListView listView =(ListView)findViewById(R.id.ui_list_view);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Fruit fruit = fruitList.get(position);
				Toast.makeText(MainActivity.this, fruit.getName(), Toast.LENGTH_SHORT).show();
				
			}
			
		});

	}

	
	public void initData(){
		Fruit ui1 =new Fruit("ui1",R.drawable.ui_1);
		Fruit ui2 =new Fruit("ui2",R.drawable.ui_2);
		Fruit ui3 =new Fruit("ui3",R.drawable.ui_3);
		Fruit ui4 =new Fruit("ui4",R.drawable.ui_4);
		Fruit ui5 =new Fruit("ui5",R.drawable.ui_5);
		Fruit ui6 =new Fruit("ui6",R.drawable.ui_6);
		Fruit ui7 =new Fruit("ui7",R.drawable.ui_7);
		Fruit ui8 =new Fruit("ui8",R.drawable.ui_8);
		Fruit ui9 =new Fruit("ui9",R.drawable.ui_9);
		Fruit ui10 =new Fruit("ui10",R.drawable.ui_10);
		Fruit ui11 =new Fruit("ui11",R.drawable.ui_11);
		Fruit ui12 =new Fruit("ui12",R.drawable.ui_12);
		fruitList.add(ui1);
		fruitList.add(ui2);
		fruitList.add(ui3);
		fruitList.add(ui4);
		fruitList.add(ui5);
		fruitList.add(ui6);
		fruitList.add(ui7);
		fruitList.add(ui8);
		fruitList.add(ui9);
		fruitList.add(ui10);
		fruitList.add(ui11);
		fruitList.add(ui12);
		
		
		
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	

}
