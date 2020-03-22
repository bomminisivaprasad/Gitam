package gitam.edu.apssdc.bommini.broadcastreciver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;

public class MyReceiver extends BroadcastReceiver {
ImageView img;
    public MyReceiver(ImageView imageView) {
        this.img=imageView;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        switch (intent.getAction()){
            case Intent.ACTION_POWER_CONNECTED:
                img.setImageResource(R.drawable.img2);
                break;
            case Intent.ACTION_POWER_DISCONNECTED:
                img.setImageResource(R.drawable.img1);
                break;
        }
    }
}
