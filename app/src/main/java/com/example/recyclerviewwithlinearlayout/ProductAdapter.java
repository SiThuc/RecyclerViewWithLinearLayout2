package com.example.recyclerviewwithlinearlayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.MyViewHolder> {
    private Context context;
    private List<Product> products;

    public ProductAdapter(Context context) {
        this.context = context;
    }

    public void setData(List<Product> pList){
        products = pList;
        notifyDataSetChanged();
    }



    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.layout_product_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.img_product.setImageResource(products.get(position).getImgSource());
        holder.txt_product_name.setText(products.get(position).getName());
        

    }

    @Override
    public int getItemCount() {
        if (products != null)
            return products.size();
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private CircleImageView img_product;
        private TextView txt_product_name;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            img_product = (CircleImageView) itemView.findViewById(R.id.img_product);
            txt_product_name = (TextView) itemView.findViewById(R.id.txt_product_name);

        }
    }
}
