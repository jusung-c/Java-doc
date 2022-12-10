package practice;

public enum Gender implements Printer{
    MALE("XY"),
    FEMALE("XX");

    private String chromosome; // 염색체

    private Gender(String chromosome) {
        this.chromosome = chromosome;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "chromosome='" + chromosome + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println("염색체: " + chromosome);
    }
}

