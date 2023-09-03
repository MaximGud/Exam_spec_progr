package Task2;

import java.util.List;
import java.util.Scanner;

public class SetFreq {

  public static void setFrequency(List<Toy> toys) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите ID игрушки: ");
        String value = scan.nextLine();
        if (isDigit(value)) {
            int selectedId = Integer.parseInt(value)-1;
            if (selectedId >= 0 && selectedId < toys.size()) {
                System.out.println("Игрушка " + toys.get(selectedId).getToyName() +
                        " имеет шанс выпадения " + toys.get(selectedId).getValue());
                System.out.print("Введите новый шанс выпадения: ");
                value = scan.nextLine();
                if (isDigit(value)) {
                    int newFrequency = Integer.parseInt(value);
                    toys.get(selectedId).setValue(newFrequency);
                    System.out.println("Шанс выпадения был изменен.");
                } else {
                    System.out.println("Неверный ввод. Повторите снова.");
                }
            } else {
                System.out.println("Нет игрушки с таким ID.");
            }
        } else {
            System.out.println("Неверный ввод. Повторите снова.");
        }
    }
    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
