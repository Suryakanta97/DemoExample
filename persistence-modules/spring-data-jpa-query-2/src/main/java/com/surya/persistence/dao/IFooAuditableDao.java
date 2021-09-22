package com.surya.persistence.dao;

import com.surya.persistence.dao.common.IAuditOperations;
import com.surya.persistence.model.Foo;

public interface IFooAuditableDao extends IFooDao, IAuditOperations<Foo> {
    //
}