package gitam.edu.apssdc.bommini.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText text;
Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show();
        Log.i("activity","OnCreate");
        text=findViewById(R.id.et_text);
        bt=findViewById(R.id.next);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,
                        Main2Activity.class);
                String s=text.getText().toString();
                i.putExtra("gitam",s);
                startActivity(i);


            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "On Start", Toast.LENGTH_SHORT).show();
        Log.i("activity","OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onresume", Toast.LENGTH_SHORT).show();
        Log.i("activity","Onresume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Onpause", Toast.LENGTH_SHORT).show();
        Log.i("activity","Onpause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
        Log.i("activity","onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
        Log.i("activity","onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
        Log.i("activity","onDestroy");
    }
}
