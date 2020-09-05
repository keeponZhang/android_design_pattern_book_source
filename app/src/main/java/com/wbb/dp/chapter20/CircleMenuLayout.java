package com.wbb.dp.chapter20;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/**
 * 圆形菜单
 *
 * @author vico
 * @date 2019-01-02
 */
public class CircleMenuLayout extends ViewGroup {

    //圆形直径
    private int mRadius;
    //该容器内child item的默认尺寸
    private static final float RADIO_DEFAULT_CHILD_DIMENSION = 1 / 4f;
    //该容器的内边距，无视padding属性，如需边距请用该变量
    private static final float RADIO_PADDING_LAYOUT=1/12f;
    //该容器的内边距，无视padding属性，如需边距请用该变量
    private float mPadding;
    //布局时的开始角度
    private double mStartAngle=0;
    //菜单项的文本
    private String[] mItemTexts;
    //菜单项的图标
    private int[] mItemImgs;
    //菜单的个数
    private int mMenuItemCount;
    //菜单布局资源id


    public CircleMenuLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

    }
}
