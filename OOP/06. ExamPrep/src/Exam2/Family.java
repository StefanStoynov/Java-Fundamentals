package Exam2;

import Exam2.Colonist.Colonist;

import java.util.LinkedList;
import java.util.List;

public  class Family {
    private String id;
    List<Colonist> familyMembers;

    public Family(String id) {
        this.id = id;
        familyMembers = new LinkedList<>();
    }

    public void addMember(Colonist colonist){
        this.familyMembers.add(colonist);
    }

    public List<Colonist> getFamilyMembers() {
        return this.familyMembers;
    }

    public String getId() {
        return this.id;
    }
}
