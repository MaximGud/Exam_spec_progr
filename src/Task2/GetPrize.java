package Task2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;

public class GetPrize {
  // создаем очередь
  private static PriorityQueue<Toy> prizes = new PriorityQueue<>();

  // метод выбора приза из очереди
  public static Toy getPrize(List<Toy> toys) {
    if (prizes.size() == 0) {//если очередь пуста заполняем ее 
      Random rnd = new Random();
      for (Toy toy : toys) {
        for (int i = 0; i < toy.getValue(); i++) {//заполянем приоритетную очередь
          Toy temp = new Toy(toy.getToyID(), toy.getToyName(), rnd.nextInt(1, 10));
          prizes.add(temp);
        }
      }
    }
    return prizes.poll();
  }

  // метод колеса
  public static void wheel(List<Toy> toys) {
    if (toys.size() >= 2) {
      Toy prize = getPrize(toys);
      System.out.println("Приз: " + prize.getToyName());
      saveResult(prize.getInfo());
    } else {
      System.out.println("Вы должны добавить как минимум 3 игрушки в призовой фонд");
      View.run();
    }
  }

  // метод записи результатов в файл
  public static void saveResult(String text) {
    File file = new File("Result.txt");
    try {
      file.createNewFile();
    } catch (Exception ignored) {
      throw new RuntimeException();
    }
    try (FileWriter fw = new FileWriter("Result.txt", true)) {
      fw.write(text + "\n");
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    }
  }
}
