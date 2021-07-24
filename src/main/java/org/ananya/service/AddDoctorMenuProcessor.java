package org.ananya.service;

import org.ananya.model.DataBase;
import org.ananya.model.Doctor;
import org.ananya.model.DoctorBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddDoctorMenuProcessor implements MenuProcessor {

    public void processMenu(Scanner scanner, DataBase dataBase) {
        System.out.println("\n*********************** We will be adding doctor information ************************");
        System.out.println("Insert doctor's name :");
        String name = scanner.next()+ scanner.nextLine();

        System.out.print("Insert "+ name + "'s experience in years:");
        final double experience = scanner.nextDouble();

        System.out.print("\nInsert "+name+"'s fees in rupees:");
        final double fees = scanner.nextDouble();

        System.out.print("\nInsert number of Specialization of Dr. "+name+ ":");
        final int numberOfSpecialization = scanner.nextInt();

        List<String> specializations = new ArrayList<String>();
        for(int i =0 ; i < numberOfSpecialization ; i++){
            System.out.print("\nInsert Specialization -" +(i+1) + ":");
            specializations.add((scanner.next() + scanner.nextLine()).trim());
        }

        final Doctor doctor = new DoctorBuilder().setName(name)
                .setExperience(experience).setFees(fees).setSpecializations(specializations).createDoctor();
        dataBase.getDoctorContainer().addDoctor(doctor);

    }
}