package com.example.no_7textview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button_ok=(Button) findViewById(R.id.button_ok);
        button_ok.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                EditText editTextuserid=(EditText)findViewById(R.id.edit_userid);
                EditText editTextpaswword=(EditText)findViewById(R.id.edit_password);
                String strUserid=editTextuserid.getText().toString();
                String strPassword=editTextpaswword.getText().toString();
                if (strUserid.equals("abc")&&strPassword.equals("123")){
                    Toast.makeText(MainActivity.this,"成功！！！",Toast.LENGTH_SHORT).show();
                }
                else Toast.makeText(MainActivity.this,"用户或密码错误！！！",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
