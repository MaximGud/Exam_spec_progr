package Task2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class View {
 

  
  public static void run() {

    System.out.println("Добро пожаловать в магазин игрушек! Выберите пункт меню:");
    System.out.println("Добавить игрушки - 1");
    System.out.println("Посмотреть очередь игрушек - 2");
    System.out.println("Получить приз - 3");
    System.out.println("Выход - 4");

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
     List<Toy> toys = new ArrayList<Toy>();
     while(toys.size()<3){

      System.out.print("Введите ID игрушки: ");
      int toyId = in.nextInt();
      System.out.print("Введите название игрушки: ");
      Scanner in2 = new Scanner(System.in);
      String toyName = in2.nextLine();
      System.out.print("Введите вес игрушки(от 1 до 8): ");
      int toyValue = in.nextInt();
    
    toys = AddNewToys.addToyToArray(toyId, toyName,toyValue, toys);
     }
     System.out.println(toys);
    break;

  case "2":
    
    break;
    case "3":
    
    break;
    case "4":
    
    break;
}
}
         catch (InvalidInputException e) {
          System.err.println(e.getMessage());
      } catch (InputMismatchException e) {
          System.err.println("Некорректный ввод числа");
    

   

   

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
