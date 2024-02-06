import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите свой текущий вес в килограммах: ");
        int weight = sc.nextInt();
        System.out.println("Введите свой рост в метрах: ");
        double height = sc.nextDouble();
        System.out.println("Введите свой возраст: ");
        int age = sc.nextInt();

        double imt = weight/ (height * height);
        double ideal_weight = 24.9 * height * height;
        double BMR = 88.36 + (13.4 * weight) + (4.8 * height) - (5.7 * age);

        if (imt > 24.9)
        {
            double t = weight - ideal_weight;
            double i = BMR - 500;
            System.out.println("Рекомендуется снизить вес для достижения идеального веса. Идеальный вес: " + ideal_weight + " Необходимо сбросить: " + t + "кг " + "Рекомендуемый дневной прием калорий: " + i + "\n");
        }
        else if (imt < 18.5)
        {
            double t = ideal_weight - weight;
            double i = BMR + 500;
            System.out.println("Рекомендуется увеличить потребление пищи для набора веса. Идеальный вес: " + ideal_weight + " Необходимо набрать: " + t + "кг " + "Рекомендуемый дневной прием калорий: " + i + "\n");
        }
        else
        {
            System.out.println("Ваш вес находится в пределах нормы. Идеальный вес: " + ideal_weight + " Рекомендуемый дневной прием калорий: " + BMR + "\n");
        }
    }
}