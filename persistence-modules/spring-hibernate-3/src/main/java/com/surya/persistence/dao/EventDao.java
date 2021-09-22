package com.surya.persistence.dao;


import com.surya.persistence.model.Event;
import org.springframework.stereotype.Repository;

@Repository
public class EventDao extends AbstractHibernateDao<Event> implements IEventDao {

    public EventDao() {
        super();

        setClazz(Event.class);
    }

    // API

}
