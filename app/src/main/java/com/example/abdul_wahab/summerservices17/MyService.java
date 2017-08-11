package com.example.abdul_wahab.summerservices17;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyService extends Service {
    public MyService() {
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                // Long Running Task
            }
        });





        for (int i = 0; i < 23; i++) {

            // task
        }

        // stopSelf();

        return super.onStartCommand(intent, flags, startId);
    }

    // Unbound Service
    //StartService
    @Override
    public IBinder onBind(Intent intent) {

        return null;
    }
}
