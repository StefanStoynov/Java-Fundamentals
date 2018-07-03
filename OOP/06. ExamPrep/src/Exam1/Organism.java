package Exam1;


import java.util.HashMap;
import java.util.Map;


public class Organism {
    private String name;
    private Map<String,Cluster> clusters;

    public Organism(String name) {
        this.name = name;
        this.clusters = new HashMap<>();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getName() {
        return this.name;
    }

    public void addCluster(Cluster cluster,String id){
        this.clusters.put(id,cluster);
    }

    public Map<String, Cluster> getClusters() {
        return this.clusters;
    }
}
