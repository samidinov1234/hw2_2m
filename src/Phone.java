public class Phone implements Printable{
private String name;
private String color;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Phone(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public void print() {

    }
}
