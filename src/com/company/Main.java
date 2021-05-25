package com.company;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[]args)
    {
        byte MonthsInYear = 12;
        byte Percent = 100;
        Scanner s = new Scanner(System.in);
        System.out.print("PRINCIPAL: ");
        double principal = s.nextDouble();
        if(principal>=0)
        {
        System.out.print("ANNUAL INTEREST RATE: ");
        double interest_rate = s.nextDouble();
        if(interest_rate>0)
        {
        double monthly_interest = interest_rate/MonthsInYear/Percent;
        System.out.print("PERIOD(years): ");
        byte years = s.nextByte();
        int numberOfPayments = years*MonthsInYear;
        double Mortgage = principal *(monthly_interest*Math.pow(1+monthly_interest,numberOfPayments))/(Math.pow(1+monthly_interest,numberOfPayments)-1);
                String MortgageFinal = NumberFormat.getCurrencyInstance().format(Mortgage);
        System.out.println("YOUR MONTHlY MORTGAGE PAYMENT IS: "+MortgageFinal);}}
        else
        {
            System.out.println("Please enter a valid principal/interest rate!!");
        }





    }
        }