import java.util.Scanner;

public class RemoveCarInfo {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a string containing information about multiple cars separated by commas (e.g., Honda Civic,2020,Blue,Toyota Camry,2022,Black):");
    String carInfoString = scanner.nextLine();

    System.out.println("Enter the name of the car to remove information about:");
    String carToRemove = scanner.nextLine();

    String modifiedCarInfo = removeCarInfo(carInfoString, carToRemove);

    System.out.println("Modified car information:");
    System.out.println(modifiedCarInfo);

    scanner.close();
  }
