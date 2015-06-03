package com.example.thirdlogintest.wxapi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import com.example.thirdlogintest.R;
import com.tencent.mm.sdk.modelbase.BaseReq;
import com.tencent.mm.sdk.modelbase.BaseResp;
import com.tencent.mm.sdk.modelmsg.SendAuth;
import com.tencent.mm.sdk.openapi.IWXAPI;
import com.tencent.mm.sdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.sdk.openapi.WXAPIFactory;

public class WXEntryActivity extends Activity implements IWXAPIEventHandler {
	private IWXAPI api;
	private final static String APP_ID = "wxbbfa96cadad66b93";

	private void regToWx() {
		api = WXAPIFactory.createWXAPI(this, APP_ID, false);
		api.handleIntent(getIntent(), this);

	}

	@Override
	public void onReq(BaseReq arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		regToWx();
		Button button = (Button) findViewById(R.id.ui_weixin);
		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Toast.makeText(WXEntryActivity.this, "start", Toast.LENGTH_SHORT).show();
				api.registerApp(APP_ID);
				SendAuth.Req req = new SendAuth.Req();
				req.scope = "snsapi_userinfo";
				req.state = "wechat_sdk_demo_test";
				api.sendReq(req);
			}
		});

	}

	@Override
	public void onResp(BaseResp arg0) {
		Toast.makeText(WXEntryActivity.this, "end", Toast.LENGTH_SHORT).show();

	}
}
