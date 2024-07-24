public class Car {
    private String brand;

    Car() {
        this.brand = "Ford";
    }

    public String getbrand() {
        return this.brand;
    }

    public static void main(String[] args) {
        Car car = new Car();
        String brands = car.brand;
        System.out.println(car.brand);
    }
}
