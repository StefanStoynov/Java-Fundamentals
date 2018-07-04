package Exam2;

import Exam2.Colonist.Colonist;


import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Colony {

    private int maxFamilyCount;
    private int maxFamilyCapacity;
    private Map<String, Family> families;

    public Colony(int maxFamilyCount, int maxFamilyCapacity) {
        this.maxFamilyCount = maxFamilyCount;
        this.maxFamilyCapacity = maxFamilyCapacity;
        this.families = new LinkedHashMap<>();

    }

    public Map<String, Family> getFamilies() {
        return this.families;
    }


    public int getMaxFamilyCount() {
        return this.maxFamilyCount;
    }

    public int getMaxFamilyCapacity() {
        return this.maxFamilyCapacity;
    }

    public void setMaxFamilyCount(int maxFamilyCount) {
        this.maxFamilyCount = maxFamilyCount;
    }

    public void setMaxFamilyCapacity(int maxFamilyCapacity) {
        this.maxFamilyCapacity = maxFamilyCapacity;
    }

    public void addFamily(String id, Family family) {
        this.families.put(id, family);
    }

    public void addColonist(Colonist colonist) {

    }

    public void removeColonist(String familyId, String memberId) {

    }

    public void removeFamily(String id) {

    }

    public List<Colonist> getColonistsByFamilyId(String familyId) {
        return new LinkedList<>();
    }

    public void grow(int years) {

    }

    public int getPotential() {
        return 0;
    }

    public String getCapacity() {
        return null;
    }

}
