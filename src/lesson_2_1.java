import java.util.Random;

public class lesson_2_1 {
    public static String permission(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }


    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(101); // Включила возраст от 0 до 100 включительно
    }

    public static void main(String[] args) {

        System.out.println(permission(generateRandomAge(), 45));
        System.out.println(permission(generateRandomAge(), -15));
        System.out.println(permission(generateRandomAge(), 22));
        System.out.println(permission(generateRandomAge(), 37));
        System.out.println(permission(generateRandomAge(), -5));
    }
}
