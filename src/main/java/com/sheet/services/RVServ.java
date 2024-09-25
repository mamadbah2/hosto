package com.sheet.services;

import java.util.List;

import com.sheet.data.entities.RV;
import com.sheet.data.repository.RVInterf;

public class RVServ {
    private RVInterf rvRepo;

    public RVServ(RVInterf rvRepo) {
        this.rvRepo = rvRepo;
    }

    public void SaveRV(RV rv) {
        rvRepo.set(rv);
    }

    public List<RV> ListRV() {
        return rvRepo.getAllRV();
    }

    public List<RV> ListRVByDate(String date) {
        return rvRepo.getAllRVByDate(date);
    }
    
}
