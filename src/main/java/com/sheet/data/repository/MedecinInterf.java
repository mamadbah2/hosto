package com.sheet.data.repository;

import com.sheet.core.repository.Repository;
import com.sheet.data.entities.Medecin;

public interface MedecinInterf extends Repository<Medecin> {
    public Medecin getMedecinById(int id);
}
