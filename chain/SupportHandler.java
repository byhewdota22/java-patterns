package chain;

public abstract class SupportHandler {

    private SupportHandler next;
    
    public void setNext(SupportHandler next) {
        this.next = next;
    }

    public void process(String message) {
        if (canHandle(message)) {
            handle(message);              
        } else if (next != null) {
            next.process(message); 
        } else {
            System.out.println("Никто не смог обработать запрос: " + message);
        }
    }

    protected abstract boolean canHandle(String message); 
    protected abstract void handle(String message);     
}