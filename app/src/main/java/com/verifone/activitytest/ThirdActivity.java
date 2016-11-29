package com.verifone.activitytest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by 李凯 on 2016/11/20.
 */

public class ThirdActivity extends BaseActivity{
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        Log.d("--->ThirdActivity", getClass().getSimpleName());
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.layout3);

//        WebView wv = (WebView) findViewById(R.id.wv);
//        wv.getSettings().setJavaScriptEnabled(true);
//        wv.setWebViewClient(new WebViewClient());
//        wv.loadUrl("http://www.sohu.com");
    }
}
