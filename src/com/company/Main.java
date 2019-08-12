package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        int staticCost = sc.nextInt();
        int cost = sc.nextInt();
        int price = sc.nextInt();
        int result;

        if(price <= cost) result = -1;
        else result = staticCost / (price - cost) + 1;
        System.out.println(result);
    }
}
