package org.ananya.model;

public class DataBase {

    private DoctorContainer doctorContainer;

    public DataBase(){
        this.doctorContainer = new DoctorContainer();
    }


    public DoctorContainer getDoctorContainer(){
        return this.doctorContainer;
    }
}
