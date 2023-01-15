public class Main {
    public static void main(String[] args) {
        int amount = 100; //стоимость билета
        int y = 20; //количество рублей для одной мили
        int bonus = amount / y; //количество бонусных миль
        System.out.println("Количество начисленных миль за купленный билет: " + bonus);
    }
}