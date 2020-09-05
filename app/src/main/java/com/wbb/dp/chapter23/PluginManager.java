package com.wbb.dp.chapter23;

import android.content.Context;

import java.util.Map;

/**
 * 插件管理器
 * @author weibb
 * @date 2019/1/8
 * email: weibb@chingo.cn
 */
public class PluginManager {
    static class PluginMgrHolder{
        static PluginManager sManager=new PluginManager();
    }

    //Application Context
    private static Context mContext;

    //插件APK包名为key、PluginApk为值的HashMap

}
