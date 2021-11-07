package com.example.tugas5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;

import androidx.core.app.NotificationCompat;

class alarmreceiver extends BroadcastReceiver {
    MediaPlayer player;

    @Override
    public void onReceive(Context context, Intent intent) {
        notificationhelper NotificationHelper = new notificationhelper(context);
        NotificationCompat.Builder nb = NotificationHelper.getChannelNotification();
        NotificationHelper.getManager().notify(1, nb.build());

    }
}

