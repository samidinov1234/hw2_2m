public class Iphone extends Phone {
    private String camera;
    public String getCamera() {
        return camera;
    }

    public Iphone(String name, String color, String camera) {
        super(name, color);
        this.camera = camera;
    }

    public void print() {
        System.out.println("Iphone: name " + getName() + ",color" + getColor() + ",camera" + getCamera());
    }
}
