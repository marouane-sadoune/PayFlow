package ma.supmti.payflow.repositories;

import ma.supmti.payflow.entities.BankAccount;
import ma.supmti.payflow.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
	List<BankAccount> findByCustomerId(Long customerId);
	BankAccount findByIdAndCustomerId(String id, Long customerId);
	List<BankAccount> findByCustomer(Customer customer);
}
