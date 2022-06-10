package com.mentor.variables;

public class Strings {

    Types printTypes = new Types();
    Types comparingTypes = new Types();

    // String variablesToPrint = printTypes.toString();

    // Using a variable Type String to record temporal value and print it
    //System.out.println("Show us our variables in variable: " + variablesToPrint);

    //Space
   System.out.println("")

    // Using in runtime memory methods.
    //System.out.println("Show us variables in Run Time: " + printTypes.toString());

    String oldValue = comparingTypes.getStringChars();

    comparingTypes.setStringChars("The new value");
    String newValue = comparingTypes.getStringChars();

        System.out.println("Show us old value: " + oldValue);
        System.out.println("Show us new value: " + newValue);

}
