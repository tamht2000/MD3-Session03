package ra.TH1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số: ");
        int number = sc.nextInt();
        if(number < 2) {
            System.out.println(number + " k là số nguyên tố");

        } else {
            int i =2;
            boolean check = true;
            while (i < number) {
                if(number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if(check) {
                System.out.println(number + " là số nguyên tố");
            } else {
                System.out.println(number + " k là số nguyên tố");
            }
        }
    }
}
