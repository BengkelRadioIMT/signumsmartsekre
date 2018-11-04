package io.github.bengkelradio.simplewebview;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton button_cctv;
    private ImageButton button_timeline;
    private ImageButton button_electricity;
    private ImageButton button_catalog;
    private ImageButton button_rfid;
    private ImageButton button_about;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);

        button_cctv = (ImageButton) findViewById(R.id.imageButton2);
        button_cctv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, cctv.class);
                startActivity(intent);
            }
        });

        button_timeline = (ImageButton) findViewById(R.id.imageButton3);
        button_timeline.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, timeline.class);
                startActivity(intent);
            }
        });

        button_electricity = (ImageButton) findViewById(R.id.imageButton4);
        button_electricity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notAvailable();
            }
        });

        button_catalog = (ImageButton) findViewById(R.id.imageButton5);
        button_catalog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, catalog.class);
                startActivity(intent);
            }
        });

        button_rfid = (ImageButton) findViewById(R.id.imageButton6);
        button_rfid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, rfid.class);
                startActivity(intent);
            }
        });

        button_about = (ImageButton) findViewById(R.id.imageButton7);
        button_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aboutDialog();
            }
        });
    }

    private void aboutDialog() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                this);
        alertDialogBuilder.setTitle("About Us");
        alertDialogBuilder
                .setMessage("Bengkel Radio IMT\n\nSekretariat IMT Signum ITB\nLTRGM ITB")
                .setIcon(R.mipmap.ic_launcher);
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    private void notAvailable() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                this);
        alertDialogBuilder.setTitle("N/A");
        alertDialogBuilder
                .setMessage("This feature is not yet integrated, please come back later :D")
                .setIcon(R.mipmap.ic_launcher);
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}