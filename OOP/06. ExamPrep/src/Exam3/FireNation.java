package Exam3;

import java.util.ArrayList;
import java.util.List;

public class FireNation{
    private List<FireBender>fireBenders;
    private List<FireMonument>fireMonuments;

    public FireNation() {
        this.fireBenders = new ArrayList<>();
        this.fireMonuments = new ArrayList<>();
    }

    public List<FireBender> getFireBenders() {
        return this.fireBenders;
    }

    public List<FireMonument> getFireMonuments() {
        return this.fireMonuments;
    }

    public void addFireBender(FireBender fireBender) {
        this.fireBenders.add(fireBender);
    }

    public void addFireMonument(FireMonument fireMonument) {
        this.fireMonuments.add(fireMonument);
    }

    public double fireNationPower(){
        double ttlPower = 0;
        double fireBandersPower = this.fireBenders.stream().mapToDouble(FireBender::GetPower).sum();
        int monumentPercent = this.fireMonuments.stream().mapToInt(FireMonument::getFireAffinity).sum();
        ttlPower = ((fireBandersPower/100) * monumentPercent)+ fireBandersPower;
        return ttlPower;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fire Nation").append(System.lineSeparator())
                .append("Benders:");
        if (this.getFireBenders().size()==0){
            sb.append(" None");
        }else{
            for (FireBender fireBender :fireBenders) {
                sb.append(System.lineSeparator()).append("###").append(fireBender.toString());
            }
        }
        sb.append(System.lineSeparator());
        sb.append("Monuments:");
        if (this.getFireMonuments().size()==0){
            sb.append(" None");
        }else{
            for (FireMonument fireMonument : fireMonuments) {
                sb.append(System.lineSeparator()).append("###").append(fireMonument.toString());
            }
        }
        return sb.toString();
    }
}
