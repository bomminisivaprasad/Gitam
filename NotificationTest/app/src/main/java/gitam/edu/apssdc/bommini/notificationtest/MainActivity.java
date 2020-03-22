package gitam.edu.apssdc.bommini.notificationtest;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    NotificationManager manager;
    NotificationCompat.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager= (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        simplemethod();

    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private void simplemethod() {

        NotificationChannel channel=new NotificationChannel("nikuendhuku","this is jombo", NotificationManager.IMPORTANCE_HIGH);
        channel.setDescription("this is channel");
        channel.enableLights(true);
        channel.enableVibration(true);
        channel.setLightColor(Color.RED);
        manager.createNotificationChannel(channel);
    }

    public void donotify(View view) {

        builder=new NotificationCompat.Builder(this,"nikuendhuku");
        builder.setContentTitle("Notification");
        builder.setContentText("hehehe you got notification");
        builder.setSmallIcon(R.mipmap.ic_launcher);

        manager.notify(1,builder.build());
    }
}
