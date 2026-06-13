package com.example.counter;

public class Driver {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.increment();
        counter.increaseBy(4);
        counter.triple();

        System.out.println("Counter value: " + counter.getCount());
        System.out.println("Is counter even? " + counter.isCountEven());
    }
}
