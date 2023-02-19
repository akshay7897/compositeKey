package com.product;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.product.Repository.ProductRepository;
import com.product.model.Account;
import com.product.model.AccountPk;

@SpringBootApplication
public class ProductServiceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ProductServiceApplication.class, args);
	
		ProductRepository productRepo = context.getBean(ProductRepository.class);
		
		// inserting record for composite key 
		
		
		/*
		 * AccountPk accountPk=new AccountPk(222, "2012852852", "current");
		 * 
		 * Account account = new Account();
		 * account.setAccountHolderName("shubham Patil"); 
		 * account.setBalance(80000);
		 * account.setCity("pune"); 
		 * account.setAccountPk(accountPk);
		 * 
		 * productRepo.save(account);
		 */
		
		// fetching records of composite key
		
		AccountPk accountPk=new AccountPk(222, "2012852852", "current");
		Optional<Account> findById = productRepo.findById(accountPk);
		System.out.println(findById.get());
	
	}

}
