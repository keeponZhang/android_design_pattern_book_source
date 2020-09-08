package zhushen.com.shejimoshi.chapter18.practice;

import android.app.Notification;
import android.content.Context;
import android.widget.RemoteViews;

import com.simple.net.demo.R;

/**
 * Created by Zhushen on 2018/5/30.
 */
public class NotifyBig extends Notify {

    public NotifyBig(Context context) {
        super(context);
    }

    @Override
    public void send() {
        Notification n = builder.build();
        n.contentView = new RemoteViews(context.getPackageName(),
                // TODO: 2018/5/30  change layout file
                R.layout.activity_draw);
        n.bigContentView = new RemoteViews(context.getPackageName(),
                R.layout.activity_draw);
        nm.notify(0,n);
    }

    @Override
    public void cancel() {
        nm.cancel(0);
    }
}
