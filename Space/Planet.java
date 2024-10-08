package Space;

public abstract class Planet {
    private static String planetName;
    private int numberOfMoon;
    private Double distanceFromSun;
    private PlanetType planetType;

    public  void AddMoon( ) {
    Integer MoonNumber=0;
    setNumberOfMoon(MoonNumber);
    }

    public Planet(String planetName, int numberOfMoon, Double distanceFromeSun, PlanetType planetType) {
        this.planetName = planetName;
        this.numberOfMoon = numberOfMoon;
        this.distanceFromSun = distanceFromeSun;
        this.planetType = planetType;
    }

    public String toString() {
        return   planetName +"#" +
                 planetType +"#"+
                 numberOfMoon +"#"+
                 distanceFromSun +"#"+;
    }
    public PlanetType getPlanetType() {
        return planetType;
    }

    public void setPlanetType(PlanetType planetType) {
        this.planetType = planetType;
    }

    public static String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public int getNumberOfMoon() {
        return numberOfMoon;
    }

    public void setNumberOfMoon(int numberOfMoon) {
        this.numberOfMoon = numberOfMoon;
    }

    public Double getDistanceFromSun() {
        return distanceFromSun;
    }

    public void setDistanceFromSun(Double distanceFromeSun) {
        this.distanceFromSun = distanceFromeSun;
    }
}
