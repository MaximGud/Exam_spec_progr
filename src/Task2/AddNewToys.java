package Task2;

import java.util.List;

public class AddNewToys {

  public static List<Toy> addToyToArray(int toyId, String toyName, int toyValue, List<Toy> toys){
  Toy toyAdd = new Toy(toyId,toyName,toyValue);
  toys.add(toyAdd); 
  return toys;
}
}