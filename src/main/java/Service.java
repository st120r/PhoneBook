package src.main.java;

import java.util.Scanner;

public class Service {

    private String scan(int num) {
        String s = (num == 1) ? "summ: " : "desc: ";
        System.out.println("Input a " + s);
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
