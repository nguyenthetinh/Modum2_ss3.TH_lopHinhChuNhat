package com.tinh;
import java.sql.SQLOutput;
import java.util.Scanner;
public class hinhchunhat {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Whith = ");
        double w=scanner.nextDouble();
        System.out.println("Height = ");
        double h=scanner.nextDouble();
        Chunhat chunhat =new Chunhat(w,h);
        System.out.println(chunhat.display());
        System.out.println("Area = "+ chunhat.getArea());
        System.out.println("Perimeter = "+ chunhat.getPerimeter());
    }
}
