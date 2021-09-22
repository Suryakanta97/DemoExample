package com.surya.schemageneration.repository;

import com.surya.schemageneration.model.AccountSetting;
import org.springframework.data.repository.CrudRepository;

public interface AccountSettingRepository extends CrudRepository<AccountSetting, Long> {
    AccountSetting findByAccountId(Long accountId);
}
