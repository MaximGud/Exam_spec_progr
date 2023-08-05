package Task2;

public class Toy {
  private int toyID;
  private String toyName;
  private int value;

  public Toy(int toyID, String toyName, int value) {
    this.toyID = toyID;
    this.toyName = toyName;
    this.value = value;
  }

  public int getToyID() {
    return toyID;
  }

  public void setToyID(int toyID) {
    this.toyID = toyID;
  }

  public String getToyName() {
    return toyName;
  }

  public void setToyName(String toyName) {
    this.toyName = toyName;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }


}
