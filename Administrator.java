package Project;
import java.util.Scanner;
public class Administrator {
    protected static String phoneNumber = "035";
    protected static String passWord = "tra";
    static Scanner input = new Scanner(System.in);

    public static void Login(){
        int n = 0;
        while(n != 1){
            System.out.println("*****************DANG NHAP*****************");
            System.out.print("Nhap so dien thoai: ");
            String num = input.next();
            System.out.print("Nhap mat khau: ");
            String pass = input.next();
            if (phoneNumber.equals(num) && passWord.equals(pass)){
                System.out.println("Ban da dang nhap thanh cong voi tu cach la Admintrator!!!");
                break;
            }else{
                System.out.println("Ban nhap sai so dien thoai hoac mat khau!!!");
                System.out.println("Bam phim bat ky de dang nhap lai\nNeu quen mat khau, bam phim 1 de tao moi");
                System.out.print("Moi nhap: ");
                n = input.nextInt();
                if(n == 1){
                    Administrator.setPassWord();
                    System.out.println("Ban da dang nhap thanh cong voi tu cach la Admintrator!!!");
                }
            }
        }
    }

    public static void setPassWord(){
        System.out.print("Nhap mat khau moi: ");
        String pass = input.next();
        passWord = pass;
        System.out.println("Mat khau da duoc thay doi thanh cong!!!");
    }

    public static void setPhoneNumber(){
        System.out.print("Nhap so dien thoai moi:");
        String number = input.next();
        phoneNumber = number;
        System.out.println("So dien thoai da duoc thay doi thanh cong!!!");
    }
    
    public static String Display(){
        return "So dien thoai: " + phoneNumber + ", mat khau: " + passWord;
    }
}
