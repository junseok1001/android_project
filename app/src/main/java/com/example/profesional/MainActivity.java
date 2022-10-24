package com.example.profesional;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //        final String[] ListMenu = {"리스트01","리스트02", "리스트03", "리스트04"};
        final String[] listMenu = getResources().getStringArray(R.array.sports_array);
        final String[] listContent = getResources().getStringArray(R.array.contents_array);

//        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,ListMenu);
        CustomAdapter adapter = new CustomAdapter(this, listMenu);
        ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, ContentActivity.class);
                intent.putExtra("key", listContent[position]);
                startActivity(intent);
                finish();
            }
        });
    }
}

