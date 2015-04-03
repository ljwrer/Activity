package com.example.activitytest;

import com.example.activitytest.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends BaseActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		Log.d("FirstActivity", this.toString());
		Log.d("FirstActivity","Task id is"+getTaskId());
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.first_layout);
		Button button1=(Button)findViewById(R.id.button_1);
		button1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
//				String data="hello secondactivity";
				SecondActivity.actionStart(FirstActivity.this, "data1", "data2");
				//				Toast.makeText(FirstActivity.this, "You clicked Button 1", Toast.LENGTH_SHORT).show();
//				finish();
//				Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
//				Bundle mbundle=new Bundle();
//				String returnData="Return Hello FirstActivity";
//				mbundle.putString("return_Data", returnData);
//				intent.putExtras(mbundle);
//				startActivityForResult(intent, 1);
//				intent.putExtra("extra_data", data);
//				Intent intent=new Intent("com.example.activitytest.ACTION_START");
//				intent.addCategory("com.example.activitytest.MY_CATEGORY");
//				Intent intent=new Intent(Intent.ACTION_DIAL);
//				intent.setData(Uri.parse("tel:10086"));
//				startActivity(intent);
			}
		});
	}
//	@Override
//	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//		// TODO Auto-generated method stub
////		Log.d("request11", requestCode+" "+resultCode);
////		super.onActivityResult(requestCode, resultCode, data);
//		if(resultCode==RESULT_OK)
//		{
//			String returnedData=data.getStringExtra("data_return");
//			Log.d("FirstActivity",returnedData);
//		}
//	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return super.onCreateOptionsMenu(menu);
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch(item.getItemId())
		{
			case R.id.add_item:
				Toast.makeText(this, "You clicked add", Toast.LENGTH_SHORT).show();
			case R.id.remove_item:
				Toast.makeText(this, "You clicker remove", Toast.LENGTH_SHORT).show();
			default:
		}
		return true;
	}	
	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Log.d("FirstActivity", "onRestart");
	}
}
