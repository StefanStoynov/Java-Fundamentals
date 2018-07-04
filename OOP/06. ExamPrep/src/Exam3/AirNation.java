package Exam3;

import java.util.ArrayList;
import java.util.List;

public class AirNation {
    private List<AirBender>airBenders;
    private List<AirMonument>airMonuments;

    public AirNation() {
        this.airBenders = new ArrayList<>();
        this.airMonuments = new ArrayList<>();
    }

    public List<AirBender> getAirBenders() {
        return this.airBenders;
    }

    public List<AirMonument> getAirMonuments() {
        return this.airMonuments;
    }

    public void addAirBender(AirBender airBender) {
        this.airBenders.add(airBender);
    }

    public void addAirMonuments(AirMonument airMonument) {
        this.airMonuments.add(airMonument);
    }

    public double airNationPower() {
        double ttlPower = 0;
        double airBandersPower = this.airBenders.stream().mapToDouble(AirBender::GetPower).sum();
        int monumentPercent = this.airMonuments.stream().mapToInt(AirMonument::getAirAffinity).sum();
        ttlPower = ((airBandersPower / 100) * monumentPercent) + airBandersPower;
        return ttlPower;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Air Nation").append(System.lineSeparator())
                .append("Benders:");
        if (this.getAirBenders().size()==0){
            sb.append(" None");
        }else{
            for (AirBender airBender : airBenders) {
                sb.append(System.lineSeparator()).append("###").append(airBender.toString());
            }
        }
        sb.append(System.lineSeparator());
        sb.append("Monuments:");
        if (this.getAirMonuments().size()==0){
            sb.append(" None");
        }else{
            for (AirMonument airMonument : airMonuments) {
                sb.append(System.lineSeparator()).append("###").append(airMonument.toString());
            }
        }
        return sb.toString();
    }
}
