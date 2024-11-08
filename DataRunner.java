import java.util.Scanner; 

/**
 * DataRunner class serves as a command-line interface for interacting with
 * economic data through the Economist class. It allows users to view GDP,
 * population by country, global GDP, or list all economic data.
 */

public class DataRunner
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);  // Scanner for user input
        
        // Initialize Economist with data files
        Economist luke = new Economist("names.txt", "countryCodes.txt", "gdpInBillions.txt", "populations.txt");

        boolean running = true;  // Control loop for program operation
      
        while (running)
        {
            System.out.println("Welcome to our market analysis tool!");
            System.out.println("Please select an option:");
            System.out.println("1. Find the GDP of a specific country");
            System.out.println("2. Find the population of a specific country");
            System.out.println("3. Find global GDP");
            System.out.println("4. List all economic information");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();  // User's menu selection
            scanner.nextLine();  // Consume newline

            // Option for country-specific GDP
            if (choice == 1)
            {
                System.out.print("Enter the country name: ");
                String country = scanner.nextLine(); 
                System.out.println(luke.getCountryGdp(country));
            }
            
            // Option for country-specific population
            else if (choice == 2)
            {
                System.out.print("Enter the country name: ");
                String country = scanner.nextLine();   
                System.out.println(luke.getCountryPopulation(country));
            }

            // Option to display global GDP
            else if (choice == 3)
            {
                System.out.println(luke.globalGdp() + " billion USD");
            }

            // Option to display all economic data
            else if (choice == 4)
            {
                System.out.print(luke.toString());
            }

            // Option to exit program
            else if (choice == 5)
            {
                System.out.println("Exiting...");
                running = false; 
            }

            // Invalid selection
            else
            {
                System.out.println("ERROR. Please try again.");
            }
        }

        scanner.close();  // Close scanner
    }
}
