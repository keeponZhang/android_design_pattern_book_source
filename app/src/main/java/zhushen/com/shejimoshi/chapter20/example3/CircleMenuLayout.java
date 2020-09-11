package zhushen.com.shejimoshi.chapter20.example3;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.simple.net.demo.R;

/**
 * Created by Zhushen on 2018/6/4.
 */
public class CircleMenuLayout extends ViewGroup {
    private int mRadious;
    private static final float RADIO_DEFAULT_CHILD_DIMENSION = 1/4f;
    private static final float RADIO_PADDING_LAYOUT = 1/12f;
    private float mPadding;
    private double mStartAngle = 0;
    private String[] mItemTexts;
    private int[] mItemImages;
    private int mMenuItemCount;
    private int mMenuItemLayoutId = R.layout.circle_menu_item;
    private AdapterView.OnItemClickListener mOnMenuItemClickListener;

    public CircleMenuLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        setPadding(0,0,0,0);
    }

    public void setMenuItemIconsAndTexts(int[] images,String[] texts){
        if(images == null && texts == null){
            throw new IllegalArgumentException("at least set one");
        }
        mItemImages = images;
        mItemTexts = texts;
        mMenuItemCount = images==null? texts.length:images.length;
        if(images !=null&&texts!=null){
            mMenuItemCount = Math.min(texts.length,images.length);
        }
        buildMenuItems();
    }

    private void buildMenuItems() {
        for(int i = 0;i<mMenuItemCount;i++){
            View itemView = inflateMenuView(i);
            initMenuItem(itemView,i);
            addView(itemView);
        }
    }

    private View inflateMenuView(final int childIndex) {
        LayoutInflater mInflate = LayoutInflater.from(getContext());
        View itemView = mInflate.inflate(mMenuItemLayoutId,this,false);
        itemView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mOnMenuItemClickListener != null){
//                    mOnMenuItemClickListener.onClick(v,childIndex);
//                    mOnMenuItemClickListener.onItemClick(this,v,childIndex,mMenuItemLayoutId);
                }
            }
        });
        return itemView;
    }

    private void initMenuItem(View itemView, int i) {
        ImageView imageView = (ImageView)itemView.findViewById(R.id.circle_menu_item_image);
        TextView textView = (TextView)itemView.findViewById(R.id.circle_menu_item_text);
        imageView.setVisibility(View.VISIBLE);
        imageView.setImageResource(mItemImages[i]);
        textView.setVisibility(View.VISIBLE);
        textView.setText(mItemTexts[i]);
    }

    public void setMenuItemLayoutId(int mMenuItemLayoutId) {
        this.mMenuItemLayoutId = mMenuItemLayoutId;
    }

    public void setOnMenuItemClickListener(AdapterView.OnItemClickListener mOnMenuItemClickListener) {
        this.mOnMenuItemClickListener = mOnMenuItemClickListener;
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        measureMyself(widthMeasureSpec,heightMeasureSpec);
        measureChildViews();
    }

    private void measureMyself(int widthMeasureSpec, int heightMeasureSpec) {
        int resWidth = 0;
        int resHeight = 0;
        int width = MeasureSpec.getSize(widthMeasureSpec);
        int height = MeasureSpec.getSize(heightMeasureSpec);
        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);

        if(widthMode != MeasureSpec.EXACTLY
                ||heightMode != MeasureSpec.EXACTLY){
            resWidth = getSuggestedMinimumWidth();
            Log.e("TAG", "CircleMenuLayout measureMyself resWidth resWidth:"+resWidth);
           resWidth = resWidth==0?200:resWidth;
            resHeight = getSuggestedMinimumHeight();
           resHeight = resHeight==0?200+100:resHeight;
        }else {
            resWidth = resHeight = Math.min(width,height);
        }
        setMeasuredDimension(resWidth,resHeight);
    }

    private void measureChildViews() {
        mRadious = Math.max(getMeasuredHeight(),getMeasuredWidth());
        final int count = getChildCount();
        int childSize = (int) (mRadious * RADIO_DEFAULT_CHILD_DIMENSION);
        int childMode = MeasureSpec.EXACTLY;
        for(int i=0;i<count;i++){
            final View child = getChildAt(i);
            if(child.getVisibility() == GONE){
                Log.e("TAG", "CircleMenuLayout measureChildViews child.getVisibility() == GONE:");
                continue;
            }
            int makeMeasureSpec = -1;
            makeMeasureSpec = MeasureSpec.makeMeasureSpec(childSize,childMode);
            child.measure(makeMeasureSpec,makeMeasureSpec);
        }
        mPadding = RADIO_PADDING_LAYOUT;
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        final int childCount = getChildCount();
        Log.e("TAG", "CircleMenuLayout onLayout:");
        int left,top;
        int itemWidth = (int) (mRadious * RADIO_DEFAULT_CHILD_DIMENSION);
        float angleDelay = 360/ childCount;
        for(int i = 0;i<childCount;i++){
            final View child = getChildAt(i);
            if(child.getVisibility() == GONE){
                continue;
            }
            Log.e("TAG", "for CircleMenuLayout onLayout:");
            mStartAngle %= 360;
            float distanceFromCenter = mRadious / 2f - itemWidth / 2 - mPadding;
            left = mRadious /2 + (int)Math.round(distanceFromCenter* Math.cos(Math.toRadians(mStartAngle)) -1 / 2f * itemWidth) ;
            top = mRadious /2 + (int)Math.round(distanceFromCenter* Math.sin(Math.toRadians(mStartAngle)) -1 / 2f * itemWidth) ;
            child.layout(left,top,left+itemWidth,top+itemWidth);
            mStartAngle += angleDelay;
        }
    }
}
