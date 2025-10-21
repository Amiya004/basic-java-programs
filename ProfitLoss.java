// Program to Calculate Profit and Loss. 

import java.util.Scanner;

public class ProfitLoss {
    public static double Profit(double costPrice, double sellingPrice){
        double profit = sellingPrice - costPrice ;
        return profit;
    }

    public static double Loss(double costPrice, double sellingPrice){
        double loss = costPrice - sellingPrice ;
        return loss;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the cost making price of the product : ");
        double costPrice = scanner.nextDouble();

        System.out.print("Enter the selling price of the product : ");
        double sellingPrice = scanner.nextDouble();

        if(sellingPrice > costPrice){
            System.out.println(Profit(costPrice, sellingPrice) + " rs. Profit ^_^ ");
        } else if(costPrice > sellingPrice){
            System.out.println(Loss(costPrice, sellingPrice) + "rs. Loss T_T");
        } else if(sellingPrice == costPrice) {
            System.out.println("No Profit No Loss ... ");
        } else {
            System.out.println("XXXXXXXXX");
        }


    }
}
