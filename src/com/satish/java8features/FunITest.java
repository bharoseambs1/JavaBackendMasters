package com.satish.java8features;

import java.util.List;
import java.util.function.Predicate;

public class FunITest {
    public static void main(String[] args) {

        //1. FunIPrintName -- Functional Interface implementation using Lambda Expression
        //2. abstract method signature: void printName(String name);

        //FunIPrintName fipn = (String str) -> System.out.println("Name is: " + str);
        //fipn.printName("Sachin Tendulkar");

        //1. FunIInputName -- Functional Interface implementation using Lambda Expression
        //2. abstract method signature: String getInputName(String firstName, String lastName);

        /*FunIInputName finame = (String str1, String str2) -> {
            String str = "Cricket Player: ";
            return str + str1 + " " + str2;
        };

        String result = finame.getInputName("Sachin", "Tendulkar");
        System.out.println(result);//Cricket Player: Sachin Tendulkar*/


        //1. Predicate -- Functional Interface implementation using Lambda Expression
        //2. abstract method signature: boolean test(T t);

       /* Predicate<List<String>> predicate = names -> {
            for(String str : names){
                if(str.length() % 2 == 0){
                    return true;
                }else {
                    return false;
                }
            }
            return false;
        };

        List<String> names = List.of("Sachin", "Dravid", "Laxman", "Kohli", "Rohit", "Dhoni");

        System.out.println(predicate.test(names));*/


        /*List<String> names = List.of("Sachin", "Dravid", "Laxman", "Kohli", "Rohit", "Dhoni");

        Predicate<List<String>> predicate = namesList -> {
            for (String str : namesList) {
                if (str.length() % 2 == 0) {
                    return true;
                }
            }
            return false;
        };

        System.out.println(predicate.test(names));*/



        //1. MathOperationFI -- Functional Interface implementation using Lambda Expression
        //2. abstract method signature: int sumOfTwoNum(int num1, int num)

        /*MathOperationFI mofi = (int x, int y) -> x + y;
        int sum = mofi.sumOfTwoNum(10, 20);
        System.out.println("Sum is: " + sum);*/


        List<Player> players = List.of(
            new Player(101, "Sachin", 26, "Mumbai"),
            new Player(102, "Saurabh", 29, "Kolkata"),
            new Player(103, "Rohit", 28, "Mumbai"),
            new Player(104, "Laxman", 28, "Hyderabad"),
            new Player(105, "MS Dhoni", 28, "Chennai")
        );


        // 1. CricketInfoFI -- Functional Interface implementation using Lambda Expression
        // 2. abstract method signature: List<String> getPlayerNames(List<Player> players);

        CricketInfoFI cifi = (List<Player> playerList) -> {
            /*return playerList.stream()
                    .map(player -> player.name)
                    .toList();*/

            List<String> playerNames = new java.util.ArrayList<>();

            for (Player player : playerList) {
                playerNames.add(player.name);
            }

            return playerNames;
        };

        List<String> playernamelist = cifi.getPlayerNames(players);
        System.out.println("Player Names: " + playernamelist);


















    }
}