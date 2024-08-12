package com.example.productdetails;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final Context context;
    private final List<Object> items;

    // Define constants for view types
    private static final int VIEW_TYPE_TITLE = 0;
    private static final int VIEW_TYPE_PRODUCT = 1;

    public ProductAdapter(Context context, List<Object> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getItemViewType(int position) {
        if (items.get(position) instanceof String) {
            return VIEW_TYPE_TITLE;
        } else if (items.get(position) instanceof Product) {
            return VIEW_TYPE_PRODUCT;
        }
        return -1;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == VIEW_TYPE_TITLE) {
            View view = LayoutInflater.from(context).inflate(R.layout.item_title, parent, false);
            return new TitleViewHolder(view);
        } else {
            View view = LayoutInflater.from(context).inflate(R.layout.item_product, parent, false);
            return new ProductViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder.getItemViewType() == VIEW_TYPE_TITLE) {
            TitleViewHolder titleHolder = (TitleViewHolder) holder;
            titleHolder.bindTitle((String) items.get(position));
        } else {
            ProductViewHolder productHolder = (ProductViewHolder) holder;
            Product product = (Product) items.get(position);
            productHolder.bindProduct(product);

            productHolder.itemView.setOnClickListener(v -> {
                Intent intent = new Intent(context, ProductDetails.class);
                intent.putExtra("thumbnail", product.getThumbnail()); // Update key here
                intent.putExtra("title", product.getTitle());
                intent.putExtra("description", product.getDescription());
                intent.putExtra("category", product.getCategory());
                intent.putExtra("price", product.getPrice());
                intent.putExtra("discountPercentage", product.getDiscountPercentage());
                intent.putExtra("rating", product.getRating());
                intent.putExtra("stock",product.getStock());
                intent.putExtra("brand",product.getBrand());

                context.startActivity(intent);
            });
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    // ViewHolder for title
    public static class TitleViewHolder extends RecyclerView.ViewHolder {
        private final TextView tvTitle;

        public TitleViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTitle);
        }

        public void bindTitle(String title) {
            tvTitle.setText(title);
        }
    }

    // ViewHolder for products
    public static class ProductViewHolder extends RecyclerView.ViewHolder {
        private final ImageView tvProductThumbnail;
        private final TextView tvProductTitle;
        private final TextView tvProductDescription;
        private final TextView tvProductCategory;
        private final TextView tvProductPrice;
        private final TextView tvProductDiscountPercentage;
        private final TextView tvProductRating;
        private final TextView tvProductStock;

        private final TextView tvProductBrand;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            tvProductThumbnail = itemView.findViewById(R.id.tvProductThumbnail);
            tvProductTitle = itemView.findViewById(R.id.tvProductTitle);
            tvProductDescription = itemView.findViewById(R.id.tvProductDescription);
            tvProductCategory = itemView.findViewById(R.id.tvProductCategory);
            tvProductPrice = itemView.findViewById(R.id.tvProductPrice);
            tvProductDiscountPercentage = itemView.findViewById(R.id.tvProductDiscountPercentage);
            tvProductRating = itemView.findViewById(R.id.tvProductRating);
            tvProductStock = itemView.findViewById(R.id.tvProductStock);
            tvProductBrand = itemView.findViewById(R.id.tvProductBrand);
        }

        public void bindProduct(Product product) {
            tvProductTitle.setText(product.getTitle());
            tvProductDescription.setText(product.getDescription());
            // Load thumbnail using Glide
            Glide.with(itemView.getContext())
                    .load(product.getThumbnail())
                    .into(tvProductThumbnail);
        }
    }
}
