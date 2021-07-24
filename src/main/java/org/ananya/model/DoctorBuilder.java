package org.ananya.model;

import java.util.List;

public class DoctorBuilder {

    private String name;
    private double experience;
    private List<String> specializations;
    private double fees;

    public DoctorBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public DoctorBuilder setExperience(double experience) {
        this.experience = experience;
        return this;
    }

    public DoctorBuilder setSpecializations(List<String> specializations) {
        this.specializations = specializations;
        return this;
    }

    public DoctorBuilder setFees(double fees) {
        this.fees = fees;
        return this;
    }

    public Doctor createDoctor() {
        return new Doctor(name, experience, specializations, fees);
    }
}
