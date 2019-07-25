package com.example.verifytest;

import android.app.Application;
import android.app.Service;

import cn.leancloud.AVLogger;
import cn.leancloud.AVOSCloud;

public class MainActivity extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AVOSCloud.setLogLevel(AVLogger.Level.DEBUG);
        AVOSCloud.initialize("N0BgS5JiJ9uvbGAaP6CLg94G-gzGzoHsz", "oKfV8fm67mH5kbPcAtP6hGsM");
    }
}
