package com.product.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.model.Account;
import com.product.model.AccountPk;

@Repository
public interface ProductRepository extends JpaRepository<Account, AccountPk>{

}
