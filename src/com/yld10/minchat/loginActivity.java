package com.yld10.minchat;

import android.renderscript.Element;
import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class loginActivity extends ActionBarActivity /*implements OnClickListener*/{

	//ʵ�����ؼ�
	private Button loginButton;
	private Button registButton;
	private EditText loginCountEditText;
	private EditText loginPasswdEditText;
	private TextView alertTextView;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //������xml�ļ����뵽activity����
        setContentView(R.layout.activity_login);
        //��ʼ���ؼ�
        setLoginButton((Button) findViewById(R.id.loginButton));
        setRegistButton((Button) findViewById(R.id.registButton));
        setLoginCountEditText((EditText) findViewById(R.id.loginAccountEditText));
        setLoginPasswdEditText((EditText) findViewById(R.id.loginPasswdEditText));
        setAlertTextView((TextView) findViewById(R.id.alertTextView));
        setRegistButton((Button) findViewById(R.id.registButton));
        /*
         * �����¼��������ڲ���
         */
//        loginButton.setOnClickListener(new OnClickListener() {
//			@Override
//			public void onClick(View arg0) {
//				Toast.makeText(MainActivity.this, "loginButton������ˣ�", Toast.LENGTH_LONG).show();
//				Log.e("loginLog","loginButton������ˣ�");
//			}
//		});
        
        /*
         * �����¼����ⲿ������
         */
        loginButton.setOnClickListener(new OnClickListener() {
        	@Override
        	public void onClick(View v) {
        		alertTextView.setText("");
        		String userName = loginCountEditText.getText().toString().trim();
        		String passwd = loginPasswdEditText.getText().toString().trim();
        		if (!userName.equals("") && !passwd.equals("")) {
        			if (userName.equals("15889141713") && passwd.equals("123456")) {
        				Toast.makeText(loginActivity.this, "��¼�ɹ���", Toast.LENGTH_LONG).show();
        			}else if (userName.equals("15889141713")) {
        				alertTextView.setText("���벻��ȷ��");
        			}else {
        				alertTextView.setText("�ʺŲ���ȷ��");
					}
        		}else if (userName.equals("")){
					alertTextView.setText("�ʺŲ���Ϊ�գ�");
				}else {
					alertTextView.setText("���벻��Ϊ�գ�");
				}
        	}
        });
    	registButton.setOnClickListener(new OnClickListener() {		
    		@Override
    		public void onClick(View v) {
    			alertTextView.setText("");
    			Intent intent = new Intent(loginActivity.this, registActivity.class);
    			startActivity(intent);
    		}
    	});
        /*
         * �����¼����ӿڷ�ʽʵ��
         */
//        loginButton.setOnClickListener(this);
    }
	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

	public Button getLoginButton() {
		return loginButton;
	}

	public void setLoginButton(Button loginButton) {
		this.loginButton = loginButton;
	}
//	@Override
//	public void onClick(View v) {
//		Toast.makeText(MainActivity.this, "loginButton������ˣ�", Toast.LENGTH_LONG).show();
//		Log.e("loginTag", "�ӿڷ�ʽʵ��");
//	}
	public Button getRegistButton() {
		return registButton;
	}
	public void setRegistButton(Button registButton) {
		this.registButton = registButton;
	}
	public EditText getLoginCountEditText() {
		return loginCountEditText;
	}
	public void setLoginCountEditText(EditText loginCountEditText) {
		this.loginCountEditText = loginCountEditText;
	}
	public EditText getLoginPasswdEditText() {
		return loginPasswdEditText;
	}
	public void setLoginPasswdEditText(EditText loginPasswdEditText) {
		this.loginPasswdEditText = loginPasswdEditText;
	}
	public TextView getAlertTextView() {
		return alertTextView;
	}
	public void setAlertTextView(TextView alertTextView) {
		this.alertTextView = alertTextView;
	}
}
