package com.mrfisherman.meal.decorator;

import com.mrfisherman.meal.Meal;

public class ShrimpMealDecorator extends MealDecorator {

    public ShrimpMealDecorator(Meal meal) {
        super(meal);
    }

    public void addShrimps() {
        System.out.println("Shrimps were added!");
    }

    @Override
    public void prepareMeal() {
        super.prepareMeal();
        addShrimps();
    }
}
