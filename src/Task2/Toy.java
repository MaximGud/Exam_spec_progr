package Task2;

import java.util.Objects;

public class Toy implements Comparable<Toy> {
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

  public String getInfo() {
    return String.format("ID: %d, Name: %s", toyID, toyName);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Toy toy = (Toy) o;
    return toyName.equals(toy.toyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toyName);
  }

  @Override
  public int compareTo(Toy o) {
    return Integer.compare(this.value, o.value);
  }

}
