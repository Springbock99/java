package FirstClass.chapter7;

public class animal {

    private String type;
    private String size;
    private double weight;

    public animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;

    }

    public String toString() {
        return "Animal " + " type = " + type + '/' + "size= " + size + '/' + "wight= " + weight;
    }

}
