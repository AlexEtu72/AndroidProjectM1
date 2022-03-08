package com.example.pantrymind.model.notif;

import android.content.Context;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.example.pantrymind.R;


public abstract class Notification {
    public static int id;


    public static void buildNotif(Context context,String content){
    NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "PM")
            .setSmallIcon(R.drawable.ic_baseline_notifications_24)
            .setContentTitle("Reminder")
            .setContentText(content)
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .setAutoCancel(true);

        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(context);

// notificationId is a unique int for each notification that you must define
        notificationManager.notify(id, builder.build());
        id++;
    }
}
