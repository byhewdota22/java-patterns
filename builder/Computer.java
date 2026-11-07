package builder;

public class Computer {
    private final String cpu;
    private final int ram;
    private final String gpu;
    private final int ssd;
    private final int powerSupply;
    private Computer(String cpu, int ram, String gpu, int ssd, int powerSupply) {
    	
        this.cpu = cpu;
        this.ram = ram;
        this.gpu = gpu;
        this.ssd = ssd;
        this.powerSupply = powerSupply;
        
}
    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", gpu='" + gpu + '\'' +
                ", ssd=" + ssd +
                ", powerSupply=" + powerSupply +
                '}';
    }
    public static class Builder {
        private String cpu;
        private int ram;
        private String gpu;
        private int ssd;
        private int powerSupply;

        public Builder(String cpu, int ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder gpu(String gpu) {
            this.gpu = gpu;
            return this;  
        }

        public Builder ssd(int ssd) {
            this.ssd = ssd;
            return this;
        }

        public Builder powerSupply(int powerSupply) {
            this.powerSupply = powerSupply;
            return this;
        }
        
        public Computer build() {
            return new Computer(cpu, ram, gpu, ssd, powerSupply);
        }
    }
}

