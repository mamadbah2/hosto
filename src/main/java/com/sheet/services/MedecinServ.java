package com.sheet.services;


import com.sheet.data.entities.Medecin;
import com.sheet.data.repository.MedecinInterf;

public class MedecinServ {
    private MedecinInterf medecinRepo;

    public MedecinServ(MedecinInterf medecinRepo) {
        this.medecinRepo = medecinRepo;
    }

    public Medecin showMedecin(int id) {
        return medecinRepo.getMedecinById(id);
    }

    
}
