public class Main {
    public static void main(String[] args) {
        Phone[] phones = {createObject ("Iphone"),createObject("Poco"),createObject("Redmi")};
        for (Phone printable: phones) {
            printable.print();
        }
    }

    private static Phone createObject(String className)  {
        Phone phones = null;
        switch (className){
            case "Iphone":
                phones = new Iphone("Iphone13 ","Black","powerful" );
                break;
            case "Poco":
                phones = new Poco("poco X3 ", "Red",2000);
                break;
            case "Redmi":
                phones = new Redmi("Redmi 10 ", "Blue", "America");
                break;
        }
        return phones;
    }
}