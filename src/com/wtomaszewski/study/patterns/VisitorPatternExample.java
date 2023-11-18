package com.wtomaszewski.study.patterns;

import com.wtomaszewski.study.patterns.visitor.*;

import java.util.Arrays;
import java.util.List;

public class VisitorPatternExample implements IPatternExample{

    // let's assume that I want to add new companyBVisitor then I will need to create
    // new CompanyBVisitor class and the logic will be the same

    // let's assume that I want to add new building f.e. GroceryShop then I will need
    // to create new GroceryShop class and add new method visitGroceryShop in InsureerVisitor interface

    // it's easier to add new visitor but harder to add new element to visit
    @Override
    public void implementPatternExample() {
        InsurerVisitor companyAVisitor = new CompanyAInsurerVisitor();
        List<Building> buildinsOnStreet = Arrays.asList(
                new InhabitedHouse("Long Road 1"),
                new InhabitedHouse("Long Road 2"),
                new InhabitedHouse("Long Road 3"),
                new InhabitedHouse("Long Road 4"),
                new CoffeeHouse("Long Road 5"),
                new InhabitedHouse("Long Road 6"),
                new BankHouse("Long Road 7"),
                new InhabitedHouse("Long Road 8")
        );
        buildinsOnStreet.forEach(building -> {
            building.accept(companyAVisitor);
        });

        // Document Element Processing:
        //
        // Suppose you have a document structure with different elements like paragraphs,
        // images, and tables. You might want to perform various operations, such as rendering,
        // counting words, or generating HTML, without modifying the existing document classes.
        // A visitor pattern can help encapsulate these operations in separate visitor classes.
        //
        // GUI Components:
        //
        // In a graphical user interface (GUI) framework, you may have a hierarchy of UI components
        // like buttons, panels, and text fields. Introducing new behaviors, such as validation or theme
        // changes, can be achieved using the Visitor pattern. Each new behavior can be implemented in a
        // separate visitor class.
        //
        // Database Query Generation:
        //
        // In an object-relational mapping (ORM) system, you may have a hierarchy of classes representing
        // database entities. Visitors can be used to generate database queries for different types of entities.
        // This allows you to keep the query generation logic separate from the entity classes.
        //
        // File System Operations:
        //
        // Consider a file system with different types of nodes like files and directories.
        // You might want to perform various operations like calculating the total size,
        // searching for a file, or compressing files. The Visitor pattern can be used to define
        // these operations in separate visitor classes.
        //
        // Network Protocol Handling:
        //
        //  In networking, when dealing with different network protocol packets, each type of packet may
        //  require different processing. A visitor pattern can be used to encapsulate the processing logic
        //  for each packet type in separate visitor classes.
    }
}
