package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lol[] = {1,2,3,4,5,6};
        System.out.println("enqueue or dequeue?");
        System.out.println("plez entor e or d thanxz");
        String poo = input.next();

        Queue<String> queue = new LinkedList<>();

        if (poo == "e") {
            System.out.println("whad num u ad my habibi");
            String a = input.next();
            queue.add(a);

        }
}}
