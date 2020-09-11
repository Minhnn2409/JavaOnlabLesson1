import java.util.Scanner;

public class Exe1 {

    public static void checkYear(int year){
        if(year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)){
            System.out.println(year + " là năm nhuận");
        }
        else{
            System.out.println(year + " không phải là năm nhuận");
        }
    }
    public static int InputInt(String msg, String err){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean check = true;
        do {
            try {
                System.out.println(msg);
                num = Integer.parseInt(sc.nextLine());
                check = false;
            }catch (Exception e){
                System.out.println(err);
            }
        }while(check);
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        year = InputInt("Mời nhập năm: ", "Mời nhập lại");
        checkYear(year);
    }
}
