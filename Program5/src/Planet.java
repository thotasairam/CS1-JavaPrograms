/**
 * Sai Ram Thota
 * CWID 11573236
 *
 */
public class Planet {

    private String planetName;
    private int yearDiscovered;
    private double mass;
    private double radius;
    private double orbitPeriod;

    public Planet(String planetName, int yearDiscovered, double mass, double radius, double orbitPeriod) {
        this.planetName = planetName;
        this.yearDiscovered = yearDiscovered;
        this.mass = mass;
        this.radius = radius;
        this.orbitPeriod = orbitPeriod;
    }

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public int getYearDiscovered() {
        return yearDiscovered;
    }

    public void setYearDiscovered(int yearDiscovered) {
        this.yearDiscovered = yearDiscovered;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getOrbitPeriod() {
        return orbitPeriod;
    }

    public void setOrbitPeriod(double orbitPeriod) {
        this.orbitPeriod = orbitPeriod;
    }
}
