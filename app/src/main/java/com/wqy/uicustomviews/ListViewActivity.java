package com.wqy.uicustomviews;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wqy on 2015/12/1.
 */
public class ListViewActivity extends Activity {
//    private String[] data = {"Apple","Banana","Orange","Watermelon","孙悟空","猪八戒","潘金莲","武松"};
    private List<Fruit> fruitList = new ArrayList<Fruit>();
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_layout);
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ListViewActivity.this,android.R.layout.simple_list_item_1,data);
//        ListView listView = (ListView)findViewById(R.id.list_view);
//        listView.setAdapter(adapter);

        initFruits();
        FruitAdapter adapter = new FruitAdapter(ListViewActivity.this,R.layout.fruit_item,fruitList);
        ListView listView = (ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Fruit fruit = fruitList.get(i);
                Toast.makeText(ListViewActivity.this,"这是限量版的"+fruit.getName(),Toast.LENGTH_SHORT).show();
                float xdpi = getResources().getDisplayMetrics().xdpi;
                float ydpi = getResources().getDisplayMetrics().ydpi;
                Log.d("ListViewActivity","xdpi is"+xdpi);
                Log.d("ListViewActivity","ydpi is"+ydpi);
            }
        });
    }

    private void initFruits(){
        fruitList.add(new Fruit("标致", R.drawable.car_001));
        fruitList.add(new Fruit("路虎", R.drawable.car_002));
        fruitList.add(new Fruit("现代",R.drawable.car_003));
        fruitList.add(new Fruit("奇瑞",R.drawable.car_004));
        fruitList.add(new Fruit("奔驰",R.drawable.car_005));
        fruitList.add(new Fruit("奥迪", R.drawable.car_006));
        fruitList.add(new Fruit("劳斯莱斯",R.drawable.car_007));
        fruitList.add(new Fruit("幻影", R.drawable.car_008));

    }
    public List<Fruit> getFruitList() {
        return fruitList;
    }
}
