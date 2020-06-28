package com.example.weirdos_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    int[] images= {R.drawable.adu_nayak,R.drawable.ankan_swain,R.drawable.ankush,R.drawable.asis,R.drawable.binu,R.drawable.chandu,R.drawable.sona};
    String s1[],s2[];
    int colorResourceid[]={R.color.adu,R.color.anakan,R.color.ankush,R.color.asis,R.color.binu,R.color.chandu,R.color.sona};
    int media[]={R.raw.adu,R.raw.ankan,R.raw.ankush,R.raw.asis,R.raw.binu,R.raw.chandu,R.raw.sonakshy};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);
        s1=getResources().getStringArray(R.array.name);
        s2=getResources().getStringArray(R.array.voice);
        MyAdapter myAdapter=new MyAdapter(this,s1,s2,images,colorResourceid,media);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
