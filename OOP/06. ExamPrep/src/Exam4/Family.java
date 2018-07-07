package Exam4;

import Exam4.colonist.Colonist;

import java.util.LinkedList;
import java.util.List;

public class Family {
    private String id;
    private List<Colonist> colonists;

    public Family(String id) {
        this.id = id;
        this.colonists = new LinkedList<>();
    }

    public void addColonist(Colonist colonist) {
        this.colonists.add(colonist);
    }

    public void removeColonist(String id) {
        Colonist colonist = null;
        for (Colonist colonist1 : colonists) {
            if (colonist1.getId().equals(id)) {
                colonist = colonist1;
            }
        }
        this.colonists.remove(colonist);
    }

    public int familySize() {
        return this.colonists.size();
    }

    public List<Colonist> getColonists() {
        return this.colonists;
    }

    public String getId() {
        return this.id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.id).append(":");
        colonists.stream().sorted((c1,c2)-> c1.getId().compareTo(c2.getId())).forEach(colonist ->
                sb.append(System.lineSeparator()).append(String.format("-%s: %d"
                        ,colonist.getId(),colonist.getPotential())));

        return sb.toString();
    }
}
