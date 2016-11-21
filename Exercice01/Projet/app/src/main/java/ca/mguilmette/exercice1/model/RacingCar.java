package ca.mguilmette.exercice1.model;

/**
 * Created by guilmarc on 2016-11-13.
 */

public final class RacingCar extends Car {

    private String team;
    private String sponsor;

    public RacingCar(CarBrandEnum brand, int maxSpeed, String team, String sponsor){
        super(CarBrandEnum.Ferrari, 340, "");
        this.team = team;
        this.sponsor = sponsor;
    }

    public String getSponsor() { return sponsor; }

    public void setSponsor(String sponsor) { this.sponsor = sponsor; }

    public String getTeam() { return team; }

    public void setTeam(String team) { this.team = team; }

    @Override
    public void Run() {
        System.out.println("Les feux rouges s'éteignent et on roule au circuit du Canada...");
    }

}
