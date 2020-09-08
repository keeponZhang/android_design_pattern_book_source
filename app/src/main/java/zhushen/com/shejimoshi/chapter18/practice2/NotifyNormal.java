package zhushen.com.shejimoshi.chapter18.practice2;

import android.app.Notification;
import android.content.Context;
import android.widget.RemoteViews;

import com.simple.net.demo.R;

/**
 * 64dp 通知试图
 */

public class NotifyNormal extends Notify {
    public NotifyNormal(Context context) {
        super(context);
    }

    @Override
    public void send() {
        Notification n = builder.build();
        n.contentView = new RemoteViews(context.getPackageName(),
                R.layout.remote_notify_proxy_normal);
        nm.notify(0,n);
    }

    @Override
    public void cancel() {

        nm.cancel(0);
    }
}
