package com.tutorialsee.database.http;

import java.util.Random;

import com.tutorialsee.database.MainActivity;
import com.tutorialsee.database.R;
import com.tutorialsee.database.R.id;
import com.tutorialsee.database.R.layout;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class Category extends Fragment {

	public Category() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(layout.category, container, false);

		TextView tv = (TextView) v.findViewById(id.title);
		Bundle args = getArguments(); 
		if (args != null)
			tv.setText(args.getString(MainActivity.CUR_PAGE_TITLE));


		Random rnd = new Random();
		int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));

		RelativeLayout background = (RelativeLayout) v.findViewById(id.background);
		background.setBackgroundColor(color);

		return v;
	}
}
