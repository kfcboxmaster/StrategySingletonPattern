import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private String divider = "---------------------";
    public UserInterface() {
        scanner = new Scanner(System.in);
    }

    public void run() {
        boolean exit = false;

        while (!exit) {
            System.out.println("Furniture Factory Console UI");
            System.out.println("1. Order Chair");
            System.out.println("2. Order Table");
            System.out.println("3. Order Bed");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createAndAssembleFurniture(new ChairStrategy());
                    break;
                case 2:
                    createAndAssembleFurniture(new TableStrategy());
                    break;
                case 3:
                    createAndAssembleFurniture(new BedStrategy());
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void createAndAssembleFurniture(FurnitureStrategy strategy) {
        Furniture furniture = FurnitureFactory.Singleton().createFurniture(strategy);
        furniture.assemble();
        furniture.ship();
        System.out.println(divider);
    }
}