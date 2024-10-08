package Space;

public class SpecialPlanet extends Planet implements BehaviorPlanet {
    private boolean haseLifeSupportingPlanet;
    private boolean hasResopurceRichiPlanet;
    private ResopurcePlanet ResopurceRichiPlanet;

    public SpecialPlanet(String planetName, int numberOfMoon, Double distanceFromeSun, PlanetType planetType) {
        super(planetName, numberOfMoon, distanceFromeSun, planetType);
    }


    @Override
    public void ChecklifeStatus() {
        System.out.println("Has Life");
    }

    @Override
    public void ChekNaturalResource() {
        System.out.println("Has Natural Resource");

    }

    public boolean isHaseLifeSupportingPlanet() {
        return haseLifeSupportingPlanet;
    }

    public void setHaseLifeSupportingPlanet(boolean haseLifeSupportingPlanet) {
        this.haseLifeSupportingPlanet = haseLifeSupportingPlanet;
    }

    public boolean isHasResopurceRichiPlanet() {
        return hasResopurceRichiPlanet;
    }

    public void setHasResopurceRichiPlanet(boolean hasResopurceRichiPlanet) {
        this.hasResopurceRichiPlanet = hasResopurceRichiPlanet;
    }

    public ResopurcePlanet getResopurceRichiPlanet() {
        return ResopurceRichiPlanet;
    }

    public void setResopurceRichiPlanet(ResopurcePlanet resopurceRichiPlanet) {
        ResopurceRichiPlanet = resopurceRichiPlanet;
    }
}
