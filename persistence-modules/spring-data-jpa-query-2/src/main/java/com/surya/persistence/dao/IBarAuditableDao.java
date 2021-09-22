package com.surya.persistence.dao;

import com.surya.persistence.dao.common.IAuditOperations;
import com.surya.persistence.model.Bar;

public interface IBarAuditableDao extends IBarDao, IAuditOperations<Bar> {
    //
}
