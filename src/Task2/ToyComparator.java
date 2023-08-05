package Task2;
import java.util.Comparator;
public class ToyComparator implements Comparator<Toy>{
  

 
  @Override
  public int compare(Toy o1, Toy o2) {
      if (o1 == o2) {
          return 0;
      }
      if (o1 == null) {
          return -1; // o1 < o2
      }
      if (o2 == null) {
          return 1; // o1 > o2
      }
      int s = o1.getValue() - o2.getValue();
      if (s != 0) {
          return s;
      }
      return o1.getToyName().compareTo(o2.getToyName());
  }
}

