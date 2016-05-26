package com.csclab.softwarestudiopractice11;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    private Button send;
    private EditText edt;
    private Intent intent;
    private Bundle bundle;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /** To Do:
         * (1) Find the UI element on xml file
         * **/
        send = (Button) findViewById(R.id.send);
        edt = (EditText) findViewById(R.id.editName);

        send.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendName();
            }
        });
    }

    public void sendName() {

        /** To Do:
         * (1) Use intent and Bundle to pass string
         * (2) Change activity to Activity2
         * **/
        intent = new Intent();
        intent.setClass(MainActivity.this, Activity2.class);

        bundle = new Bundle();
        bundle.putString("name", edt.getText().toString());

        intent.putExtras(bundle);
        startActivity(intent);
    }
}
