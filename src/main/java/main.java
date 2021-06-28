import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class main {
    int id;
    char name;
    int regiDate;
    int split;
    char part;
    int numOfSets;
    int reps;
    int weight;
    char exercise;

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRegiDate() {
        return regiDate;
    }

    public void setRegiDate(int regiDate) {
        this.regiDate = regiDate;
    }

    public int getSplit() {
        return split;
    }

    public void setSplit(int split) {
        this.split = split;
    }

    public char getPart() {
        return part;
    }

    public void setPart(char part) {
        this.part = part;
    }

    public int getNumOfSets() {
        return numOfSets;
    }

    public void setNumOfSets(int numOfSets) {
        this.numOfSets = numOfSets;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public char getExercise() {
        return exercise;
    }

    public void setExercise(char exercise) {
        this.exercise = exercise;
    }




}
