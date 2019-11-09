package com.developerjang.til.infra.repository;

import com.developerjang.til.entity.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company, String> {
}
