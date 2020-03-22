package gitam.edu.apssdc.bommini.recyclerview;

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
        rc=findViewById(R.id.re_cyclerview);
        String data[]={"Alpha","Beta","Cupcake","Donut","IcecreamSandwich",
                "Jellybean","Kitkat","Lolipap","Marshmallow","Nagot","Oreo","Pie","AndroidX"};
        int image[]={R.drawable.alpha,R.mipmap.ic_launcher,
                R.drawable.cupcake,R.drawable.donut,R.drawable.eclair,
                R.drawable.froyo,R.drawable.gingerbread,R.drawable.honeycomb
                ,R.drawable.icecreamsandwich,R.drawable.jellybean,R.mipmap.ic_launcher,
                R.drawable.lolipap,R.drawable.marshmallow,R.drawable.nagot,R.drawable.oreo,
                R.drawable.pie,R.drawable.androidx};
        MyAdapter adapter=new MyAdapter(this,data,image);
        rc.setAdapter(adapter);
        rc.setLayoutManager(new LinearLayoutManager(this));
    }
}
