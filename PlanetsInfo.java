/**
* The PlanetsInfo file includes the
* Enumeration for the Planets file.
*
* @author  Marcus A. Mosley
* @version 1.0
* @since   2021-01-26
*/
public enum PlanetsInfo {
  MERCURY(1),
  VENUS(2),
  EARTH(3),
  MARS(4), 
  JUPITER(5),
  SATURN(6),
  URANUS(7),
  NEPTUNE(8);

  private int place;

  private PlanetsInfo(int c) {
    place = c;
  }

  public int getPlace() {
    return place;
  }   
}
