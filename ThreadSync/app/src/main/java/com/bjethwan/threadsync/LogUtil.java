package com.bjethwan.threadsync;

/**
 * Created by bjethwan on 11/08/17.
 */

public class LogUtil {

    public static String printProcessAndThreadInfo(){
        return "Process ID: " +android.os.Process.myPid() + " Thread Id: " + Thread.currentThread().getId() + " Thread Name: " + Thread.currentThread().getName();
    }
}
