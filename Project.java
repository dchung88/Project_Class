class Project {
    private String name;
    private String description;
    private Double initialCost;

    public Project(){
        // this("John Doe", "Annonymous");
    }
    public Project(String name) {
        this.name = name;
    }
    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public Project(String name, String description, Double cost) {
        this.name = name;
        this.description = description;
        initialCost = cost;
    }
    public String elevatorPitch(){
        return this.name + "(" + "$" + Double.toString(getInitialCost()) + ")" + " : " + this.description;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Double getInitialCost() {
        return initialCost;
    }
    public void setInitialCost(Double cost) {
        initialCost = cost;
    }
}