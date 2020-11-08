package com.digiinnovative.webtabs.ui.tools;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewClientImpl extends WebViewClient {
    public   WebViewClientImpl(){

    }
String name;
String pwd;
    public WebViewClientImpl(String  username,String  password){
        name=username;
        pwd=password;

    }
    @Override
    public void onPageFinished(WebView webView, String url) {
        super.onPageFinished(webView, url);
        if(null!=name)

        webView.loadUrl("javascript:(function() { document.getElementById('TextBox1').value = '"+name+"'; ;})()");
        if(null!=pwd)
        webView.loadUrl("javascript:(function() { document.getElementById('TextBox2').value = '"+pwd+"'; ;})()");
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
//        if(Uri.parse(url).getHost().endsWith("google.com")) {
        return false;
//        }
//        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
//        view.getContext().startActivity(intent);
//        return true;
    }
}