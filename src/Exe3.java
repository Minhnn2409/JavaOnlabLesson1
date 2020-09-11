public class Exe3 {
    public static void main(String[] args) {
        int min = 1;
        int max = 12;
        int range = (max - min) + 1;

        int randomNum = (int)((Math.random()*range) + min);

        switch (randomNum){
            case 1:
                System.out.println("Tháng một");
                break;
            case 2:
                System.out.println("Tháng hai");
                break;
            case 3:
                System.out.println("Tháng ba");
                break;
            case 4:
                System.out.println("Tháng bốn");
                break;
            case 5:
                System.out.println("Tháng năm");
                break;
            case 6:
                System.out.println("Tháng sáu");
                break;
            case 7:
                System.out.println("Tháng bảy");
                break;
            case 8:
                System.out.println("Tháng tám");
                break;
            case 9:
                System.out.println("Tháng chín");
                break;
            case 10:
                System.out.println("Tháng mười");
                break;
            case 11:
                System.out.println("Tháng mười một");
                break;
            case 12:
                System.out.println("Tháng mười hai");
                break;

        }
    }
}
