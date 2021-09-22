package com.surya.themes.repository;

import com.surya.themes.domain.UserPreference;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserPreferenceRepository extends PagingAndSortingRepository<UserPreference, String> {
}
