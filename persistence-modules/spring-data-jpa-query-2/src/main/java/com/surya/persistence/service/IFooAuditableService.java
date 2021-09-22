package com.surya.persistence.service;

import com.surya.persistence.dao.common.IAuditOperations;
import com.surya.persistence.model.Foo;

public interface IFooAuditableService extends IFooService, IAuditOperations<Foo> {
    //
}
