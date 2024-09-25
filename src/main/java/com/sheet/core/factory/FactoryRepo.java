package com.sheet.core.factory;

import com.sheet.data.repository.MedecinInterf;
import com.sheet.data.repository.RVInterf;
import com.sheet.data.repository.db.implement.MedecinRepo;
import com.sheet.data.repository.db.implement.RVRepo;

public class FactoryRepo {
    private MedecinInterf medecinRepo;
    private RVInterf rvRepo;

    public FactoryRepo() {
    }

    public MedecinInterf getInstanceOfMedicinRepo() {
        if (medecinRepo == null) {
            medecinRepo = new MedecinRepo();
        }
        return medecinRepo;
    }

    public RVInterf getInstanceOfRVRepo() {
        if (rvRepo == null) {
            rvRepo = new RVRepo();
        }
        return rvRepo;
    }

}

