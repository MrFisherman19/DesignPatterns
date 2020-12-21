package com.mrfisherman;

import com.mrfisherman.meal.Meal;
import com.mrfisherman.meal.PotatoMeal;
import com.mrfisherman.meal.RiceMeal;
import com.mrfisherman.meal.decorator.ChickenMealDecorator;
import com.mrfisherman.meal.decorator.SauceMealDecorator;
import com.mrfisherman.meal.decorator.ShrimpMealDecorator;

public class Main {

    public static void main(String[] args) {
        System.out.println("New meal:");
        Meal riceMeal = new RiceMeal();
        riceMeal.prepareMeal();

        System.out.println("New meal:");
        Meal shrimpsWithSauceMeal = new SauceMealDecorator(new ShrimpMealDecorator(new RiceMeal()));
        shrimpsWithSauceMeal.prepareMeal();

        System.out.println("New meal:");
        Meal chickenPotatoMeal = new SauceMealDecorator(new ChickenMealDecorator(new PotatoMeal()));
        chickenPotatoMeal.prepareMeal();
    }
}
