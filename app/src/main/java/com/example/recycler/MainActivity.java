package com.example.recycler;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Product> productList;

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        productList = new ArrayList<>();


        productList.add(
                new Product("Name", R.drawable.lic_icon,"LIC Payment","Weekly starting from 03/04/2019",getResources().getString(R.string.Rs)+" 2000"));

        productList.add(
                new Product(
                        "Name", R.drawable.lic_icon,"LIC Payment","Weekly starting from 03/04/2019",getResources().getString(R.string.Rs)+" 2000"));

        productList.add(
                new Product(
                        "Name", R.drawable.lic_icon,"LIC Payment","Weekly starting from 03/04/2019",getResources().getString(R.string.Rs)+" 2000"));

        productList.add(
                new Product(
                        "Name", R.drawable.lic_icon,"LIC Payment","Weekly starting from 03/04/2019",getResources().getString(R.string.Rs)+" 2000"));

        productList.add(
                new Product(
                        "Name", R.drawable.lic_icon,"LIC Payment","Weekly starting from 03/04/2019",getResources().getString(R.string.Rs)+" 2000"));

        productList.add(
                new Product(
                        "Name", R.drawable.lic_icon,"LIC Payment","Weekly starting from 03/04/2019",getResources().getString(R.string.Rs)+" 2000"));

        productList.add(
                new Product(
                        "Name", R.drawable.lic_icon,"LIC Payment","Weekly starting from 03/04/2019",getResources().getString(R.string.Rs)+" 2000"));

        productList.add(
                new Product(
                        "Name", R.drawable.lic_icon,"LIC Payment","Weekly starting from 03/04/2019",getResources().getString(R.string.Rs)+" 2000"));

        productList.add(
                new Product(
                        "Name", R.drawable.lic_icon,"LIC Payment","Weekly starting from 03/04/2019",getResources().getString(R.string.Rs)+" 2000"));

        productList.add(
                new Product(
                        "Name", R.drawable.lic_icon,"LIC Payment","Weekly starting from 03/04/2019",getResources().getString(R.string.Rs)+" 2000"));

        //creating recyclerview adapter
        ProductAdapter adapter = new ProductAdapter(this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);
    }
}