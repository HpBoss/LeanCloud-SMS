package com.example.verifytest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

import cn.leancloud.AVException;
import cn.leancloud.AVObject;
import cn.leancloud.callback.RequestMobileCodeCallback;
import cn.leancloud.sms.AVSMS;
import cn.leancloud.sms.AVSMSOption;
import cn.leancloud.types.AVNull;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class VerifyActivity extends AppCompatActivity implements View.OnClickListener {
    private Button bt;
    private boolean testSuccess;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = findViewById(R.id.bt);
        bt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
//        AVObject testObject = new AVObject("TestObject");
//        testObject.put("words", "Hello world!");
//        testObject.saveInBackground().blockingSubscribe();
        AVSMSOption option = new AVSMSOption();
        option.setTemplateName("requestMobilePhoneVerify");
        option.setSignatureName("loginFEH");
        option.setApplicationName("家教帮");
        option.setTtl(10);
//        Map<String, Object> parameters = new HashMap<String, Object>();
//        parameters.put("order_id", "7623432424540");      // 使用实际的值来替换模板中的变量
//        option.setEnvMap(parameters);
        AVSMS.requestSMSCodeInBackground("15328755505", option).subscribe(new Observer<AVNull>() {
            @Override
            public void onSubscribe(Disposable disposable) {
            }
            @Override
            public void onNext(AVNull avNull) {
            }
            @Override
            public void onError(Throwable throwable) {
            }
            @Override
            public void onComplete() {
            }
        });
    }
}
