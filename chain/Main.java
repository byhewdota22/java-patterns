package chain;

public class Main {
    public static void main(String[] args) {
        // Создаём обработчики
        SupportHandler bot = new BotHandler();
        SupportHandler operator = new OperatorHandler();
        SupportHandler developer = new DeveloperHandler();

        // Выстраиваем цепочку: бот → оператор → разработчик
        bot.setNext(operator);
        operator.setNext(developer);

        // Первое звено(бот)
        System.out.println("Пример - 1(бот)");
        bot.process("Как сбросить пароль?");

        System.out.println("Пример - 2(служба поддержки)");
        bot.process("Не проходит оплата картой");

        System.out.println("Пример - 3(разраб)");
        bot.process("Нашёл критический баг в приложении");

        System.out.println("Пример - 4(никто)");
        bot.process("хочу кофе");
    }
}
