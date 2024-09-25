package com.sheet;

import java.util.Scanner;

import com.sheet.core.factory.FactoryRepo;
import com.sheet.core.factory.FactoryServ;
import com.sheet.services.MedecinServ;
import com.sheet.services.RVServ;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Design Pattern: Factory ----------------------------------------------
        FactoryRepo factoryRepo = new FactoryRepo();
        FactoryServ factoryServ = new FactoryServ();

        // ----------------------------------------------------------------------
        // ClientServ clientServ = factory.getInstanceOfClientServ();
        MedecinServ userServ = factoryServ.getInstanceOfMedicinServ(factoryRepo.getInstanceOfMedicinRepo());
        RVServ rvServ = factoryServ.getInstanceOfRVServ(factoryRepo.getInstanceOfRVRepo());

        int choice;
        do {
            choice = showMenu(scanner);
            switch (choice) {
                default -> System.out.println("Choix invalide");
            }

        } while (choice != 10);
    }
}