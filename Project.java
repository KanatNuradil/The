import java.io.*;
import java.util.*;

public class Project {
    public static void greeting(){
        Scanner scannn = new Scanner(System.in);
        System.out.println("Welcome to Vacation Planner!");
        System.out.println("What is your name: ");
        String name = scannn.nextLine();
        System.out.println("Nice to meet you " + name + ", where are you traveling to? ");
        String travel_to = scannn.next();
        System.out.println("Great! " + travel_to + " sounds like a great trip");
    }
    public static void traveltimeandbudget(){
        Scanner scannn = new Scanner(System.in);
        System.out.println("How many days are you going to spend traveling? ");
        int days = scannn.nextInt();
        System.out.println("How much money, in USD, are you planning to spend on your trip: ");
        int money = scannn.nextInt();
        System.out.println("What is the three letter currency symbol for your travel destination? ");
        String currency = scannn.next();
        System.out.println("How many " + currency + " are there in 1 USD? ");
        double rate = scannn.nextDouble();
        int hours = days * 24;
        int min = hours * 60;
        int sec = min * 60;
        int usd = (int)((money / (double)days) * 100 ) ;
        double usd1 = (double) usd / 100;
        double euro =  money * rate ;
        double eur = (euro / (double)days) * 100;
        int eur1 = (int)eur;
        double eur2 = (double) eur1 / 100;



        System.out.println("If you are traveling for " + days + " days that is same as " + hours + " hours or " + min + " minutes or " + sec +
                " seconds.\n" +
                "If you are going to spend $" + money + " USD that means per day you can spend up to $" + usd1 +
                " USD\n" +
                "Your total budget in " + currency + " is " + euro + " " + currency + ", which per day is " + eur2 + " " + currency);
    }
    public static void timedifference(){
        Scanner scannn = new Scanner(System.in);
        System.out.println("What is the time difference, in hours, between your home and your destination? ");
        int time = scannn.nextInt();
        time = time % 24;
        int mid = time + 24;
        mid = mid % 24;
        int noon =  12 + time;
        if(time < 0)
            noon = noon + 24;
            noon = noon % 24;
            System.out.println("That means that when it is midnight at home it will be " + mid + ":00 in your travel destination and when it's noon at home it will be " + noon + ":00");

    }
    public static void countryArea() {
        Scanner scannn = new Scanner(System.in);
        System.out.println("What is square area of your destination country in km2?");
        long des = scannn.nextLong();
        double mm = 0.38610215854245;
        int mil = (int) (des * mm * 100);
        double mile = (double) mil / 100;
        System.out.println("In miles2 that is " + mile);
    }
    public static void nextDestination(){
        Scanner scannn = new Scanner(System.in);
        System.out.println("How many places you traveled to : ");
        int places = scannn.nextInt();
        for(int i = 0; i < places; i++){
            scannn.nextLine();
            System.out.print("Enter the name:");
            String place = scannn.next();
        }
        String [] country = {"Canada", "France", "Germany", "Italy", "Japan", "The United Kingdom", "The United States"};
        System.out.println("Next place you want to travel to : ");
        for(int  i = 0; i < country.length; i++) {
            System.out.println(i + ": " + country[i]);
        }
        int n = scannn.nextInt();
        System.out.println("Thank you, Your next location is : " + country[n-1] + ". Wish you a good trip!");


    }
    public static void main(String[] args) {
        greeting();
        traveltimeandbudget();
        timedifference();
        countryArea();
        nextDestination();
    }
}

