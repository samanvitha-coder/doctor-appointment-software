package org.ananya.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class DoctorContainer {

    private Map<String, Doctor> doctors;

    public DoctorContainer(){
        this.doctors = new HashMap<String, Doctor>();
    }

    public boolean addDoctor(Doctor doctor){
        doctors.put(doctor.getId(), doctor);
        System.out.println(doctor);
        return true;
    }

    public Collection<Doctor> listAllDoctors(){
        return doctors.values();
    }

}