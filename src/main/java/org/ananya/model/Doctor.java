package org.ananya.model;

import java.util.List;
import java.util.UUID;

public class Doctor {

    private String id;

    private String name;
    private double experience;

    //Specializations => Optimetry , ENT
    private List<String> specializations;
    private double fees;

    public Doctor(String name, double experience, List<String> specializations, double fees) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.experience = experience;
        this.specializations = specializations;
        this.fees = fees;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getExperience() {
        return experience;
    }

    public List<String> getSpecializations() {
        return specializations;
    }

    public double getFees() {
        return fees;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", experience=" + experience +
                ", specializations=" + specializations +
                ", fees=" + fees +
                '}';
    }
}