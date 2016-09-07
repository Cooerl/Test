package com.example.test;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		
		Button button=(Button) findViewById(R.id.button);
		button.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
					setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
				}
				else{
					setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
				}
			}
		});
		
		Uri uri = Uri.parse("http://7xq9l2.com1.z0.glb.clouddn.com/VID_20160801_091855.3gp");  
		VideoView videoView = (VideoView)this.findViewById(R.id.videoView);  
		videoView.setMediaController(new MediaController(this));  
		videoView.setVideoURI(uri); 
		videoView.start();
		videoView.requestFocus();
	}
}
