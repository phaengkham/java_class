import java.util.Scanner;

public class pork {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Porkkillo:");
        float Porkkillo=scn.nextFloat();
        System.out.println("Enter MoneyKillo:");
        float MoneyKillo=scn.nextFloat();
        float totalPlay;
        totalPlay=Porkkillo*MoneyKillo;
        System.out.println("Show Porkkillo:"+Porkkillo+"killo");
        System.out.println("show MoneyKillo:"+MoneyKillo+"kip");
        System.out.println("show totalPlay: "+totalPlay+"kip");
    }
}
