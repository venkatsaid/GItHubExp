package com.example.venkat_sai.githubexp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView usernam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usernam=findViewById(R.id.username);

    }

    public void submmit(View view) {
        String s=usernam.getText().toString();
        if(s.isEmpty()) {
            usernam.setError("UserName Required");
        }
    }
}
