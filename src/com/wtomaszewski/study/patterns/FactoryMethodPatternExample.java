package com.wtomaszewski.study.patterns;

import com.wtomaszewski.study.patterns.factoryMethod.BeefBurgerRestaurantFactory;
import com.wtomaszewski.study.patterns.factoryMethod.Burger;
import com.wtomaszewski.study.patterns.factoryMethod.BurgerRestaurantFactory;
import com.wtomaszewski.study.patterns.factoryMethod.VegeBurgerRestaurantFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FactoryMethodPatternExample implements IPatternExample{

    // let's assume that I want to add new restaurant - MuttonBurgerRestaurant - there will be a need to:
    // - create new MuttonBurger
    // - create new MuttonBurgerRestaurantFactory
    // - add new MuttonBurgerRestaurantFactory to burgerRestaurantFactories
    @Override
    public void implementPatternExample() {
        final List<BurgerRestaurantFactory> burgerRestaurantFactories = Arrays.asList(
            new BeefBurgerRestaurantFactory(),
            new VegeBurgerRestaurantFactory()
        );

        final List<Burger> preparedBurgers = new ArrayList<>();
        final int numberOfEachBurgerToPrepare = 2;

        burgerRestaurantFactories.forEach(factory -> {
            for(int i=0; i<numberOfEachBurgerToPrepare; i++) {
                preparedBurgers.add(factory.orderBurger());
            }
        });

        System.out.printf("Prepared %s burgers", preparedBurgers.size());

        //  Database Drivers:
        //
        //  Consider a database access library that needs to support multiple database management systems (DBMS) such
        //  as MySQL, PostgreSQL, and SQLite. Using the Factory Method pattern, you can define an interface for a DatabaseConnection
        //  and have concrete implementations like MySQLConnection, PostgreSQLConnection, etc. Each of these implementations would
        //  have its own factory method to create the specific database connection object.
        //
        //  Document Converters:
        //
        //  In a document conversion application, you might have different converters for various document formats like PDF, Word, and HTML.
        //  The Factory Method pattern allows you to define a common DocumentConverter interface and implement specific converters
        //  (e.g., PDFConverter, WordConverter). Each converter can have its own factory method to create document-specific objects.
    }
}
