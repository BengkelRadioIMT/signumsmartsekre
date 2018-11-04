package io.github.bengkelradio.simplewebview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class rfid extends Activity{
    WebView rfidView;

    @Override
    public void onBackPressed(){
        if(rfidView.canGoBack()){
            rfidView.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rfid);
        rfidView = (WebView)findViewById(R.id.rfidView);
        rfidView.getSettings().setJavaScriptEnabled(true);
        rfidView.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        rfidView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        rfidView.getSettings().setDefaultZoom(WebSettings.ZoomDensity.FAR);
        rfidView.loadUrl("http://bit.ly/kalenderIMTSignum");
        rfidView.setWebViewClient(new WebViewClient());
    }
}
