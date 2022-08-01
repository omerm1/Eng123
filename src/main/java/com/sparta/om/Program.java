package com.sparta.om;

// - Access modifiers - private(within class), public,
// protected(this +inheriting classes), default (children + within package)
public class Program {
    public static void main(String[] args) {
        int timeOfDay = 21;
        System.out.println(Greeter.getGreeting(timeOfDay));
    }
}
