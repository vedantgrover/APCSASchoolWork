package DigitalCamera;

public class DigitalCameraRunner {
    public static void main(String[] args) {
      DigitalCamera cam1 = new DigitalCamera("Kodak", 2.4);
      DigitalCamera cam2 = new DigitalCamera("Kodak", 5.8);
      DigitalCamera cam3 = new DigitalCamera("Canon", 6.4);

      System.out.println(cam1);
      System.out.println("Cam 1 equals cam2? : " + cam1.equals(cam2));
      System.out.println("Cam 2 equals cam3? : " + cam2.equals(cam3));
    }
    
}
