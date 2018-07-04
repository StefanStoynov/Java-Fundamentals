package Exam1;

import java.util.HashMap;
import java.util.Map;

public class HealthManager {
    private Map<String, Organism> organisms;

    public HealthManager() {
        this.organisms = new HashMap<>();
    }

    public Map<String, Organism> getOrganisms() {
        return this.organisms;
    }

    public String checkCondition(String organismName) {
        return "";
    }

    public String createOrganism(String name) {

        Organism organism = new Organism(name);
        if (this.organisms.containsKey(name)) {
            return String.format("Organism %s already exists", name);
        } else {
            organisms.put(name, organism);
            return String.format("Created organism %s", name);
        }
    }

    public String addCluster(String organismName, String id, int rows, int cols) {
        String addCluster = "";
        if (!organisms.get(organismName).getClusters().containsKey(id)) {
            organisms.get(organismName).addCluster(new Cluster(id, rows, cols), id);
            return String.format("Organism %s: Created cluster %s", organismName, id);
        }
        return addCluster;

    }

    public String addCell(String organismName, String clusterId,
    String cellType, String cellId, int health, int positionRow, int positionCol, int additionalProperty){

        switch (cellType){
            case"WhiteBloodCell":
                organisms.get(organismName).getClusters().get(clusterId).
                        addCells(new WhiteBloodCell(cellId,health,positionRow,positionCol,additionalProperty));
                break;
            case "RedBloodCell":
                organisms.get(organismName).getClusters().get(clusterId).
                        addCells(new RedBloodCell(cellId,health,positionRow,positionCol,additionalProperty));
                break;
            case "Virus":
                organisms.get(organismName).getClusters().get(clusterId).
                        addCells(new Virus(cellId,health,positionRow,positionCol,additionalProperty));
                break;
            case "Bacteria":
                organisms.get(organismName).getClusters().get(clusterId).
                        addCells(new Bacteria(cellId,health,positionRow,positionCol,additionalProperty));
                break;
            case "Fungi":
                organisms.get(organismName).getClusters().get(clusterId).
                        addCells(new Fungi(cellId,health,positionRow,positionCol,additionalProperty));
                break;

        }
        return String.format(super.toString());
        //return String.format("Organism %s: Created cell %s in cluster %s",organismName,cellId,clusterId);
    }

    public String activateCluster(String organismName){
        organisms.get(organismName).getClusters();
        return "";
    }

}
