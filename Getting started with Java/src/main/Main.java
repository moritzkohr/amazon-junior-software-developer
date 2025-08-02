package main;

public class Main {
    public static void main(String[] args) {
        String firstName="Sandy";
        String lastName="Jones";
        String movieTitle="The Source Code";
        int numberOfTickets=8;
        double pricePerTicket=10.57;
        double totalPrice=pricePerTicket*numberOfTickets;
        String userName=firstName.toLowerCase()+lastName.toLowerCase();
        String movieName=movieTitle.toUpperCase();

        System.out.println("Congratulations!! You have successfully booked the tickets\n");
        System.out.println("Username: "+userName);
        System.out.println("Movie: "+movieName);
        System.out.println("Number of tickets: "+numberOfTickets);
        System.out.println("Price per ticket: $"+pricePerTicket);
        System.out.println("Total price of "+numberOfTickets+" tickets: $"+totalPrice+"\n");
        System.out.println("Thank you for choosing us for booking your movie tickets\nEnjoy your movie!!!");

    }
}
