public class Redmi extends Phone {
    private String production;

    public String getProduction() {
        return production;
    }

    public Redmi(String name, String color, String production) {
        super(name, color);
        this.production = production;
    }
    public void print() {
        System.out.println("Redmi: name " + getName() + ",color" + getColor() + ",production" + getProduction());
}
}
