package zhushen.com.shejimoshi.chapter9.practice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by Zhushen on 2018/5/10.
 */
public class SecondReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        int limit = intent.getIntExtra("limit",-1001);

        if(limit == 100){
            String msg = intent.getStringExtra("msg");

            Bundle bundle = getResultExtras(true);
            String str = bundle.getString("new");

            Toast.makeText(context,msg + "\n" + str,Toast.LENGTH_SHORT).show();
            abortBroadcast();
        }else {
            Bundle bundle = new Bundle();
            bundle.putString("new","message from second receiver");
            setResultExtras(bundle);
        }
    }
}
