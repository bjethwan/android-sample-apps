package com.bjethwan.threadsync;

import android.util.Log;

import java.util.concurrent.TimeUnit;


public class KonyPolicy{

    private static final String TAG = "Bipin.KonyPolicy  ";

    private static String sqliteYSecret=null;
    private static String pkcs12YSecret =null;

    public static void initializeInBackground(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                mimicLongRunningDecryptionTask();
            }
        }).start();
    }

    private static synchronized void  mimicLongRunningDecryptionTask(){
        try {
            Log.i(TAG, LogUtil.printProcessAndThreadInfo()+" Starting to decrypt key materials...");
            TimeUnit.MINUTES.sleep(1);
            sqliteYSecret = "alphaNumeric string for sqlite";
            pkcs12YSecret = "alphaNumeric string for pkcs#12";
            Log.i(TAG, LogUtil.printProcessAndThreadInfo()+" Completed the decryption.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static String getSQLiteYSecret(){
        if(sqliteYSecret==null){
            synchronized (KonyPolicy.class){
                if(sqliteYSecret==null){
                    mimicLongRunningDecryptionTask();
                }
            }
        }
        return sqliteYSecret;
    }

    public static String getPKCS12YSecret(){
        if(sqliteYSecret==null){
            synchronized (KonyPolicy.class){
                if(sqliteYSecret==null){
                    mimicLongRunningDecryptionTask();
                }
            }
        }
        return sqliteYSecret;
    }
}
