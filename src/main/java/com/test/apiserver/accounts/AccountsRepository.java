package com.test.apiserver.accounts;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path="/accounts")
public interface AccountsRepository extends JpaRepository<Accounts, Long>{
	Optional<Accounts> findByUserName(String username);
}