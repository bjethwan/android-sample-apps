package com.bjethwan.threadsync;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    private static final String TAG = "Bipin.MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, LogUtil.printProcessAndThreadInfo());

        KonyPolicy.initializeInBackground();


        Button clickme = (Button)findViewById(R.id.clickme);
        Button dbaccess = (Button)findViewById(R.id.dbaccess);

        clickme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Time Pass", Toast.LENGTH_SHORT).show();
                Log.i(TAG, LogUtil.printProcessAndThreadInfo());
            }
        });

        dbaccess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.i(TAG, LogUtil.printProcessAndThreadInfo() + " Goign to need the DB passphrase and ** may block **");
                Log.i(TAG, LogUtil.printProcessAndThreadInfo() + " KonyPolicy.getSQLiteYSecret(): " + KonyPolicy.getSQLiteYSecret() );

                Log.i(TAG, LogUtil.printProcessAndThreadInfo() + " Goign to need the PKCS#12 passphrase and ** may block **");
                Log.i(TAG, LogUtil.printProcessAndThreadInfo() + " KonyPolicy.getPKCS12YSecret(): " + KonyPolicy.getPKCS12YSecret() );

                Toast.makeText(MainActivity.this, "All Set", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
