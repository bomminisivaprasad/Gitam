package gitam.edu.apssdc.bommini.mytask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
RecyclerView rc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rc=findViewById(R.id.rc_cycler);
        String[] loc_name={"Vijayawada","Gumtur","Visakhapatnam","Nellore","Tirupati","Tenali",};
        int[] img={R.drawable.aplogo,R.drawable.aplogo,R.drawable.aplogo,R.drawable.aplogo,R.drawable.aplogo,R.drawable.aplogo};
        MyAdapter adapter=new MyAdapter(this,loc_name,img);
        rc.setAdapter(adapter);
        rc.setLayoutManager(new LinearLayoutManager(this));

    }
}
