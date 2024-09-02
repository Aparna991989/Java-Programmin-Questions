package javapackage;
import java.util.Scanner;
public class HotelTarrif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         float roomrent;
        int daysStayed;
        double tariff;
        boolean isPeakSeason;
        int month;
        System.out.println("Select Room Type:");
        System.out.println("1. Deluxe Room (Rate: $1000 per day)");
        System.out.println("2. Executive Room (Rate: $1500 per day)");
        System.out.println("3. Suite (Rate: $2000 per day)");
        System.out.print("Enter your choice (1-3): ");
        int roomtype = scanner.nextInt();
        System.out.print("Enter the number of days you stayed: ");
        daysStayed = scanner.nextInt();
        System.out.print("Enter the month of stay (1-12): ");
        month = scanner.nextInt();
       // Determine if it's peak season (April-June or November-December)
        isPeakSeason = (month >= 4 && month <= 6) || (month == 11 || month == 12);
        switch(roomtype) {
            case 1:
                tariff =  1000* daysStayed;
                break;
            case 2:
                tariff = 1500* daysStayed;
                break;
            case 3:
                tariff = 2000* daysStayed;
                break;
            default:
                System.out.println("Invalid room type selected!");
                return;
                }
         if (isPeakSeason) {
            tariff *= 1.20;  // Increase tariff by 20% during peak seasons
        }
     System.out.println("Total tariff for your stay is: $" + tariff);
        
       }
}
