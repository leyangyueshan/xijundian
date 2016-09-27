package com.example.xijundian;



import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class logo extends Activity {
	private RelativeLayout userSettingLyt,logoShowLyt;
	private Button btn;
	private EditText nameInputEdt;
	private int windowHeight;//用于设置对话框的显示比例时用到窗口的一些参数
	private int windowWidth;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.logo);
		WindowManager winManager=(WindowManager)getSystemService(Context.WINDOW_SERVICE);
		windowHeight = winManager.getDefaultDisplay().getHeight();
		windowWidth  = winManager.getDefaultDisplay().getWidth();
		
		/*展示两秒的Logo 之后根据呈现做出不同的跳转*/
		new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(2000);//显示logo两秒
				} catch (InterruptedException e) {
				}
				runOnUiThread(new Runnable() {

					@Override
					public void run() {
						
							startActivity(new Intent(logo.this,MainActivity.class));
						
					}
				});
			}
		}).start();
	}
	
	
}
