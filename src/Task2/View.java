package Task2;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class View {
 

  
  public static void run() {
  List<Toy> toys = new ArrayList<Toy>();
  PriorityQueue<Toy> prizes = new PriorityQueue<>();

  while (true){
    System.out.println("Добро пожаловать в магазин игрушек! Выберите пункт меню:");
    System.out.println("1) Добавить игрушки");
    System.out.println("2) Изменить вес игрушки");
    System.out.println("3) Получить приз");
    System.out.println("4) Выход");

    Scanner in = new Scanner(System.in);
    try{
      String userInput = in.nextLine();
          Pattern pattern = Pattern.compile("[1234]");
            Matcher matcher = pattern.matcher(userInput);
            if (!matcher.matches()) {
                throw new InvalidInputException("Некорректный ввод значения");
            }  
          

switch (userInput) {
  case "1":
     System.out.println("Введите не менее 3 игрушек (ID, название, вес)");
     
     while(toys.size()<3){

      System.out.print("Введите ID игрушки: ");
      int toyId = in.nextInt();
      System.out.print("Введите название игрушки(Eng): ");
      Scanner in2 = new Scanner(System.in);
      String toyName = in2.nextLine();
      System.out.print("Введите вес игрушки(от 1 до 8): ");
      int toyValue = in.nextInt();
    
    toys = AddNewToys.addToyToArray(toyId, toyName,toyValue, toys);
     }
     System.out.println("Игрушки добавлены");
    break;

  case "2":

     SetFreq.setFrequency(toys);
    
    break;
    case "3":
      GetPrize.wheel(toys);
         
    
    break;
    case "4":
      System.out.println("До свидания!");
       System.exit(4);
  
    break;
}
}
         catch (InvalidInputException e) {
          System.err.println(e.getMessage());
      } catch (InputMismatchException e) {
          System.err.println("Некорректный ввод числа");
    
      }
   

   

  // // метод получения строки с консоли
  // private String prompt(String message) {
  //   Scanner in = new Scanner(System.in);
  //   System.out.print(message);
  //   return in.nextLine();

  // }

  // // метолд получения числа с консоли
  // private int promptInt(String message) {
  //   Scanner in = new Scanner(System.in);
  //   System.out.print(message);
  //   return Integer.parseInt(in.nextLine());
  // }

  // // метод вывода результата вычислений
  // private void resultOutput(List<Integer> res) {
  //   System.out.println("Результат равен: " + res.get(0) + " + " + res.get(1) + "i");
  // }
 
}
}
}
