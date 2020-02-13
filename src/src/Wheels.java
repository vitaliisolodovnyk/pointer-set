import java.util.Objects;

public class Wheels {

    private int diameter;
    TypeTires typeTires;
    String[] wheels = {"wheel1", "wheel2", "wheel3", "wheel4"};

    public Wheels(int diameter, TypeTires typeTires) {
        this.diameter = diameter;
        this.typeTires = typeTires;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public TypeTires getTypeTires() {
        return typeTires;
    }

    public void setTypeTires(TypeTires typeTires) {
        this.typeTires = typeTires;
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheels wheels = (Wheels) o;
        return diameter == wheels.diameter &&
                typeTires == wheels.typeTires;
    }

    @Override
    public int hashCode() {
        return Objects.hash(diameter, typeTires);
    }
}
