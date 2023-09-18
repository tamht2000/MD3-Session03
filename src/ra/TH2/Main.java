package ra.TH2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double money = 1.0;   // Tiền gửi
        int month = 1;        // Tháng gửi
        double interesRate = 1.0; // Tỉ lệ lãi suất
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi: ");
        money = sc.nextDouble();
        System.out.println("Nhập tháng gửi: ");
        month = sc.nextInt();
        System.out.println("Nhập lãi suất: ");
        interesRate = sc.nextDouble();
        double totalInteres = 0;
        for (int i = 0; i < month; i++) {
            totalInteres += money * (interesRate/100)/12 * month;

        }
        System.out.println("Số tiền lãi là: " + totalInteres);
    }
}
