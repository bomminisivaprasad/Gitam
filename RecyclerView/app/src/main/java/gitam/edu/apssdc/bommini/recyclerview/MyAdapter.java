package gitam.edu.apssdc.bommini.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends
        RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    MainActivity context;
    String[] strings;
    int[] images;
    public MyAdapter(MainActivity mainActivity, String[] data, int[] image) {
   this.context=mainActivity;
   this.strings=data;
   this.images=image;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       View v= LayoutInflater.from(context).inflate(R.layout.row,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.img.setImageResource(images[position]);
        holder.jiotv.setText(strings[position]);
    }

    @Override
    public int getItemCount() {
        return strings.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView jiotv;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            img=itemView.findViewById(R.id.img);
            jiotv=itemView.findViewById(R.id.text_view);

        }
    }
}
