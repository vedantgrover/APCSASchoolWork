package DigitalCamera;

public class DigitalCamera {
    
    // attributes
    private String brand;
    private double mp;
    private int price;
    

    // class constructor
    public DigitalCamera(String brand, double mp) {
        this.brand = brand;
        this.mp = mp;
        filterMp();
        setPrice();
    }

    public void takePicture() {
        System.out.println("The shutter snaps with a fake shutter sound");
    }

    public void dropCamera() {

    }

    public void setPrice() {
        if (mp<=6) {
            price = 99;
        } else if (mp>6 && mp<9) {
            price = 149;
        } else {
            price = 199;
        }

        String b = brand.toLowerCase();
        if (b.equals("canon")) {
            price+=50;
        } else if (b.equals("nikon") || b.equals("sony")) {
            price+=30;
        }
    }

    public void filterMp() {
        if (mp>12) {
            this.mp = 12;
        } 
        if (mp<3) {
            this.mp=3;
        }
    }

    // accessors
    public String getBrand() {
        return brand;
    }

    public double getMp() {
        return mp;
    }

    public int getPrice() {
        return price;
    }

    // mutators
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMp(double mp) {
        this.mp = mp;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        String str = "Camera brand: " + brand +
                    "\nResolution: " + mp +
                    "\nPrice: " + price;
        return str;
    }

    public boolean equalsAlt(DigitalCamera d) {
        double thisRes = this.mp;
        double thatRes = d.getMp();
        double diff = thisRes - thatRes;
        boolean isEqual = diff >= 1 && diff<1; 
        return isEqual;
    }

    public boolean equals(DigitalCamera d) {
        return Math.abs(this.mp - d.getMp())<1; 
    }
}