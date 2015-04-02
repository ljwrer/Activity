package com.example.activitytest;

import com.example.activitytest.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.first_layout);
		Button button1=(Button)findViewById(R.id.button_1);
		button1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String data="hello secondactivity";
				
				//				Toast.makeText(FirstActivity.this, "You clicked Button 1", Toast.LENGTH_SHORT).show();
//				finish();
				Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
				intent.putExtra("extra_data", data);
//				Intent intent=new Intent("com.example.activitytest.ACTION_START");
//				intent.addCategory("com.example.activitytest.MY_CATEGORY");
//				Intent intent=new Intent(Intent.ACTION_DIAL);
//				intent.setData(Uri.parse("tel:10086"));
				startActivity(intent);
			}
		});
	}
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
}
