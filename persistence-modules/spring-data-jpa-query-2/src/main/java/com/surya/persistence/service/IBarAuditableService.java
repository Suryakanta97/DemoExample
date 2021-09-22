package com.surya.persistence.service;

import com.surya.persistence.dao.common.IAuditOperations;
import com.surya.persistence.model.Bar;

public interface IBarAuditableService extends IBarService, IAuditOperations<Bar> {

}
