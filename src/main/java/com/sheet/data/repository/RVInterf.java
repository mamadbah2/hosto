package com.sheet.data.repository;

import java.util.List;

import com.sheet.core.repository.Repository;
import com.sheet.data.entities.RV;

public interface RVInterf extends Repository<RV> {
    public List<RV> getAllRV();
    public List<RV> getAllRVByDate(String date);
}
