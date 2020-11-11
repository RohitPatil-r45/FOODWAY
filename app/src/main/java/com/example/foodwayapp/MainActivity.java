package com.example.foodwayapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.foodwayapp.Adapters.MainAdapter;
import com.example.foodwayapp.Models.MainModel;
import com.example.foodwayapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    private Object Menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModel> list = new ArrayList<>();


        list.add(new MainModel(R.drawable.pav_bhaji , "Pav Bhaji" , "70"," fast food spicy dish."));
        list.add(new MainModel(R.drawable.chicken_lollipop , "Chicken Lollipop", "120", " hot and spicy appetizer made with drummettes or whole chicken wings."));
        list.add(new MainModel(R.drawable.misal_pav , "Misal Pav", "60", "a spicy curry usually made out of moth beans and pav"));
        list.add(new MainModel(R.drawable.sprite , "Sprite", "40", " Cold Drink"));
        list.add(new MainModel(R.drawable.idali , "Idali", "50", " A south Indian steamed cake of rice, usually served with sambhar."));
        list.add(new MainModel(R.drawable.chicken_murgh_musallam , "Chicken Murgh Musallam", "540", "  It consists of whole chicken marinated in a ginger-garlic paste, stuffed with boiled eggs and seasoned with spices like saffron, cinnamon, cloves, poppy seeds, cardamom and chilli."));
        list.add(new MainModel(R.drawable.paneer_kadai , "Paneer Kadai", "180", "  Kadai Paneer is a delicious dish made from firm cottage cheese, onions, tomatoes, capsicum (green bell peppers) and Indian spices."));
        list.add(new MainModel(R.drawable.cola, "Coca Cola", "40", "Cold Drink"));

        MainAdapter adapter = new MainAdapter(list , this);
        binding.recyclerview.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerview.setLayoutManager(layoutManager);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.orders:
                startActivity(new Intent(MainActivity.this, OrderActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }



}