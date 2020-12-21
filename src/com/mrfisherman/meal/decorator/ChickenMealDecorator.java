package com.mrfisherman.meal.decorator;

import com.mrfisherman.meal.Meal;

public class ChickenMealDecorator extends MealDecorator {

    public ChickenMealDecorator(Meal meal) {
        super(meal);
    }

    public void addChicken() {
        System.out.println("Chicken was added!");
    }

    @Override
    public void prepareMeal() {
        super.prepareMeal();
        addChicken();
    }
}
