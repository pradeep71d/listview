package com.example.listitem4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView textView;
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String fest[]={"diwali","holi","dashhara","janamashtmi"};
        textView=findViewById(R.id.t1);
        listView=findViewById(R.id.l1);
        final ArrayAdapter arrayAdapter=new ArrayAdapter(this,R.layout.item_list,R.id.t1,fest);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "happy"+"\t"+arrayAdapter.getItem(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
