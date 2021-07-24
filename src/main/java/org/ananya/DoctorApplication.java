package org.ananya;

import org.ananya.model.DataBase;
import org.ananya.service.MenuProcessor;
import org.ananya.utils.MenuProcessorFactory;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DoctorApplication {

    private DataBase dataBase;
    private MenuProcessorFactory menuProcessorFactory;
    private Set<Integer> allowedMenuOptions;

    public DoctorApplication(){
        this.dataBase = new DataBase();
        this.menuProcessorFactory = new MenuProcessorFactory();

        this.allowedMenuOptions = new HashSet<Integer>();
        this.allowedMenuOptions.addAll(Arrays.asList(1,2,1000));
    }

    public static void main(String[] args) {

        DoctorApplication application = new DoctorApplication();
        application.startApplication();

    }

    private void startApplication(){
        Scanner scanner = new Scanner(System.in);

        while(true) {

            System.out.println("\n\n************************ Doctor Application *****************************");
            System.out.println("ENTER 1 - FOR ADDING A DOCTOR \nENTER 2 - LISTING ALL DOCTORS\n" +
                    "ENTER 1000 - TO EXIT THE APPLICATION");

            final int menuOption = scanner.nextInt();
            if(!validate(menuOption)){
                System.out.println("Please follow the instructions of menu options. Your option:"+menuOption + " is not valid.");
                continue;
            }

            if(menuOption == 1000){
                break;
            }

            processMenuOption(menuOption, scanner);
        }
    }

    private boolean validate(int menuOption){
        return this.allowedMenuOptions.contains(menuOption);
    }

    private void processMenuOption(int menuOption, Scanner scanner){
        final MenuProcessor menuProcessor = this.menuProcessorFactory.fetchMenuProcessors(menuOption);
        menuProcessor.processMenu(scanner, this.dataBase);
    }

}
