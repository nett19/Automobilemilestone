import java.util.Scanner;

public class Automobile {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[][] carInfo = {
        {"Honda", "Civic", "2023", "Red"},
        {"Toyota", "Camry", "2022", "Black"},
        {"Ford", "Mustang", "2021", "Blue"}
    };

    int carCount = 1; 

    System.out.println("Enter the name of the car (Make, Model) to remove information about:");
    String carToRemove = scanner.nextLine();

    String[] modifiedCarInfo = removeCarInfo(carInfo, carToRemove);

    for (String car : modifiedCarInfo) {
      if (car != null) { 
        System.out.printf("Car %d: %s\n", carCount, car);
        carCount++;
      }
    }

    scanner.close();
  }

  public static String[] removeCarInfo(String[][] carInfo, String carToRemove) {
    String[] modifiedCarInfo = new String[carInfo.length];
    int j = 0; 

    for (String[] carDetails : carInfo) {
      StringBuilder makeModel = new StringBuilder();
      makeModel.append(carDetails[0]).append(" ").append(carDetails[1]);

      if (!makeModel.toString().contains(carToRemove)) {
        modifiedCarInfo[j++] = makeModel.toString();
      }
    }

    return modifiedCarInfo;
  }
}