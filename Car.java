import javax.security.auth.PrivateCredentialPermission;

// A class, variables and methods 

public class Car {
    private String model; 
    private String make;
    private String color;
    private float length;
    private int year;
    
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public float getLength() {
        return length;
    }
    public void setLength(float length) {
        this.length = length;
    }
    

    
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    

    


    @Override
    public String toString() {
        return model + " [color=" + color + ", length=" + length + ", make=" + make + ", model=" + model + ", year=" + year
                + "]";
    }
    public static void main(String[] args) {
        

        Car camry = new Car();

        camry.setModel("Camry");
        camry.setYear(2018);
        camry.setColor("Grey");
        camry.setLength(10.2f);
        camry.setMake("Toyota");

        System.out.println(camry);

    }
}
