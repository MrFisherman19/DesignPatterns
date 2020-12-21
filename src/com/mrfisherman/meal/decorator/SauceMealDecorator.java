package com.mrfisherman.meal.decorator;

import com.mrfisherman.meal.Meal;

public class SauceMealDecorator extends MealDecorator {

    public SauceMealDecorator(Meal meal) {
        super(meal);
    }

    public void addSauce() {
        System.out.println("Sauce was added!");
    }

    @Override
    public void prepareMeal() {
        super.prepareMeal();
        addSauce();
    }
}
