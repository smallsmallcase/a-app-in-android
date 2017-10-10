package com.uuch.android_zxinglibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Vegetible_Search extends AppCompatActivity {
    public String data3;
    private List<Fruit> fruitList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetible__search);
        Intent intent=getIntent();
        data3=intent.getStringExtra("extra_data2");

        initFruit();
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        FruitAdapter adapter=new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_scan,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.item_give:
                Intent intent=new Intent(Vegetible_Search.this,ThreeActivity.class);
                intent.putExtra("extral_data","Apple");
                startActivity(intent);
                break;
            case R.id.item_detal:
                Toast.makeText(this,"物种："+data3+"已经添加",Toast.LENGTH_SHORT).show();
                initFruit_add();
                RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
                LinearLayoutManager layoutManager=new LinearLayoutManager(this);
                recyclerView.setLayoutManager(layoutManager);

                FruitAdapter adapter=new FruitAdapter(fruitList);
                recyclerView.setAdapter(adapter);
        }
        return true;
    }

    private void initFruit(){
        for(int i=0;i<2;i++){
            Fruit apple=new Fruit("Apple",R.drawable.apple_pic);
            Fruit banana=new Fruit("Banana",R.drawable.banana_pic);
            Fruit orange=new Fruit("Orange",R.drawable.orange_pic);
            Fruit watermelon=new Fruit("Watermelon",R.drawable.watermelon_pic);
            Fruit pear=new Fruit("Pear",R.drawable.pear_pic);
            Fruit grape=new Fruit("Grape",R.drawable.grape_pic);
            Fruit pineapple=new Fruit("Pineapple",R.drawable.pineapple_pic);
            Fruit strawberry=new Fruit("Strawberry",R.drawable.strawberry_pic);
            Fruit cherry=new Fruit("Cherry",R.drawable.cherry_pic);
            Fruit mango=new Fruit("Mango",R.drawable.mango_pic);

            fruitList.add(apple);
            fruitList.add(banana);
            fruitList.add(orange);
            fruitList.add(watermelon);
            fruitList.add(pear);
            fruitList.add(grape);
            fruitList.add(pineapple);
            fruitList.add(strawberry);
            fruitList.add(cherry);
            fruitList.add(mango);


        }
    }

    private void initFruit_add(){
        Fruit apple=new Fruit("Apple",R.drawable.apple_pic);
        Fruit banana=new Fruit("Banana",R.drawable.banana_pic);
        Fruit orange=new Fruit("Orange",R.drawable.orange_pic);
        Fruit watermelon=new Fruit("Watermelon",R.drawable.watermelon_pic);
        Fruit pear=new Fruit("Pear",R.drawable.pear_pic);
        Fruit grape=new Fruit("Grape",R.drawable.grape_pic);
        Fruit pineapple=new Fruit("Pineapple",R.drawable.pineapple_pic);
        Fruit strawberry=new Fruit("Strawberry",R.drawable.strawberry_pic);
        Fruit cherry=new Fruit("Cherry",R.drawable.cherry_pic);
        Fruit mango=new Fruit("Mango",R.drawable.mango_pic);
            fruitList.add(apple);
            fruitList.add(banana);
            fruitList.add(orange);
            fruitList.add(watermelon);
            fruitList.add(pear);
            fruitList.add(grape);
            fruitList.add(pineapple);
            fruitList.add(strawberry);
            fruitList.add(cherry);
            fruitList.add(mango);


        switch (data3){
            case "Apple":
                fruitList.add(apple);
            break;

            case "Banana":
                fruitList.add(banana);
            break;

            case "Orange":
                fruitList.add(orange);
            break;

            case "Watermelon":
                fruitList.add(watermelon);
            break;

            case "Pear":
                fruitList.add(pear);
            break;

            case "Grape":
                fruitList.add(grape);
            break;

            case "Pineapple":
                fruitList.add(pineapple);
            break;

            case "Strawberry":
                fruitList.add(strawberry);
            break;
            case "Cherry":
                fruitList.add(cherry);
            break;

            case "Mango":
                fruitList.add(mango);
            break;
             default:
                 Toast.makeText(this,"物种："+data3+"不合法",Toast.LENGTH_SHORT).show();
                 data3=null;
        }

    }
}
