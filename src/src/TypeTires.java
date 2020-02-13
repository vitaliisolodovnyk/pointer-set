public enum TypeTires {

    WINTER("Зимова"),
    SUMMER("Літня");
    private String name;

    TypeTires(String name) {
        this.name = name;
    }

    public static TypeTires toEnum(String input){
        return TypeTires.valueOf(input);
    }

    @Override
    public String toString() {
        return "TypeTires{" +
                "name='" + name + '\'' +
                '}';
    }
}
