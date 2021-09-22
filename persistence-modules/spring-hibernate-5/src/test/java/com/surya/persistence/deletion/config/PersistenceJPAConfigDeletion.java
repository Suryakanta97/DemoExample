package com.surya.persistence.deletion.config;

import com.surya.spring.PersistenceJPAConfigL2Cache;

public class PersistenceJPAConfigDeletion extends PersistenceJPAConfigL2Cache {

    public PersistenceJPAConfigDeletion() {
        super();
    }

    @Override
    protected String[] getPackagesToScan() {
        return new String[] { "com.surya.persistence.deletion.model", "com.surya.persistence.model" };
    }
}