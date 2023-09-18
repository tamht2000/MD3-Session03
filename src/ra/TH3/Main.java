package ra.TH3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        a = sc.nextInt();
        System.out.println("Nhập số b: ");
        b = sc.nextInt();
        int originA = Math.abs(a);  // sử dụng hàm abs() để trả về giá trị tuyệt đối của a và b
        int originB = Math.abs(b);
        if(originA == 0 || originB == 0) {
            System.out.println("K có UCLN");
        } else {
            while (originA != originB) {
                if(originA > originB) {
                    originA = originA - originB;
                    System.out.println("a = " + originA);
                } else {
                    originB = originB - originA;
                    System.out.println("b = " + originB);
                }
            }
            System.out.println("UCLN là: " + originA);
        }


    }
}
