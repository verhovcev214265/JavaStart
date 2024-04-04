package sk.com.ymca.java.more_hard_decides.lecture3.task4;

public class Volume {

    // V = πR2h
    public double volumeOfCylinder (double radius, double height){
        return (Math.PI * Math.pow(radius, 2) * height);
    }

    // S = 2πR2 + 2πR2 = 2πR(R+h)
    public double areaOfCylinder (double radius, double height){
        return  2 * Math.PI * radius * (radius + height);
    }
}
