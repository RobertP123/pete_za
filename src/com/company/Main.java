package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] toppings = new String[10];
        ArrayList<String> toppings_chosen = new ArrayList<>();
        int total = 0;
        while(true) {
            System.out.println("enter the size of pizza you would like");
            String pizza_size = sc.next();
            switch (pizza_size) {
                case "small":
                    total += 7.99;
                    break;
                case "medium":
                    total += 10.99;
                    break;
                case "large":
                    total += 13.99;
                    break;
                default:
                    System.out.println("please type in 'small', 'medium' or 'large'");
                    continue;
            }
            break;
        }
        System.out.println("please enter the toppings you would like one by one");
        String input = sc.next();
        for (int i = 0; i < toppings.length; i++) {
            if(input.equals(toppings[i])){
                break;
            }
        }
        toppings_chosen.add(input);
    }
}
