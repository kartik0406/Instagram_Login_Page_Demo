package com.pevel.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
   public void Login(View view)
   {
       Log.i("Status","Login pressed");
       EditText editText=(EditText)findViewById(R.id.editText);
       EditText editText1=(EditText)findViewById(R.id.editText2);
        if((editText.getText().toString().equals("kartik0406"))&&(editText1.getText().toString().equals("kartik@0406")))
       {
           Log.i("Status:","Login Granted");
           Log.i("username:",editText.getText().toString());
           Log.i("Password:",editText1.getText().toString());

       }
       else
       {
           Log.i("Status:","Login Denied");
       }

   }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
