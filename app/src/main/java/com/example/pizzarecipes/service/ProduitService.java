package com.example.pizzarecipes.service;

import com.example.pizzarecipes.classes.Produit;
import com.example.pizzarecipes.dao.IDao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Service class to handle Pizza data operations.
 * English comments added as requested.
 */
public class ProduitService implements IDao<Produit> {

    private static ProduitService INSTANCE;
    private final List<Produit> pizzaData = new ArrayList<>();

    private ProduitService() {
        seedData(); // Initialize with sample data
    }

    public static ProduitService getInstance() {
        if (INSTANCE == null) INSTANCE = new ProduitService();
        return INSTANCE;
    }

    /**
     * Seeds the initial list of pizzas with English descriptions and steps.
     */
    private void seedData() {
        pizzaData.add(new Produit("BARBECUED CHICKEN PIZZA", 13.0,
                com.example.pizzarecipes.R.mipmap.pizza1, "35 min",
                "- 2 boneless skinless chicken breast halves\n- 1 cup barbecue sauce\n- Red onions",
                "A delicious and smoky BBQ chicken pizza.",
                "STEP 1: Grill the chicken.\nSTEP 2: Spread BBQ sauce and add toppings.\nSTEP 3: Bake until golden."));
        
        pizzaData.add(new Produit("SPINACH PIZZA", 12.0,
                com.example.pizzarecipes.R.mipmap.pizza2, "25 min",
                "- Alfredo sauce, fresh spinach, tomatoes, mozzarella.",
                "Creamy and light vegetable-based pizza.",
                "STEP 1: Roll out the dough.\nSTEP 2: Add Alfredo sauce and toppings.\nSTEP 3: Bake in oven."));

        pizzaData.add(new Produit("MUSHROOM PIZZA", 11.5,
                com.example.pizzarecipes.R.mipmap.pizza3, "30 min",
                "- Fresh mushrooms, tomato sauce, mozzarella cheese.",
                "Savory pizza topped with earthy mushrooms.",
                "STEP 1: Sauté the mushrooms.\nSTEP 2: Layer sauce and cheese.\nSTEP 3: Bake until bubbly."));

        pizzaData.add(new Produit("CHEESE PIZZA", 10.5,
                com.example.pizzarecipes.R.mipmap.pizza4, "20 min",
                "- Classic blend of four cheeses.",
                "The timeless classic for all cheese lovers.",
                "STEP 1: Add cheese blend.\nSTEP 2: Bake until crust is golden brown."));

        pizzaData.add(new Produit("VEGGIE PIZZA", 12.5,
                com.example.pizzarecipes.R.mipmap.pizza5, "25 min",
                "- Bell peppers, onions, olives, fresh tomatoes.",
                "A burst of healthy vegetable flavors.",
                "STEP 1: Chop veggies.\nSTEP 2: Garnish dough and bake."));

        pizzaData.add(new Produit("PEPPERONI PIZZA", 14.0,
                com.example.pizzarecipes.R.mipmap.pizza6, "15 min",
                "- Beef pepperoni slices, tomato sauce, mozzarella.",
                "The most popular choice worldwide.",
                "STEP 1: Spread sauce.\nSTEP 2: Add pepperoni and bake fast."));

        pizzaData.add(new Produit("HAWAIIAN PIZZA", 13.5,
                com.example.pizzarecipes.R.mipmap.pizza7, "20 min",
                "- Turkey ham, pineapple chunks, tomato sauce.",
                "The perfect sweet and savory combination.",
                "STEP 1: Add ham.\nSTEP 2: Add pineapple and bake."));

        pizzaData.add(new Produit("MEAT LOVERS PIZZA", 16.0,
                com.example.pizzarecipes.R.mipmap.pizza8, "40 min",
                "- Minced beef, ham, pepperoni, sausage.",
                "Hearty pizza loaded with multiple meats.",
                "STEP 1: Cook the meats.\nSTEP 2: Pile everything on and bake long."));

        pizzaData.add(new Produit("SEAFOOD PIZZA", 17.5,
                com.example.pizzarecipes.R.mipmap.pizza9, "30 min",
                "- Shrimps, mussels, calamari, garlic oil.",
                "Refined flavors of the ocean on a crust.",
                "STEP 1: Prepare seafood mix.\nSTEP 2: Fast bake at high temp."));

        pizzaData.add(new Produit("BUFFALO CHICKEN PIZZA", 15.0,
                com.example.pizzarecipes.R.mipmap.pizza10, "35 min",
                "- Chicken strips, Buffalo hot sauce, red onions.",
                "Spicy and bold pizza with a kick.",
                "STEP 1: Toss chicken in sauce.\nSTEP 2: Bake with blue cheese drizzle."));

        // New item added for Better Call Saul fans
        pizzaData.add(new Produit("POLLOS HERMANOS SPECIAL", 18.0,
                com.example.pizzarecipes.R.mipmap.polos, "45 min",
                "- Los Pollos secret spice blend fried chicken\n- Southwest peppers\n- Zesty sauce",
                "Taste the quality of Gus Fring's finest chicken on a crispy pizza crust. One bite and you'll be a regular.",
                "STEP 1: Prepare the secret spice chicken.\nSTEP 2: Layer with Southwest peppers.\nSTEP 3: Bake to perfection as if the boss is watching."));
    }

    @Override
    public Produit create(Produit p) {
        pizzaData.add(p);
        return p;
    }

    @Override
    public Produit update(Produit p) {
        for (int i = 0; i < pizzaData.size(); i++) {
            if (pizzaData.get(i).getId() == p.getId()) {
                pizzaData.set(i, p);
                return p;
            }
        }
        return null;
    }

    @Override
    public boolean delete(long id) {
        return pizzaData.removeIf(x -> x.getId() == id);
    }

    @Override
    public Produit findById(long id) {
        for (Produit p : pizzaData) if (p.getId() == id) return p;
        return null;
    }

    @Override
    public List<Produit> findAll() {
        return Collections.unmodifiableList(pizzaData);
    }
}
