// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }



    public static void task1 () {
        System.out.println("Домашнее задание №10");
        System.out.println("");
        System.out.println("============================");
        System.out.println("======= Задача 1 ===========");
        System.out.println("============================");
        String firstName = "Ivan";
        String  middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " "+ firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println("===== Конец задачи 1 =======");


    }

    public static void task2 () {
        System.out.println("");
        System.out.println("============================");
        System.out.println("======= Задача 2 ===========");
        System.out.println("============================");
        String firstName = "Ivan";
        String  middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " "+ firstName + " " + middleName;
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+fullName.toUpperCase());
        System.out.println("===== Конец задачи 2 =======");

    }
    private static void task3() {
        System.out.println("");
        System.out.println("============================");
        System.out.println("======= Задача 3 ===========");
        System.out.println("============================");
        String fullname = "Иванов Семён Семёнович";
        fullname = fullname.replace("ё", "е");
        System.out.println(fullname);
        System.out.println("===== Конец задачи 3 =======");

    }
}
