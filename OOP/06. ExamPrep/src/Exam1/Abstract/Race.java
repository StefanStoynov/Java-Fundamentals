package Exam1.Abstract;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Race {

    private int length;
    private String route;
    private int prizePool;
    private List<Car> participants;

    protected Race(int length, String route, int prizePool) {
        this.length = length;
        this.route = route;
        this.prizePool = prizePool;
        this.participants = new ArrayList<>();
    }
    public boolean hasParticipants(){
        return !participants.isEmpty();
    }

    public List<Car> getParticipants() {
        return Collections.unmodifiableList(this.participants);
    }

    public void addParticipants(Car car) {
        this.participants.add(car);
    }

    public boolean isParticipant(Car car) {
        return this.getParticipants().contains(car);
    }

    private int getPercentageprice(int index) {
        switch (index) {
            case 0:
                return 50;
            case 1:
                return 30;
            case 2:
                return 20;
        }
        return 0;
    }

    private int performancePoints(String raceType, Car car) {
        switch (raceType) {
            case "CasualRace":
                return car.getOverallPerformance();
            case "DragRace":
                return car.getEnginePerformance();
            case "DriftRace":
                return car.getSuspensionPerformance();
            default:
                return 0;
        }
    }

    private List<Car> getWinners() {
        return this.participants
                .stream()
                .sorted((car1, car2) -> {
                    String race = this.getClass().getSimpleName();
                    return this.performancePoints(race, car2) - this.performancePoints(race, car1);
                })
                .limit(3)
                .collect(Collectors.toList());

    }

    @Override
    public String toString() {
        List<Car> winners = this.getWinners();
        String race = this.getClass().getSimpleName();
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s - %d", this.route, this.length));
        for (int i = 0; i < winners.size(); i++) {
            int moneyWon = (prizePool * getPercentageprice(i))/100;
            Car winner = winners.get(i);
            sb.append(System.lineSeparator())

                    .append(String.format("%d. %s %s %dPP - $%d"
                    , i + 1
                    , winner.getBrand()
                    , winner.getModel()
                    , this.performancePoints(race, winner)
                    ,moneyWon));
        }

        return sb.toString();
    }


}
