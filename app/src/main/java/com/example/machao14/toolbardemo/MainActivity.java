package com.example.machao14.toolbardemo;

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

    public void openToolbar(View view) {
        Intent intent = new Intent(this,ToolbarActivity.class);
        startActivity(intent);

    }

    public void openTabLayout(View view) {
        Intent intent = new Intent(this,TabLayoutActivity.class);
        startActivity(intent);
    }
}
