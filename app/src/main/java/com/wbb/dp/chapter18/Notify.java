package com.wbb.dp.chapter18;

import android.app.NotificationManager;
import android.content.Context;
import android.support.v4.app.NotificationCompat;

/**
 * @author vico
 * @date 2018-12-03
 */
public abstract class Notify {
    protected Context context;

    protected NotificationManager nm;
    protected NotificationCompat.Builder builder;

    public Notify(Context context) {
        this.context = context;

        nm= (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        builder=new NotificationCompat.Builder(context);
       /* builder.setSmallIcon(R.mipmap.ic_launcher)
                .setContentIntent(PendingIntent.getActivity(context,0,new Intent(context,NotifyActivity.class),
                        PendingIntent.FLAG_UPDATE_CURRENT));*/
    }
}
