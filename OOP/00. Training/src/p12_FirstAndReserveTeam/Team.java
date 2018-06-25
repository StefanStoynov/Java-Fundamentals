package p12_FirstAndReserveTeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    private List<Person> firstTeam;
    private List<Person> secondTeam;

    public Team() {
        this.firstTeam = new ArrayList<>();
        this.secondTeam = new ArrayList<>();
    }



    public List<Person> getFirstTeam() {
        return Collections.unmodifiableList(this.firstTeam);
    }

    public List<Person> getSecondTeam() {
        return Collections.unmodifiableList(this.secondTeam);
    }

    public void addPlayer(Person person){
        if (person.getAge()<40){
            firstTeam.add(person);
        }else{
            secondTeam.add(person);
        }
    }

}
