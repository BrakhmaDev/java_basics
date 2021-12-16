package Computer;

public class Cpu {
    private final double frequency;
    private final int cores;
    private final String vendor;
    private final int weight;

    public Cpu(double frequency, int cores, String vendor, int weight) {
        this.frequency = frequency;
        this.cores = cores;
        this.vendor = vendor;
        this.weight = weight;
    }

    public Cpu setFrequency(double frequency) {
        return new Cpu(frequency, cores, vendor, weight);
    }

    public Cpu setCores(int cores) {
        return new Cpu(frequency, cores, vendor, weight);
    }

    public Cpu setVendor(String vendor) {
        return new Cpu(frequency, cores, vendor, weight);
    }

    public Cpu setWeight(int weight) {
        return new Cpu(frequency, cores, vendor, weight);
    }

    public double getFrequency() {
        return frequency;
    }

    public int getCores() {
        return cores;
    }

    public String getVendor() {
        return vendor;
    }

    public int getWeight() {
        return weight;
    }

    public String getCharachersOfCpu() {
         return "Харктеристики процессора: \tЧастота: " + frequency +
                 " ГГц \tКоличество ядер: " + cores +
                 "\tПроизводитель: " + vendor +
                 "\tВес: " + weight + " гр.";
    }
}