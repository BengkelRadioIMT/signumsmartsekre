package io.github.bengkelradio.simplewebview;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class timeline extends Activity{
    WebView calView;

@Override
public void onBackPressed(){
        if(calView.canGoBack()){
                calView.goBack();
        } else {
                super.onBackPressed();
        }
}

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeline);
        calView = (WebView)findViewById(R.id.calView);
        calView.getSettings().setJavaScriptEnabled(true);
        calView.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        calView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        calView.getSettings().setDefaultZoom(WebSettings.ZoomDensity.FAR);
        calView.loadUrl("http://bit.ly/kalenderIMTSignum");
        calView.setWebViewClient(new WebViewClient());
        }
}
