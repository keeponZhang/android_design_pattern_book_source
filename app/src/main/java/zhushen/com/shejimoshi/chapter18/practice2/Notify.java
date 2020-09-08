package zhushen.com.shejimoshi.chapter18.practice2;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;

import com.simple.net.demo.MainActivity;
import com.simple.net.demo.R;

/**
 * android 通知栏
 */

public abstract class Notify {
    protected Context context;
    protected NotificationManager nm;
    protected NotificationCompat.Builder builder;

    public Notify(Context context) {
        this.context = context;

        nm = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        builder = new NotificationCompat.Builder(context);
        builder.setSmallIcon(R.drawable.ic_launcher)
                .setContentIntent(PendingIntent.getActivity(context,0,
                        new Intent(context, MainActivity.class),
                        PendingIntent.FLAG_UPDATE_CURRENT));
    }

    public abstract void send();
    public abstract void cancel();
}
