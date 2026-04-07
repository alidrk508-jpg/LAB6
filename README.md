# PizzaRecipes - LAB 6

An Android application that displays a collection of delicious pizza recipes. This project was developed as part of **LAB 6 - Application "Recettes de Pizza"**.

[![Watch the video](images/demo.png)](VD/demo.mp4)

## 📱 Features

- **Splash Screen**: A vibrant orange entry screen with the project title and a pizza icon.
- **Pizza List**: A scrollable list of various pizzas with their names, prices, and preparation times.
- **Detailed View**: View complete details for each pizza, including:
  - High-quality image
  - Ingredients list
  - Short description
  - Step-by-step preparation guide
- **Pollos Hermanos Special**: A special item for *Better Call Saul* fans featuring Gus Fring's famous chicken.
- **Navigation**: Easy "Back" button to return from the details to the main list.
- **English Documentation**: The codebase is fully commented in English for better international understanding.

## 🛠️ Technical Stack

- **Language**: Java
- **Architecture**: DAO Pattern with Singleton Service.
- **UI Components**:
  - `ListView` for the pizza collection.
  - `ConstraintLayout` & `ScrollView` for responsive detail pages.
  - `BaseAdapter` for custom list rendering.
- **Resources**: Custom `mipmap` icons and images.

## 📂 Project Structure

- `com.example.pizzarecipes.classes`: Contains the `Produit` model.
- `com.example.pizzarecipes.dao`: Data Access Object interface.
- `com.example.pizzarecipes.service`: `ProduitService` managing the pizza data (Singleton).
- `com.example.pizzarecipes.adapter`: Custom `PizzaAdapter` for the list.
- `com.example.pizzarecipes.ui`: Contains `SplashActivity`, `ListPizzaActivity`, and `PizzaDetailActivity`.

## 🚀 How to Run

1. Clone the repository.
2. Open the project in **Android Studio**.
3. Sync Gradle and build the project.
4. Run the app on an emulator or a physical Android device.

## 🎨 Design

The app features a warm, food-inspired color palette:
- **Splash Background**: `#FF5722` (Deep Orange)
- **Content Background**: `#FFF3E0` (Light Cream)

---
*Developed for Android Development LAB 6.*
