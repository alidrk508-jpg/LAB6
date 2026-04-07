package com.example.pizzarecipes.ui;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import com.example.pizzarecipes.R;
import com.example.pizzarecipes.classes.Produit;
import com.example.pizzarecipes.service.ProduitService;

/**
 * Activity that displays the detailed information of a selected pizza.
 * Comments and variable names updated to English.
 */
public class PizzaDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_detail);

        // Retrieve the pizza ID from the intent extras
        long pizzaId = getIntent().getLongExtra("pizza_id", -1);
        
        // Fetch the pizza object from the service
        Produit pizza = ProduitService.getInstance().findById(pizzaId);

        // Bind UI components
        ImageView pizzaImageView = findViewById(R.id.img);
        TextView titleTextView = findViewById(R.id.title);
        TextView metaTextView = findViewById(R.id.meta);
        TextView ingredientsTextView = findViewById(R.id.ingredients);
        TextView descriptionTextView = findViewById(R.id.desc);
        TextView stepsTextView = findViewById(R.id.steps);
        Button backButton = findViewById(R.id.btnBack);

        // Handle back button click to return to the previous screen
        backButton.setOnClickListener(view -> finish());

        // Update UI if pizza exists
        if (pizza != null) {
            pizzaImageView.setImageResource(pizza.getImageRes());
            titleTextView.setText(pizza.getName());
            metaTextView.setText(pizza.getDuration() + " • " + pizza.getPrice() + " €");
            ingredientsTextView.setText(pizza.getIngredients());
            descriptionTextView.setText(pizza.getDescription());
            stepsTextView.setText(pizza.getSteps());
        } else {
            titleTextView.setText("Pizza not found!");
        }
    }
}
