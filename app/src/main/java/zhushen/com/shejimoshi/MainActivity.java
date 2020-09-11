package zhushen.com.shejimoshi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.simple.net.demo.R;

import zhushen.com.shejimoshi.chapter11.practice.DrawActivity;
import zhushen.com.shejimoshi.chapter13.practice.TextActivity;
import zhushen.com.shejimoshi.chapter20.example3.CircleMenuActivity;
import zhushen.com.shejimoshi.chapter9.practice.OrderActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button chapter9,chapter11,chapter13,chapter20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        chapter9 = (Button)findViewById(R.id.chapter9_btn);
        chapter9.setOnClickListener(this);
        chapter11 = (Button)findViewById(R.id.chapter11_btn);
        chapter11.setOnClickListener(this);
        chapter13 = (Button)findViewById(R.id.chapter13_btn);
        chapter13.setOnClickListener(this);
        chapter20 = (Button)findViewById(R.id.chapter20_btn);
        chapter20.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()){
            case R.id.chapter9_btn:
                intent.setClass(MainActivity.this, OrderActivity.class);
                startActivity(intent);
                break;
            case R.id.chapter11_btn:
                intent.setClass(MainActivity.this, DrawActivity.class);
                startActivity(intent);
                break;
            case R.id.chapter13_btn:
                intent.setClass(MainActivity.this, TextActivity.class);
                startActivity(intent);
                break;
            case R.id.chapter20_btn:
                intent.setClass(MainActivity.this, CircleMenuActivity.class);
                startActivity(intent);
                break;
        }
    }
}
