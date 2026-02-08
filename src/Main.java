public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int a = 5;
        int b = 2;
        System.out.println("Сумма: " + (a + b));
        System.out.println("Разность: " + (a - b));
        System.out.println("Произведение: " + (a * b));
        System.out.println("Деление:" + (a / b));
        System.out.println("Остаток от деления: " + (a % b));
        System.out.println("=========================");

        System.out.println("Task 2");
        int x = 7;
        //int y = x++;
        int y = ++x;
        System.out.println("Результат: " + y);
        System.out.println("=========================");

        System.out.println("Task 3");
        int a3 = 3;
        int b3 = 9;
        System.out.println(a3 > b3);
        System.out.println(a3 == b3);
        System.out.println(a3 != b3);
        System.out.println("=========================");

        System.out.println("Task 4");
        int age = 20;
        boolean hasTicket = true;
        if (age >= 18 && hasTicket) {
            System.out.println("Проход разрешён");
        } else {
            System.out.println("Проход запрещён");
        }
        System.out.println("=========================");

        System.out.println("Task 5");
        int number = 10;
        if (number > 0){
            System.out.println("Положительное");
        } else if (number == 0){
            System.out.println("Ноль");

        } else {
            System.out.println("Отрицательное");
        }
        System.out.println("=========================");

        System.out.println("Task 6");
        int x6 = 30;
        int y6 = 20;
        int max = x6 > y6 ? x6 : y6;
        System.out.println(max);
        System.out.println("=========================");

        System.out.println("Task 7");
        int day = 3;
       switch (day) {
           case 1:
               System.out.println("Понедельник");
               break;
           case 2:
               System.out.println("Вторник");
               break;
           case 3:
               System.out.println("Среда");
               break;
           case 4:
               System.out.println("Четверг");
               break;
           case 5:
               System.out.println("Пятница");
               break;
           case 6:
               System.out.println("Суббота");
               break;
           case 7:
               System.out.println("Воскресенье");
               break;
           default:
               System.out.println("Неккоректный день");
       }

    }
}