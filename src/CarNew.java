public class CarNew {
    public static void main(String[] args) {
        Car cr = new Car("Audi A5", "Audi", 2020, 2000000, "Black", 20 );
        System.out.println(cr.toString());
        cr.sell( 18);
        System.out.println(cr.getColor());
        cr.setColor("Red");
        int year = cr.getYear();
        cr.setYear(2021);
        System.out.println(cr.getModel());
        System.out.println(cr.getBrand());
        System.out.println(cr.getPrice());
        System.out.println(cr.getQuantity());
        System.out.println(cr.toString());
    }
}
class Car {
    private String model;
    private String brand;
    private int year;
    private float price;
    private String color;
    private float quantity;

    public Car(String model, String brand, int year, int price, String color,int quantity ) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;


    }

    public void sell(int sold) { quantity -= sold; }

    public void delivery(int delivery) {quantity -= delivery; }

    public String getModel() { return model;}

    public void setModel(String model) {this.model = model;}

    public String getBrand() {return brand;}

    public void setBrand(String brand) {this.brand = brand;}

    public int getYear() {return year;}

    public void setYear(int year) {this.year = year;}

    public float getPrice() {return price;}

    public void setPrice(float price) {this.price = price;}

    public String getColor() {return color;}

    public void setColor(String color) {this.color = color;}

    public float getQuantity() {return quantity;}

    public void setQuantity(float quantity) {this.quantity = quantity;}

    @Override

    public String toString() {
        return "CarNew{" +
                "model='"+ model + '\'' +
                ", brand="+ brand +'\'' +
                ",year=" + year +
                ",price=" + price +
                ",color='" + color + '\'' +
                ",quantity="+ quantity +
                '}';


}
}