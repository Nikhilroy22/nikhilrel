package com.my.newproject;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.app.Activity;
import android.widget.*;
import android.view.View;
import android.view.View.*;


public class MainActivity extends Activity {
  private TextView txt;
  private Button button1;

  
  
    @Override
    protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main);
  
    txt = findViewById(R.id.textview1);
    button1 = findViewById(R.id.button1);
    

				txt.setText("niloy babu amr cjele");

		
		button1.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View _view) {
						  
						    Toast.makeText(getApplicationContext(), "Hello, this is a Toast! ki kro tumi", Toast.LENGTH_SHORT).show();
						  
								
						}
				});
		
      
        
    }
    
    
    
    @Override
		public void onBackPressed() {
		  
		  AlertDialog.Builder builder = new AlertDialog.Builder(this);
builder.setTitle("Dialog Title")
       .setMessage("This is a simple dialog.")
       .setPositiveButton("Exit", new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialog, int which) {
               // Handle OK button click
               finish();
           }
       })
       .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialog, int which) {
               // Handle Cancel button click
               dialog.dismiss();
           }
       });


builder.show();
		  
				
		}
    
    
}
