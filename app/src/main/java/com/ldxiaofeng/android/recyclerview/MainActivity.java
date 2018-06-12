package com.ldxiaofeng.android.recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFruits();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);

        FruitAdapter adapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
    }
    private void initFruits(){
        for(int i=0;i<2;i++){
            Fruit apple = new Fruit("苹果",R.drawable.apple_pic);
            fruitList.add(apple);
            Fruit banana = new Fruit("香蕉",R.drawable.banana_pic);
            fruitList.add(banana);
            Fruit orange = new Fruit("桔子",R.drawable.orange_pic);
            fruitList.add(orange);
            Fruit watermelon = new Fruit("西瓜",R.drawable.watermelon_pic);
            fruitList.add(watermelon);
            Fruit pear = new Fruit("梨子",R.drawable.pear_pic);
            fruitList.add(pear);
            Fruit grape = new Fruit("葡萄",R.drawable.grape_pic);
            fruitList.add(grape);
            Fruit pineapple = new Fruit("菠萝",R.drawable.pineapple_pic);
            fruitList.add(pineapple);
            Fruit strawberry = new Fruit("草莓",R.drawable.strawberry_pic);
            fruitList.add(strawberry);
            Fruit cherry = new Fruit("樱桃",R.drawable.cherry_pic);
            fruitList.add(cherry);
            Fruit mango = new Fruit("芒果",R.drawable.mango_pic);
            fruitList.add(mango);
        }
    }
}
