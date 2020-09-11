import java.util.Scanner;

public class Exe2 {
    public static int inputInt(String msg, String err, int min, int max){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean check = false;
        do {
            try {
                System.out.println(msg);
                num = Integer.parseInt(sc.nextLine());
                check = num <= max && num >= min;
                if(!check) System.out.println(err);
            }catch (Exception e){
                System.out.println(err);
            }
        }while(!check);
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = inputInt("Mời nhập số nguyên: ", "Mời nhập lại số nguyên 0 - 11", 0, 11);
        switch (num){
            case 0:
                System.out.println("Tý");
                break;
            case 1:
                System.out.println("Sửu");
                break;
            case 2:
                System.out.println("Dần");
                break;
            case 3:
                System.out.println("Mão");
                break;
            case 4:
                System.out.println("Thìn");
                break;
            case 5:
                System.out.println("Tỵ");
                break;
            case 6:
                System.out.println("Ngọ");
                break;
            case 7:
                System.out.println("Mùi");
                break;
            case 8:
                System.out.println("Thân");
                break;
            case 9:
                System.out.println("Dậu");
                break;
            case 10:
                System.out.println("Tuất");
                break;
            case 11:
                System.out.println("Hợi");
                break;
        }
    }
}
