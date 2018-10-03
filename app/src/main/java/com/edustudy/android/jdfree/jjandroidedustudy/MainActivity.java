package com.edustudy.android.jdfree.jjandroidedustudy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showActivity(View view) {
        // Main2Activity 로 화면 전환
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
