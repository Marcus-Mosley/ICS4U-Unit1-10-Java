import java.lang.Enum;
import java.util.Scanner;

/**
* The Planets program implements an application that
* outputs the position of the planet when given its name.
*
* @author  Marcus A. Mosley
* @version 1.0
* @since   2021-01-26
*/
public class Planets {
  /**
  * The Position method returns the position.
  */
  public static int position(String planet) {
    int pos = 0;
    PlanetsInfo mcy = PlanetsInfo.MERCURY;
    PlanetsInfo vns = PlanetsInfo.VENUS;
    PlanetsInfo rth = PlanetsInfo.EARTH; 
    PlanetsInfo mrs = PlanetsInfo.MARS;
    PlanetsInfo jpt = PlanetsInfo.JUPITER;
    PlanetsInfo strn = PlanetsInfo.SATURN; 
    PlanetsInfo urn = PlanetsInfo.URANUS;
    PlanetsInfo npt = PlanetsInfo.NEPTUNE;

    switch (planet) {
      case "MERCURY":
        pos = mcy.getPlace();
        break; 
      case "VENUS": 
        pos = vns.getPlace();
        break; 
      case "EARTH":
        pos = rth.getPlace();
        break; 
      case "MARS":
        pos = mrs.getPlace();
        break; 
      case "JUPITER":
        pos = jpt.getPlace();
        break; 
      case "SATURN":
        pos = strn.getPlace();
        break; 
      case "URANUS":
        pos = urn.getPlace();
        break;
      case "NEPTUNE":
        pos = npt.getPlace();
        break;
      default:
        break;
    }
    return pos;
  }

  /**
  * The Main method receives input.
  */
  public static void main(String[] args) {
    String planet;

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the name of the planet in the Solar System: ");
    planet = input.nextLine().toUpperCase();

    int pos = position(planet);
    if (pos == 0) {
      System.out.printf(planet + " is not a planet in the Solar System");
    } else {
      System.out.printf(planet + " is in position %d", pos);
      System.out.printf(" of the Solar System");
    }
  }
}
