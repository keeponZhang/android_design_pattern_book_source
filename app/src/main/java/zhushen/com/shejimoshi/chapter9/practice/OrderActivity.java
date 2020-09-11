package zhushen.com.shejimoshi.chapter9.practice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.simple.net.demo.R;


public class OrderActivity extends AppCompatActivity {
    private Button sendBtn;

    private static final String MY_ACTION ="com.example.action.MY_ACTION";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        sendBtn = (Button)findViewById(R.id.order_send_btn);
        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(MY_ACTION);
                intent.putExtra("limit",100);
                intent.putExtra("msg","message from order activity");
                sendOrderedBroadcast(intent,null);
            }
        });

    }
}
