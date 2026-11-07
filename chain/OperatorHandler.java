package chain;

public class OperatorHandler extends SupportHandler {

    @Override
    protected boolean canHandle(String message) {
        String lower = message.toLowerCase();
        return lower.contains("оплата") || lower.contains("деньги");
    }

    @Override
    protected void handle(String message) {
        System.out.println("Запрос передан в службу поддержки");
    }
}