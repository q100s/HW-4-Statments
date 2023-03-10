public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1() {
        System.out.println("Task 1");
        int age = 15;
        if (age >= 18) {
            System.out.println("You're underage");
        }
        if (age < 18) {
            System.out.println("You aren't underage, you should wait!");
        }
    }
    public static void task2() {
        System.out.println("Task 2");
        int temperature = 1;
        if (temperature >= 5) {
            System.out.println("There is " + temperature + " degrees on the street. It's warm, you can go without a hat");
        }
        if (temperature < 5) {
            System.out.println("There is " + temperature + " degrees on the street. It's cold, you have to wear a hat");
        }
    }
    public static void task3() {
        System.out.println("Task 3");
        int speed = 10;
        if (speed >= 60) {
            System.out.println("If speed is " + speed + " you'll pay a fine");
        }
        if (speed < 60) {
            System.out.println("If speed is " + speed + " you'll be able to ride calmly");
        }
    }
    public static void task4() {
        System.out.println("Task 4");
        int age = 1;
        if (age >= 2 && age <= 6) {
            System.out.println("If person's age is " + age + " person will have to go to kinder garden");
        } else if (age > 6 && age <= 18) {
            System.out.println("If person's age is " + age + " person will have to go to school");
        } else if (age > 18 && age <= 24) {
            System.out.println("If person's age is " + age + " person will have to go to university");
        } else if (age >= 24) {
            System.out.println("If person's age is " + age + " person will have to go to work");
        } else {
            System.out.println("Person is too young");
        }
    }
    public static void task5() {
        System.out.println("Task 5");
        int age = 14;
        if (age < 5) {
            System.out.println("If child's age is " + age + " child won't be able to ride on the rides");
        } else if (age >= 5 && age < 14) {
            System.out.println("If child's age is " + age + " child will be able to ride on the rides with an adult only");
        } else {
            System.out.println("If child's age is " + age + " child will be able to ride on the rides without an adult");
        }
    }
    public static void task6() {
        System.out.println("Task 6");
        int occupiedPlaces = 150;
        if (occupiedPlaces < 60) {
            System.out.println("There are some seating places in the wagon");
        } else if (occupiedPlaces >= 60 && occupiedPlaces < 102) {
            System.out.println("There are only standing places in the wagon");
        } else if (occupiedPlaces >= 102) {
            System.out.println("There are no places in the wagon");
        }
    }
    public static void task7() {
        System.out.println("Task 7");
        int one = 1;
        int two = 2;
        int three = 10;
        if (one > two) {
            if (one > three) {
                System.out.println("The biggest number is " + one);
            } else {
                System.out.println("The biggest number is " + three);
            }
        } else {
            if (two > three) {
                System.out.println("The biggest number is " + two);
            } else {
                System.out.println("the biggest number is " + three);
            }
        }
    }
}