package gitam.edu.apssdc.bommini.services;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dostart(View view) {
        Intent i=new Intent(this,MyService.class);
        startService(i);
    }

    public void dostop(View view) {
        Intent i=new Intent(this,MyService.class);
        stopService(i);
    }
}
