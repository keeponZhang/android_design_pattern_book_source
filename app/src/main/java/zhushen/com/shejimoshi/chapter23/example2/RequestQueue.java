package zhushen.com.shejimoshi.chapter23.example2;

import android.support.v4.app.LoaderManager;
import android.util.Log;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

import zhushen.com.shejimoshi.chapter15.practice.Loader;

/**
 * Created by Zhushen on 2018/12/11.
 */
public final class RequestQueue {
    private BlockingQueue<BitmapRequest> mRequestQueue = new PriorityBlockingQueue<BitmapRequest>();

    public static int DEFAULT_CORE_NUMS = Runtime.getRuntime().availableProcessors() +1;
    private RequestDispatcher[] mDispatchers = null;

    private final void startDispatchers(){
        int mDispatcherNums = DEFAULT_CORE_NUMS;
        mDispatchers = new RequestDispatcher[mDispatcherNums];
        for (int i = 0; i < mDispatcherNums; i++) {
            Log.e("zhushen","### start thread "+ i);
            mDispatchers[i] = new RequestDispatcher(mRequestQueue);
            mDispatchers[i].start();
        }
    }

    public void start(){
//        stop();
        startDispatchers();
    }
}


class RequestDispatcher extends Thread {
    private BlockingQueue<BitmapRequest> mRequestQueue;

    public RequestDispatcher(BlockingQueue<BitmapRequest> mRequestQueue) {
        this.mRequestQueue = mRequestQueue;
    }

    @Override
    public void run() {
        try {
            while (this.isInterrupted()){
//                final BitmapRequest request = mRequestQueue.take();
//                if(request.isCancel){
//                    continue;
//                }
////                final String schema = paraseSchema(request.imageUrl);
//                final String schema = request.imageUrl;
//                Loader imageLoader = LoaderManager.getInstance().getLoader(schema);
//                imageLoader.loadImage(request);
            }
        }catch (Exception e){

        }
    }
}
