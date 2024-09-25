package com.sheet.core.factory;

import com.sheet.data.repository.MedecinInterf;
import com.sheet.data.repository.RVInterf;
import com.sheet.data.repository.db.implement.RVRepo;
import com.sheet.services.MedecinServ;
import com.sheet.services.RVServ;

public class FactoryServ {
     private MedecinServ medecinServ;
    private RVServ rvServ;

    public FactoryServ() {
    }

    public MedecinServ getInstanceOfMedicinServ(MedecinInterf medecinRepo) {
        if (medecinServ == null) {
            medecinServ = new medecinServ(medecinRepo);
        }
        return medecinServ;
    }

    public RVServ getInstanceOfRVServ(RVInterf rvRepo) {
        if (rvServ == null) {
            rvServ = new RVServ(rvRepo);
        }
        return rvServ;
    }
}
