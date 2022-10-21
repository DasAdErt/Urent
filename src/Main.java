import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Client client = new Client();

      System.out.println("Введите ваш возраст. ");

      Scanner scanner = new Scanner(System.in);
      client.age = scanner.nextInt();

      Rent rent = new Rent();
      rent.discount = 10;

      OperationOfApplication workApp = new OperationOfApplication();
      workApp.tracking = 1;

        if (client.age >= 18 && client.age <= 80) {
            System.out.println("Какой вы хотите выбрать парк самокатов?");
            System.out.println("1.Парк самокатов #1");
            System.out.println("2.Парк самокатов Яндекс");
            System.out.println("Цена за 1 километр в:");
            System.out.println("Парк самокатов #1 равна 20 рублям. А в Парке самокатов Яндекс равна 35 рублям.");
            System.out.print("Выбор: ");
            workApp.scooterPark = scanner.nextInt();
            switch (workApp.scooterPark)
            {
                case 1:
                    switch (workApp.tracking) {
                        case 0:
                            System.out.println("Самокат не исправен!");
                            break;
                        case 1:
                            System.out.println("Введите какую дистанцую хотите проехать в км.");
                            client.distance = scanner.nextInt();
                            rent.price = 20;

                            int priceKm =  client.distance * rent.price;
                            int priceKmWithDiscount = priceKm * (100 - rent.discount) / 100;
                            int discountInRub = priceKm - priceKmWithDiscount;

                            if (client.distance == 0) {
                                System.out.println("Не может быть дистанции 0 км");
                            }
                            else if (client.distance <= 30) {
                                System.out.println("Стоимость поездки без скидки: " + priceKm + " Рублей.");
                                System.out.println("Скидка составляет: " + discountInRub + " Рублей.");
                                System.out.println("Итого цена со скидкой: " + priceKmWithDiscount + " Рублей.");
                            }
                            else {
                                System.out.println("Дистанция слишком большая!");
                            }
                    }
                    break;
                case 2:
                    switch (workApp.tracking) {
                        case 0:
                            System.out.println("Самокат не исправен!");
                            break;
                        case 1:
                            System.out.println("Введите какую дистанцую хотите проехать в км.");
                            client.distance = scanner.nextInt();
                            rent.price = 35;

                            int priceKm =  client.distance * rent.price;
                            int priceKmWithDiscount = priceKm * (100 - rent.discount) / 100;
                            int discountInRub = priceKm - priceKmWithDiscount;

                            if (client.distance == 0) {
                                System.out.println("Не может быть дистанции 0 км");
                            }
                            else if (client.distance <= 30) {
                                System.out.println("Стоимость поездки без скидки: " + priceKm + " Рублей.");
                                System.out.println("Скидка составляет: " + discountInRub + " Рублей.");
                                System.out.println("Итого цена со скидкой: " + priceKmWithDiscount + " Рублей.");
                            }
                            else {
                                System.out.println("Дистанция слишком большая!");
                            }
                    }
                    break;
                default:
                    System.out.println("Такого парка самокатов нет!");
                    break;
            }
        }
        else if (client.age < 18)
        {
            System.out.println("Вам нет 18 лет!");
        }
        else {
            System.out.println("Такого возраста не может быть!");
        }
    }
}