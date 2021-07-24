package org.ananya.service;

import org.ananya.model.DataBase;
import org.ananya.model.Doctor;

import java.util.Collection;
import java.util.Scanner;

public class ListDoctorsMenuProcessor implements MenuProcessor {

    public void processMenu(Scanner scanner, DataBase dataBase) {
        System.out.println("****************** Listing all doctors in the platform ********************\n");

        final Collection<Doctor> doctors = dataBase.getDoctorContainer().listAllDoctors();
        if (doctors.size() == 0) {
            System.out.println("SORRY : NO DOCTORS ARE ADDED TO THE PLATFORM YET\n");
        } else {
            for (Doctor doctor : doctors) {
                System.out.println(doctor + "\n");
            }
        }


        System.out.println("**************** This ends the list of doctors *******************************");
    }
}
