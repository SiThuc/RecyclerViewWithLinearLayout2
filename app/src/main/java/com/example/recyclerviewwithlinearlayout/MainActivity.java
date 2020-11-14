package com.example.recyclerviewwithlinearlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recycler_product;
    private ProductAdapter adapter;
    private List<Product> products;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler_product = (RecyclerView)findViewById(R.id.recycler_product);
        adapter = new ProductAdapter(this);
        products = new ArrayList<>();
        insertData();
        adapter.setData(products);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        recycler_product.setLayoutManager(layoutManager);
        recycler_product.setAdapter(adapter);


    }

    private void insertData() {
        products.add(new Product(R.drawable.phone1, "SmartPhone1"));
        products.add(new Product(R.drawable.phone2, "SmartPhone2"));
        products.add(new Product(R.drawable.phone3, "SmartPhone3"));
        products.add(new Product(R.drawable.phone4, "SmartPhone4"));

        products.add(new Product(R.drawable.phone1, "SmartPhone1"));
        products.add(new Product(R.drawable.phone2, "SmartPhone2"));
        products.add(new Product(R.drawable.phone3, "SmartPhone3"));
        products.add(new Product(R.drawable.phone4, "SmartPhone4"));

        products.add(new Product(R.drawable.phone1, "SmartPhone1"));
        products.add(new Product(R.drawable.phone2, "SmartPhone2"));
        products.add(new Product(R.drawable.phone3, "SmartPhone3"));
        products.add(new Product(R.drawable.phone4, "SmartPhone4"));

    }
}