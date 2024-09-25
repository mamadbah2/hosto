package com.sheet.core.repository;

import java.sql.ResultSet;

public interface Repository<T> {
    public int set(T data);
    public T convertToObject(ResultSet rs);
} 
