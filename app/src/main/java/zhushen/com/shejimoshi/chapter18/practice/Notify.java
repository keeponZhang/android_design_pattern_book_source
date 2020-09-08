package zhushen.com.shejimoshi.chapter18.practice;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.support.v4.app.NotificationCompat;

/**
 * Created by Zhushen on 2018/5/30.
 */
public abstract class Notify {
    protected Context context;
    protected NotificationManager nm;
    protected NotificationCompat.Builder builder;

    public Notify(Context context) {
        this.context = context;

        nm = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

//        builder = new NotificationCompat.Builder(context)
//                .setContentIntent(PendingIntent.getActivity(context,0,
//                        context,NotifyActivity.class),
//                        PendingIntent.FLAG_UPDATE_CURRENT);
    }

    public abstract void send();

    public abstract  void cancel();
}
