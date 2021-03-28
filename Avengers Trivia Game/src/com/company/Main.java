package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static int score = 0;

    public static void main(String[] args) throws IOException {
	    System.out.println("Welcome to the Avengers Trivia Game!\n");
	    Rules();

	    Question1();
        Question2();
        Question3();
        Question4();
        Question5();

        Ending();
    }
    public static void Ending()
    {
        System.out.println("\nCongratulations! Your score total was " + score + " out of 5!");
    }

    public static void Question1()
    {
        System.out.println("\nIn the comic book series, who were the original Avengers?");

        String[] Answers = new String[4];
        Answers[0] = "1. Batman, Spider-Man, Superman, and Wonder Woman";
        Answers[1] = "2. Ant-Man, The Hulk, Iron Man, and The Wasp";
        Answers[2] = "3. The Hulk, Howard The Duck, Captain America, and Black Widow";
        Answers[3] = "4. The Incredibles";


        for(String options : Answers)
        {
            System.out.println(options);
        }

        int answer = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nType in your answer 1-4: ");
        answer = scanner.nextInt();

        if(answer == 1)
        {
            score++;
        }
        else
        {

        }
    }

    public static void Question2()
    {
        System.out.println("\nWhich Marvel character has never appeared in The Avengers films?");

        String[] Answers = new String[4];
        Answers[0] = "1. Hawkeye";
        Answers[1] = "2. Iron Man";
        Answers[2] = "3. Captain America";
        Answers[3] = "4. The Wasp";

        for(String options : Answers)
        {
            System.out.println(options);
        }

        int answer = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nType in your answer 1-4: ");
        answer = scanner.nextInt();

        if(answer == 4)
        {
            score++;
        }
        else
        {

        }
    }

    public static void Question3()
    {
        System.out.println("\nWho is the leader of S.H.I.E.L.D?");

        String[] Answers = new String[4];
        Answers[0] = "1. Tony Stark";
        Answers[1] = "2. Nick Fury";
        Answers[2] = "3. Bruce Banner";
        Answers[3] = "4. Diana Prince";

        for(String options : Answers)
        {
            System.out.println(options);
        }

        int answer = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nType in your answer 1-4: ");
        answer = scanner.nextInt();

        if(answer == 2)
        {
            score++;
        }
        else
        {

        }
    }

    public static void Question4()
    {
        System.out.println("\nWhat is Clint Barton's superhero name?");

        String[] Answers = new String[4];
        Answers[0] = "1. Iron Man";
        Answers[1] = "2. Hawkeye";
        Answers[2] = "3. Barnicle Boy";
        Answers[3] = "4. Vision";

        for(String options : Answers)
        {
            System.out.println(options);
        }

        int answer = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nType in your answer 1-4: ");
        answer = scanner.nextInt();

        if(answer == 2)
        {
            score++;
        }
        else
        {

        }
    }

    public static void Question5()
    {
        System.out.println("\nWhat's the name of the mysterious blue glowing cube that Loki uses as a weapon?");

        String[] Answers = new String[4];
        Answers[0] = "1. The Orb";
        Answers[1] = "2. UV Lamp";
        Answers[2] = "3. The Tesseract";
        Answers[3] = "4. The Force";

        for(String options : Answers)
        {
            System.out.println(options);
        }

        int answer = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nType in your answer 1-4: ");
        answer = scanner.nextInt();

        if(answer == 3)
        {
            score++;
        }
        else
        {

        }
    }
    public static void Rules()
    {
        System.out.println("The rules of this game are simple...");
        System.out.println("You will be asked a series of questions.");
        System.out.println("To answer, simple type the number, 1-4, that corresponds to your guess.");
        System.out.println("Try your best to get a perfect score!!\n");
    }
}