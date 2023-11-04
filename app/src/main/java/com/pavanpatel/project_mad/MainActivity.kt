package com.pavanpatel.project_mad

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    private lateinit var ageEditText: EditText
    private lateinit var weightEditText: EditText
    private lateinit var generatePlanButton: Button
    private lateinit var mealPlanTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ageEditText = findViewById(R.id.ageEditText)
        weightEditText = findViewById(R.id.weightEditText)
        generatePlanButton = findViewById(R.id.generatePlanButton)
        mealPlanTextView = findViewById(R.id.mealPlanTextView)

        generatePlanButton.setOnClickListener {
            val age = ageEditText.text.toString().toIntOrNull() ?: 0
            val weight = weightEditText.text.toString().toDoubleOrNull() ?: 0.0

            val suggestedMealPlan = generateSuggestedMealPlan(age, weight)
            mealPlanTextView.text = suggestedMealPlan
        }
    }

    private fun generateSuggestedMealPlan(age: Int, weight: Double): String {
        val suggestedMealPlan = StringBuilder()

        if (age in 1..5) {
            if (weight < 15) {
                // Meal plan for children aged 1 to 5 with weight less than 15 kg
                suggestedMealPlan.append("Breakfast: Oatmeal with sliced bananas\n")
                suggestedMealPlan.append("Snack: Apple slices\n")
                suggestedMealPlan.append("Lunch: Grilled cheese sandwich with carrots\n")
                suggestedMealPlan.append("Snack: Yogurt\n")
                suggestedMealPlan.append("Dinner: Baked chicken nuggets with broccoli\n")
            } else {
                // Meal plan for children aged 1 to 5 with weight 15 kg or more
                suggestedMealPlan.append("Breakfast: Scrambled eggs with whole-grain toast\n")
                suggestedMealPlan.append("Snack: Mixed nuts\n")
                suggestedMealPlan.append("Lunch: Turkey and cheese sandwich with a side salad\n")
                suggestedMealPlan.append("Snack: Greek yogurt with honey\n")
                suggestedMealPlan.append("Dinner: Spaghetti with tomato sauce and vegetables\n")
            }
        } else if (age in 6..16) {
            if (weight < 30) {
                // Meal plan for children and teenagers aged 6 to 16 with weight less than 30 kg
                suggestedMealPlan.append("Breakfast: Cereal with milk\n")
                suggestedMealPlan.append("Snack: Fruit salad\n")
                suggestedMealPlan.append("Lunch: Peanut butter and jelly sandwich with apple slices\n")
                suggestedMealPlan.append("Snack: Cheese and whole-grain crackers\n")
                suggestedMealPlan.append("Dinner: Baked fish with brown rice and peas\n")
            } else {
                // Meal plan for children and teenagers aged 6 to 16 with weight 30 kg or more
                suggestedMealPlan.append("Breakfast: Scrambled eggs with whole-grain toast\n")
                suggestedMealPlan.append("Snack: Mixed nuts\n")
                suggestedMealPlan.append("Lunch: Turkey and cheese sandwich with a side salad\n")
                suggestedMealPlan.append("Snack: Greek yogurt with honey\n")
                suggestedMealPlan.append("Dinner: Spaghetti with tomato sauce and vegetables\n")
            }
        } else if (age in 17..26) {
            // Meal plan for young adults aged 17 to 26
            suggestedMealPlan.append("Breakfast: Greek yogurt with berries and granola\n")
            suggestedMealPlan.append("Lunch: Quinoa and black bean salad\n")
            suggestedMealPlan.append("Snack: Hummus with carrot and cucumber sticks\n")
            suggestedMealPlan.append("Dinner: Grilled chicken breast with quinoa and roasted vegetables\n")
        } else if (age in 27..40) {
            // Meal plan for adults aged 27 to 40
            suggestedMealPlan.append("Breakfast: Spinach and feta omelet\n")
            suggestedMealPlan.append("Lunch: Salmon and avocado salad\n")
            suggestedMealPlan.append("Snack: Almonds and dried fruit\n")
            suggestedMealPlan.append("Dinner: Grilled shrimp with brown rice and asparagus\n")
        } else if (age in 41..60) {
            // Meal plan for adults aged 41 to 60
            suggestedMealPlan.append("Breakfast: Whole-grain cereal with low-fat milk\n")
            suggestedMealPlan.append("Lunch: Turkey and cranberry wrap with a side of mixed greens\n")
            suggestedMealPlan.append("Snack: Greek yogurt with almonds\n")
            suggestedMealPlan.append("Dinner: Baked cod with quinoa and steamed broccoli\n")
        } else {
            // Meal plan for individuals aged 60+
            suggestedMealPlan.append("Breakfast: Oatmeal with prunes and a glass of orange juice\n")
            suggestedMealPlan.append("Lunch: Minestrone soup with a whole-grain roll\n")
            suggestedMealPlan.append("Snack: Cottage cheese with pineapple\n")
            suggestedMealPlan.append("Dinner: Grilled salmon with sweet potato and green beans\n")
        }

        return suggestedMealPlan.toString()
    }

}
