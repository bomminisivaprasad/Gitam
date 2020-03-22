package gitam.edu.apssdc.bommini.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
int count=0;
TextView view1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view1=findViewById(R.id.text_view);
    }

    public void toast(View view) {
        Toast.makeText(this,
                "Hello Toast",
                Toast.LENGTH_SHORT).show();
    }

    public void count(View view) {
        count++;

        view1.setText(""+count);
    }
}
