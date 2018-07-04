package Exam3;

import java.util.ArrayList;
import java.util.List;

public class EarthNation {
    private List<EarthBender> earthBenders;
    private List<EarthMonument> earthMonuments;

    public EarthNation() {
        this.earthBenders = new ArrayList<>();
        this.earthMonuments = new ArrayList<>();
    }

    public List<EarthBender> getEarthBenders() {
        return this.earthBenders;
    }

    public List<EarthMonument> getEarthMonuments() {
        return this.earthMonuments;
    }

    public void addEarthBender(EarthBender earthBender) {
        this.earthBenders.add(earthBender);
    }

    public void addEarthMonument(EarthMonument earthMonument) {
        this.earthMonuments.add(earthMonument);
    }

    public double earthNationPower() {
        double ttlPower = 0;
        double earthBandersPower = this.earthBenders.stream().mapToDouble(EarthBender::GetPower).sum();
        int monumentPercent = this.earthMonuments.stream().mapToInt(EarthMonument::getEarthAffinity).sum();
        ttlPower = ((earthBandersPower / 100) * monumentPercent) + earthBandersPower;
        return ttlPower;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Earth Nation").append(System.lineSeparator())
                .append("Benders:");
        if (this.getEarthBenders().size() == 0) {
            sb.append(" None");
        } else {
            for (EarthBender earthBender : earthBenders) {
                sb.append(System.lineSeparator()).append("###").append(earthBender.toString());
            }
        }
        sb.append(System.lineSeparator());
        sb.append("Monuments:");
        if (this.getEarthMonuments().size() == 0) {
            sb.append(" None");
        } else {
            for (EarthMonument earthMonument : earthMonuments) {
                sb.append(System.lineSeparator()).append("###").append(earthMonument.toString());
            }
        }
        return sb.toString();
    }
}

