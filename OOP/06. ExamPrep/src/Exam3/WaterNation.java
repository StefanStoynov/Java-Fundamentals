package Exam3;

import java.util.ArrayList;
import java.util.List;

public class WaterNation{
    private List<WaterBender>waterBenders;
    private List<WaterMonument>waterMonuments;

    public WaterNation() {
        this.waterBenders = new ArrayList<>();
        this.waterMonuments = new ArrayList<>();
    }

    public List<WaterBender> getWaterBenders() {
        return this.waterBenders;
    }

    public List<WaterMonument> getWaterMonuments() {
        return this.waterMonuments;
    }

    public void addWaterBender(WaterBender waterBender) {
        this.waterBenders.add(waterBender);
    }

    public void addWaterMonument(WaterMonument waterMonument) {
        this.waterMonuments.add(waterMonument);
    }

    public double waterNationPower(){
        double ttlPower = 0;
        double waterBandersPower = this.waterBenders.stream().mapToDouble(WaterBender::GetPower).sum();
        int monumentPercent = this.waterMonuments.stream().mapToInt(WaterMonument::getWaterAffinity).sum();
        ttlPower = ((waterBandersPower/100) * monumentPercent)+ waterBandersPower;
        return ttlPower;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Water Nation").append(System.lineSeparator())
                .append("Benders:");
        if (this.getWaterBenders().size()==0){
            sb.append(" None");
        }else{
            for (WaterBender waterBender : waterBenders) {
                sb.append(System.lineSeparator()).append("###").append(waterBender.toString());
            }
        }
        sb.append(System.lineSeparator());
        sb.append("Monuments:");
        if (this.getWaterMonuments().size()==0){
            sb.append(" None");
        }else{
            for (WaterMonument waterMonument : waterMonuments) {
                sb.append(System.lineSeparator()).append("###").append(waterMonument.toString());
            }
        }
        return sb.toString();
    }
}
