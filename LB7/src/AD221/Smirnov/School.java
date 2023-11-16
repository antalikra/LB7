package AD221.Smirnov;

import java.util.Scanner;

// Перерахування для представлення пори року
enum Season {
    WINTER, SPRING, SUMMER, AUTUMN
}

// Клас Школа
public class School {
    private int numberOfStudents;
    private Season currentSeason;

    // Конструктор класу з параметрами
    public School(int numberOfStudents, Season currentSeason) {
        this.numberOfStudents = numberOfStudents;
        this.currentSeason = currentSeason;
    }

    // Гетери та сетери
    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public Season getCurrentSeason() {
        return currentSeason;
    }

    public void setCurrentSeason(Season currentSeason) {
        this.currentSeason = currentSeason;
    }

    // Метод для виведення інформації про школу
    public void printSchoolInfo() {
        System.out.println("Школа з " + numberOfStudents + " учнями, зараз " + currentSeason + ".");
    }

    // Метод для створення об'єкта Школа з введених даних
    public static School createSchool() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість учнів у школі: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine(); // Очищення буфера після введення числа

        System.out.print("Введіть поточну пору року (WINTER, SPRING, SUMMER, AUTUMN): ");
        Season currentSeason = Season.valueOf(scanner.nextLine().toUpperCase());

        return new School(numberOfStudents, currentSeason);
    }

    // Метод main для тестування
    public static void main(String[] args) {
        // Створення об'єкта Школа через конструктор
        School school1 = new School(500, Season.SPRING);

        // Виведення інформації про школу
        school1.printSchoolInfo();

        // Створення об'єкта Школа через введення користувача
        School school2 = createSchool();

        // Виведення інформації про другу школу
        school2.printSchoolInfo();
    }
}
