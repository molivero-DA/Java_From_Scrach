package com.mentor.conditionals;

import java.util.Objects;
import java.util.Random;

public class Conditionals {
    public void conditionalMethod(){
    // Comparition operators

    //  || -> Or    - operator
    //  && -> And   -
    //   ! -> Not   -
    //  (condition) ? true : false -> ternary operation
    //  ?: -> Elvis operator
    //  ? -> chaning operator


    // Example If we have two Strings and we want to compare it by value
    String timeOut = "TIME_OUT_ERROR";
    String unauthorized = "UNAUTHORIZED_ERROR";

    // if else -> conditional statements or else
    // if (timeOut.equals("TIME_OUT_ERROR")){
    if (timeOut == "TIME_OUT_ERROR"){
        // write logic
    } else {
        // another logic
    }

    // Other way is nested If's elses
    // nested conditional
    if (timeOut == "TIME_OUT_ERROR"){
        // write logic
    } else if (unauthorized == "UNAUTHORIZED_ERROR") {
        // another logic
    } else if (timeOut == "OTHER_ERROR") {

    }  else if (unauthorized == "TIME_OUT_ERROR") {
        // here was boom and return error
    } else if (timeOut == "TIME_OUT_ERROR") {

    } else if (unauthorized == "TIME_OUT_ERROR") {

    } else if (timeOut == "TIME_OUT_ERROR") {

    }

    // If inside of other If
    // Conditional By object method property
    if (Objects.isNull(timeOut)) {
        if (timeOut == "name") {
            // you will do something here
        }
    }

    // -> Null pointer exception.
    // Optional ->

    // Optional optPerson = Optional.of(person);
    // otpPersonFiltered = optPerson.orElseThrow();
    // String filterName = otpPersonFiltered.getName();

    // Ternary operator
    boolean result = (Objects.isNull(timeOut) || Objects.checkIndex(0,0))
            ? System.out.println("Condition true")
            : System.out.println("Condition false");

    if (!Object.isNotEmpty() || !objet.contains("name")) {
        return "sorry but the condition was false";
    }

    boolean resultOfComparision = printTypes.equals(comparingTypes);
    System.out.println("result comparision: " + resultOfComparision);

 }
}
