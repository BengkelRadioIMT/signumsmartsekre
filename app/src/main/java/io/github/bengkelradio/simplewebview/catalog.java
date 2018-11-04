package io.github.bengkelradio.simplewebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class catalog extends AppCompatActivity {
    WebView libView;
    Button catalog1;
    Button catalog2;
    Button catalog3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog);
        libView = (WebView)findViewById(R.id.libView);
        catalog1 = (Button)findViewById(R.id.catalog1);
        catalog2 = (Button)findViewById(R.id.catalog2);
        catalog3 = (Button)findViewById(R.id.catalog3);

        libView.getSettings().setJavaScriptEnabled(true);
        libView.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        libView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        libView.getSettings().setDefaultZoom(WebSettings.ZoomDensity.FAR);
        libView.loadUrl("http://katalog.bengkrad.com/");
        libView.setWebViewClient(new WebViewClient());

        catalog1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                libView.loadUrl("http://katalog.bengkrad.com/akademik");
            }
        });
        catalog2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                libView.loadUrl("http://katalog.bengkrad.com/nonakademik");
            }
        });
        catalog3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                libView.loadUrl("http://katalog.bengkrad.com/pinjaman");
            }
        });
    }
}
