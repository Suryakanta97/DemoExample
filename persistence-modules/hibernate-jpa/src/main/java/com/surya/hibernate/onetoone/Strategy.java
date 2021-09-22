package com.surya.hibernate.onetoone;


import java.util.Arrays;
import java.util.List;

public enum Strategy {
    //See that the classes belongs to different packages
    FOREIGN_KEY(Arrays.asList(com.surya.hibernate.onetoone.foreignkeybased.User.class,
            com.surya.hibernate.onetoone.foreignkeybased.Address.class)),
    SHARED_PRIMARY_KEY(Arrays.asList(com.surya.hibernate.onetoone.sharedkeybased.User.class,
            com.surya.hibernate.onetoone.sharedkeybased.Address.class)),
    JOIN_TABLE_BASED(Arrays.asList(com.surya.hibernate.onetoone.jointablebased.Employee.class,
            com.surya.hibernate.onetoone.jointablebased.WorkStation.class));

    private List<Class<?>> entityClasses;

    Strategy(List<Class<?>> entityClasses) {
        this.entityClasses = entityClasses;
    }

    public List<Class<?>> getEntityClasses() {
        return entityClasses;
    }
}
