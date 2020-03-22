package gitam.edu.apssdc.bommini.implectintent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=findViewById(R.id.et_text);
    }

    public void share(View view) {
        String s=et.getText().toString();
        ShareCompat.IntentBuilder.
                from(this).setType("plane/text")
                .setChooserTitle("Choose any app")
                .setText(s)
                .startChooser();

    }

}
