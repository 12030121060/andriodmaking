package com.example.eventhandling;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	private Button btclick;
	private EditText name;
	private Button bt;
	private Button br;
	private EditText t1;

	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.applayout);
        btclick=(Button)findViewById(R.id.btclick);
        name=(EditText)findViewById(R.id.edit12);
        t1=(EditText)findViewById(R.id.edit23);
        OnClickListener l1=new OnClickListener() {
			
			@SuppressLint("DefaultLocale") @Override
			/*public void onClick(View arg0) {
				// TODO Auto-generated method stub
				btclick.setText("Button was clicked");
			}*/
			/*public void onClick(View a1){
				Toast.makeText(getApplicationContext(), "ButtonClicked",
						Toast.LENGTH_LONG).show();
			}*/
			/*public void onClick(View a15){
				Toast.makeText(getApplicationContext(), name.getText(),
						Toast.LENGTH_LONG).show();
			}*/
			public void onClick(View a12){
				Toast.makeText(getApplicationContext(),t1.toString().toLowerCase(), 
						Toast.LENGTH_LONG).show();
			}
		};
		btclick.setOnClickListener(l1);        
    }


    
}
