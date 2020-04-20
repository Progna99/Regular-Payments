package com.example.recycler;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;



public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {


    //this context we will use to inflate the layout
    private Context mCtx;

    //we are storing all the products in a list
    private List<Product> productList;

    //getting the context and product list with constructor
    public ProductAdapter(Context mCtx, List<Product> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.layout_products, null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {

        Product product = productList.get(position);



        holder.textViewTitle.setText(product.getName());
        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(product.getImg()));
        holder.textViewShortDesc.setText(product.getPayment());
        holder.textViewRating.setText(String.valueOf(product.getWeeklyText()));
        holder.textViewPrice.setText(String.valueOf(product.getRsText()));



    }


    @Override
    public int getItemCount() {
        return productList.size();
    }


    class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView textViewTitle, textViewShortDesc, textViewRating, textViewPrice;
        ImageView imageView;

        public ProductViewHolder(View itemView) {
            super(itemView);

            textViewTitle = itemView.findViewById(R.id.nameText);
            imageView = itemView.findViewById(R.id.imageIcon);
            textViewShortDesc = itemView.findViewById(R.id.paymentText);
            textViewRating = itemView.findViewById(R.id.weeklyText);
            textViewPrice = itemView.findViewById(R.id.rsText);

        }
    }
}