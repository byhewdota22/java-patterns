package builder;

public class Main {
    public static void main(String[] args) {
        Computer basic = new Computer.Builder("Intel i5", 8)
                .build();
        System.out.println("Рабочий ПК: " + basic);

        
        Computer gaming = new Computer.Builder("Intel i9", 32)
                .gpu("NVIDIA RTX 5090")
                .ssd(2000)
                .powerSupply(850)
                .build();
        System.out.println("Игровой ПК: " + gaming);
    }
}
