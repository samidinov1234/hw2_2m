public class Poco extends Phone {
    private int yearOfRelease;

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public Poco(String name, String color, int yearOfRelease) {
        super(name, color);
        this.yearOfRelease = yearOfRelease;
    }
    public void print() {
        System.out.println("Poco: name " + getName() + ",color" + getColor() + ",yearOfRelease" + getYearOfRelease()) ;
    }
}
