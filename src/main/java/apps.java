/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Gracie Bliss
 */
import java.util.*;
public class apps {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("What is the length of the room in feet? ");
        String length=in.nextLine();
        System.out.print("What is the width of the room in feet? ");
        String width=in.nextLine();

        System.out.println("You entered dimensions of "+length+" feet by "+width+" feet.");

        int lengthNum=Integer.parseInt(length);
        int widthNum=Integer.parseInt(width);

        int area=lengthNum*widthNum;

        System.out.println("The area is \n"+area+" square feet");

        double converter=.09290304;

        double meters=(double)area*converter;

        System.out.print(meters+" square meters");


    }
}
