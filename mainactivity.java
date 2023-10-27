package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText uid;
    EditText pid;
    Button btn_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Login();
    }
    void Login(){
        uid = (EditText) findViewById(R.id.uid);
        pid = (EditText) findViewById(R.id.pid);
        btn_id =(Button) findViewById(R.id.btn_id);
        btn_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(uid.getText().toString().equals("admin") && pid.getText().toString().equals("admin")){
                    Toast.makeText(MainActivity.this, "Username and Password is correct",
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,login2.class); startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "Username or Password is incorrect", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
