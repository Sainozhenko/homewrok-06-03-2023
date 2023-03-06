public class Main {
    public static void main(String[] args) {
        //Задача 1
        //Создать класс Student c полями (переменными) имя и номер.
        //Создать несколько обьектов этого класса

        //Задача 2
        //Добавить в класс Student конструктор с параметрами имя и номер.
        //Создать еще несколько обьектов класса с использованием этого конструктора
        Student student0 = new Student();
        student0.name = "Raminata";
        student0.number = 123;
        System.out.println(student0.name);
        System.out.println(student0.number);
        System.out.println();

        Student maksym = new Student();
        maksym.name = "Maksym";
        maksym.number = 321;
        System.out.println(maksym.name);
        System.out.println(maksym.number);
        System.out.println();


        System.out.println("New student with create constructor: ");
        Student student1 = new Student("Dmytro", 3232);
        System.out.println(student1.name);
        System.out.println(student1.number);
        System.out.println();

        System.out.println("New student with create constructor: ");
        Student iryna = new Student("Iryna", 2222);
        System.out.println(iryna.name);
        System.out.println(iryna.number);
    }
}