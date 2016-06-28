package com.example.hp.myapplication;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;


public class MyService extends Service {
    MediaPlayer x;
    public MyService() {

    }

    @Override
    public void onCreate() {
        super.onCreate();
        x=MediaPlayer.create(this,R.raw.tera);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(MyService.this, "Ok Boss ghum Payeci", Toast.LENGTH_SHORT).show();
        Log.d("MyService", "onStartCommand: ");
        return super.onStartCommand(intent, flags, startId);

    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
        Log.d("MyService", "onStart: ");
        Toast.makeText(MyService.this, "Ok boss aibar ghumai jao", Toast.LENGTH_SHORT).show();

        x.start();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(MyService.this, "Okk Thik ache", Toast.LENGTH_SHORT).show();
        Log.d("Myservice", "onDestroy: ");
        x.stop();
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
