package com.example.weirdos_1;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    String d1[],d2[];
    int images[];
    Context context;
    int color[];
    int media[];
    MediaPlayer myMediaPlayer;
    public MyAdapter(Context ct,String s1[],String s2[],int img[],int colors[],int m[]){
        context=ct;
        d1=s1;
        d2=s2;
        images=img;
        color=colors;
        media=m;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.my_row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.myText1.setText(d1[position]);
        holder.myText2.setText(d2[position]);
        holder.myImage.setImageResource(images[position]);
        holder.layout.setBackgroundColor(ContextCompat.getColor(context,color[position]));
        holder.mylayout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                myMediaPlayer = MediaPlayer.create(context, media[position]);
                myMediaPlayer.start();

            }
        });

    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView myText1,myText2;
        ImageView myImage;
        ConstraintLayout layout,mylayout;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            myText1=itemView.findViewById(R.id.textView1);
            myText2=itemView.findViewById(R.id.textView2);
            myImage=itemView.findViewById(R.id.imageView);
            layout=itemView.findViewById(R.id.layout);
            mylayout=itemView.findViewById(R.id.myLayout);
        }
    }
}
