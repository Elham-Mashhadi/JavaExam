package Space;



import java.util.ArrayList;
import java.util.List;

public class Galaxy {
    private String galaxyName;
    private List<Planet> planetList = new ArrayList();

    public Galaxy(String galaxyName, String planetType, String numberOfMoon, String distanceFromeSun) {
        this.galaxyName = galaxyName;
    }

    public String getGalaxyName() {
        return galaxyName;
    }

    public void setGalaxyName(String galaxyName) {
        this.galaxyName = galaxyName;
    }

    public List<Planet> getPlanetList() {
        return planetList;
    }

    public void setPlanetList(List<Planet> planetList) {
        this.planetList = planetList;
    }
}
