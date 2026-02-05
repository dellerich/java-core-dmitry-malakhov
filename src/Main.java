public class Main {
    public static void main(String[] args) {
        int age = 20;
        boolean hasTicket = true;
        if (age >= 18 && hasTicket) {
            System.out.println("Проход разрешён");
        } else {
            System.out.println("Проход запрещён");
        }
    }
}