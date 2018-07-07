package Exam4;

import Exam4.colonist.Colonist;

import java.util.*;



public class Colony {

    private int maxFamilyCount;
    private int maxFamilyCapacity;
    private Map<String, Family> families;

    public Colony(int maxFamilyCount, int maxFamilyCapacity) {
        this.maxFamilyCount = maxFamilyCount;
        this.maxFamilyCapacity = maxFamilyCapacity;
        this.families = new LinkedHashMap<>();
    }

    public int getMaxFamilyCount() {
        return this.maxFamilyCount;
    }

    public int getMaxFamilyCapacity() {
        return this.maxFamilyCapacity;
    }

    public Map<String, Family> getFamilies() {
        return this.families;
    }

    public void addColonist(Colonist colonist) {
        String familyId = colonist.getFamilyId();
        Family family = this.families.get(familyId);
        if (family == null) {
            if (this.maxFamilyCount <= this.families.size()) {
                throw new IllegalArgumentException("colony is full");
            }
            family = new Family(familyId);
        }
        if (family.getColonists().size() == this.maxFamilyCapacity) {
            throw new IllegalArgumentException("family is full");
        }
        family.addColonist(colonist);
        this.families.put(familyId, family);

    }

    public void removeColonist(String familyId, String memberId) {
        families.get(familyId).removeColonist(memberId);
        if (families.get(familyId).familySize() == 0) {
            this.removeFamily(familyId);
        }
    }

    public void removeFamily(String id) {
        families.remove(id);
    }

    public List<Colonist> getColonistsByFamilyId(String familyId) {
        return families.get(familyId).getColonists();
    }

    public void grow(int years) {
        for (Family family : families.values()) {
            family.getColonists().stream().forEach(colonist -> colonist.grow(years));
        }
    }

    public int getPotential() {
        int ttlPotencial = 0;
        for (Family family : families.values()) {
            ttlPotencial += family.getColonists().stream().mapToInt(Colonist::getPotential).sum();
        }
        return ttlPotencial;
    }

    public String getCapacity() {

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("families: %d/%d",families.values().size(),this.maxFamilyCount));
        this.families
                .values()
                .stream()
                .sorted(Comparator.comparing(Family::getId))
                .forEach(family -> sb.append(System.lineSeparator())
                        .append(String.format("-%s: %d/%d"
                                ,family.getId()
                                ,family.getColonists().size()
                                ,this.maxFamilyCapacity)));


        return sb.toString();
    }



}
