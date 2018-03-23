package com.example.shamshir.myapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.shamshir.models.Result;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by shamshir on 22/03/18.
 */

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {



    private Context mCx ;
    private List<Result> productList;



    public ProductAdapter(Context mCx, List<Result> productList) {
        this.mCx = mCx;
        this.productList = productList;
    }


    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(mCx);
        View view = inflater.inflate(R.layout.list_layout,null);
        return new ProductViewHolder(view);

    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {

        Result product = productList.get(position);

        holder.textViewTitle.setText(product.getCell());
        holder.textViewDesc.setText(product.getName().getFirst());
        holder.textViewRating.setText(String.valueOf(product.getEmail()));
        holder.textViewPrice.setText(String.valueOf(product.getPhone()));
        Picasso.with(mCx)
                .load(productList.get(position).getPicture().getLarge())
                .placeholder(R.drawable.bird)
                .into(holder.imageView);


    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {


        ImageView imageView ;
        TextView textViewTitle,textViewDesc,textViewRating,textViewPrice;

        public ProductViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewDesc = itemView.findViewById(R.id.textViewShortDesc);
            textViewRating = itemView.findViewById(R.id.textViewRating);
            textViewPrice = itemView.findViewById(R.id.textViewPrice);




        }
    }
}
