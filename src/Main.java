import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
   /*Triangle деген класс тузунуз.

Класстын 3 полеси болсун a, b, c.

Класстын "area" деген методу болсун.

"area" методу полелериндеги маалыматтарга(маалымат объектти тузгондон кийин берилет)

таянып консолго уч бурчтуктун аянтын чыгарсын.

-------------------------------------------------------------------------------------------------------------------------------------

Создайте класс Triangle, у класса должны быть поля a, b, c.

В классе создайте метод "area" который при вызове выводит на консоль площадь треугольника.*/

Triangle triangle = new Triangle();
 triangle.a = 13;
 triangle.b = 14;
 triangle.c = 15;

 System.out.println("a ---> "+triangle.a +"\nb ---> "+triangle.b+"\nc ---> "+triangle.c);
 triangle.getArea(triangle.a, triangle.b, triangle.c);

    }
}