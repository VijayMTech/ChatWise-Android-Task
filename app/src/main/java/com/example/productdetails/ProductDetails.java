package com.example.productdetails;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class ProductDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_description);

        ImageView tvProductImage = findViewById(R.id.tvProductImage);
        TextView tvProductTitle = findViewById(R.id.tvProductTitle);
        TextView tvProductDescription = findViewById(R.id.tvProductDescription);
        TextView tvProductCategory = findViewById(R.id.tvProductCategory);
        TextView tvProductPrice = findViewById(R.id.tvProductPrice);
        TextView tvProductDiscountPercentage = findViewById(R.id.tvProductDiscountPercentage);
        TextView tvProductRating = findViewById(R.id.tvProductRating);
        TextView tvProductStock = findViewById(R.id.tvProductStock);
        TextView tvProductBrand = findViewById(R.id.tvProductBrand);

        // Get data from intent
        String title = getIntent().getStringExtra("title");
        String description = getIntent().getStringExtra("description");
        String category = getIntent().getStringExtra("category");
        float price = getIntent().getFloatExtra("price", 0.0f);
        float discountPercentage = getIntent().getFloatExtra("discountPercentage", 0.0f);
        float rating = getIntent().getFloatExtra("rating", 0.0f);
        String imageUrl = getIntent().getStringExtra("thumbnail"); // Use thumbnail instead of imageUrl
        int stock = getIntent().getIntExtra("stock",0);
        String brand = getIntent().getStringExtra("brand");

        tvProductTitle.setText(title);
        tvProductDescription.setText(description);
        tvProductCategory.setText(category);
        tvProductPrice.setText(String.valueOf(price));
        tvProductDiscountPercentage.setText(String.valueOf(discountPercentage));
        tvProductRating.setText(String.valueOf(rating));
        tvProductStock.setText(String.valueOf(stock));
        tvProductBrand.setText(brand);

        Glide.with(this)
                .load(imageUrl)
                .into(tvProductImage);
    }
}
