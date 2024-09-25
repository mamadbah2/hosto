package com.sheet.core.repository.implement;

import com.sheet.core.database.implement.DatabaseImpl;
import com.sheet.core.repository.Repository;

public abstract class  RepositoryImpl<T> extends DatabaseImpl implements Repository<T> {
    private RepositoryImpl() {
        super();
    }
}
