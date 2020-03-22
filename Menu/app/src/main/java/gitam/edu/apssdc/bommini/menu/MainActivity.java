package gitam.edu.apssdc.bommini.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.mymenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){

            case R.id.mysettings:
                Toast.makeText(this, "meru select chesaru settings", Toast.LENGTH_SHORT).show();

               // Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
                break;
            case R.id.myabout:
                Toast.makeText(this, "wowwww you selectoooo about", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mygroup:
                Toast.makeText(this, "hehehe you selectoooo group", Toast.LENGTH_SHORT).show();
                break;
            case R.id.myexit:
                //Toast.makeText(this, "hamayyaa aypoyindhi", Toast.LENGTH_SHORT).show();
                AlertDialog.Builder edoalert=new AlertDialog.Builder(this);
                edoalert.setTitle("Exit");
                edoalert.setMessage("do you want to exit....");
                edoalert.setPositiveButton("avunu", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();

                    }
                });

                edoalert.setNegativeButton("vadhu", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

                edoalert.show();


                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
