public class DataManage {
    private long id;
    private String name;
    private String regiDate;
    //private String split;
    private String part;
    private long numOfSets;
    private long reps;
    private long weight;
    private String exercise;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegiDate() {
        return regiDate;
    }

    public void setRegiDate(String regiDate) {
        this.regiDate = regiDate;
    }

    /*public String getSplit() {
        return split;
    }

    public void setSplit(String split) {
        this.split = split;
    }*/

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public long getNumOfSets() {
        return numOfSets;
    }

    public void setNumOfSets(long numOfSets) {
        this.numOfSets = numOfSets;
    }

    public long getReps() {
        return reps;
    }

    public void setReps(long reps) {
        this.reps = reps;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }

    public DataManage() {

    }

    public DataManage( long id, String regiDate, String name, String part,String exercise, long numOfSets, long reps,
            long weight){
        super();
        this.id = id;
        this.name = name;
        this. regiDate = regiDate;
        //this.split = split;
        this.part = part;
        this.numOfSets = numOfSets;
        this.reps = reps;
        this.weight = weight;
        this.exercise = exercise;
    }

    @Override
    public String toString() {
        return "Schedule [ID="+id+", Date="+regiDate +", Name="+name+", Part="+part
                +", exercise="+exercise +", Sets="+numOfSets+", reps="+reps+", Weight="+weight+"kg]";
    }

}
