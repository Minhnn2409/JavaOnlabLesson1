import java.util.Scanner;

public class Exe4 {
    public static void checkTriangle(double a, double b, double c){
        if ((a + b > c) && (a + c > b) && (b + c > a)){
            System.out.println("Đây là 3 cạnh tam giác");
        }
        else System.out.println("Đây không là 3 cạnh tam giác");
    }
    public static double inputDouble(String msg, String err){
        Scanner sc = new Scanner(System.in);
        double num = 0;
        boolean check = true;
        do {
            try {
                System.out.println(msg);
                num = Double.parseDouble(sc.nextLine());
                check = false;
            }catch (Exception e){
                System.out.println(err);
            }
        }while (check);
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side1 = inputDouble("Mời nhập cạnh thứ nhất", "cạnh tam giác là số thực");
        double side2 = inputDouble("Mời nhập cạnh thứ hai", "cạnh tam giác là số thực");
        double side3 = inputDouble("Mời nhập cạnh thứ ba", "cạnh tam giác là số thực");
        checkTriangle(side1, side2, side3);
    }
}
