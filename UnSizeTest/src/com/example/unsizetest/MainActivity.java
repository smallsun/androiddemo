package com.example.unsizetest;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends Activity {

	private List<Msg> msgList;
	private MsgAdapter adapter;
	private EditText editText;
	private ListView msgListView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setMsgData();
		adapter = new MsgAdapter(MainActivity.this, R.layout.msg_item, msgList);

		editText = (EditText) findViewById(R.id.ui_msg_text);
		Button button = (Button) findViewById(R.id.ui_button);
		msgListView = (ListView) findViewById(R.id.ui_msg_list_view);
		msgListView.setAdapter(adapter);
		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				String content = editText.getText().toString();
				if (!"".equals(content)) {
					Msg msg = new Msg(Msg.TYPE_SENT, content);
					msgList.add(msg);
					adapter.notifyDataSetChanged();
					msgListView.setSelection(msgList.size());
					editText.setText("");
				}
			}
		});

	}

	private void setMsgData() {
		msgList = new ArrayList<Msg>();
		for (int i = 0; i < 10; i++) {
			Msg msg = new Msg();
			msg.setContent("hi ginger you are No." + i);
			if (i % 2 == 0) {
				msg.setType(Msg.TYPE_SENT);
			} else {
				msg.setType(Msg.TYPE_RECEIVED);
			}
			msgList.add(msg);
		}
	}
}
