package com.generaleye.betweenactivities;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class BActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_b);
		
		Intent i = getIntent();
		String name = i.getStringExtra("Name");
		String jobdesc = i.getStringExtra("JobDesc");
		boolean boolVal = i.getBooleanExtra("RandomBooleanValue", true);
		Integer amountInBank = i.getIntExtra("AmountBank", 300);
		String comment = i.getStringExtra("Comment");
		
		Toast.makeText(getApplicationContext(), "Name "+":"+name, Toast.LENGTH_SHORT).show();
		Toast.makeText(getApplicationContext(), "Job Description "+":"+jobdesc, Toast.LENGTH_SHORT).show();
		Toast.makeText(getApplicationContext(), "Random Boolean Value "+":"+boolVal, Toast.LENGTH_SHORT).show();
		Toast.makeText(getApplicationContext(), "Amount in Bank Account "+":"+amountInBank, Toast.LENGTH_SHORT).show();
		Toast.makeText(getApplicationContext(), "Random Stuff "+":"+comment, Toast.LENGTH_SHORT).show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.b, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
