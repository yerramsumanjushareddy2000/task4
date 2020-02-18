import Calculations.HouseCost;
import Calculations.SimpleCompound;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter prinicpal , rate and time : ");
        int princiapl,time;
        float rate;
        princiapl=s.nextInt();
        time=s.nextInt();
        rate=s.nextFloat();
        SimpleCompound simpleCompound = new SimpleCompound(princiapl,rate,time);
        System.out.println("Simple Interest : " + simpleCompound.simpleInterest());
        System.out.println("Compound Interest : " + simpleCompound.compoundInterest());

        int material,area;
        boolean automated;
        System.out.println("Enter Total area of house :");
        area = s.nextInt();
        System.out.println("1.Standard Materials");
        System.out.println("2.Above Standard Materials");
        System.out.println("3.High Standard Materials");
        System.out.println("4.High Standard Materials and Automated House");
        material=s.nextInt();
        if(material == 4)
            automated = true;
        else
            automated = false;
        HouseCost houseCost = new HouseCost(area,automated,material);
        System.out.println("Total Construction Cost : " + houseCost.costCalculate());
    }
}
