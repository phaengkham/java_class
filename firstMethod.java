import java.util.Scanner;

public class firstMethod {
    public void showData(String message){
        System.out.println("Learnning java:"+message);
    }
    public int selectMenu(){
        System.out.println("please choose the Menu");
        System.out.println("1 = take out, 2 = check, 3 transfer");
        System.out.print("Enter the Menu number:");
        Scanner scn = new Scanner(System.in);
        int Menu = scn.nextInt();
        return Menu;
    }
    public void OddEven(){
        System.out.print("Enter the Number:");
        Scanner sn = new Scanner(System.in);
        int num = sn.nextInt();
        if(num %2 ==0){
            System.out.println("the number is odd number");
           
        }
        else{
            System.out.println("the number is even number");
           
        }

    }
}
