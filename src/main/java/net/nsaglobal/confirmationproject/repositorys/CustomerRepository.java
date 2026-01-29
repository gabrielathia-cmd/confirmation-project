package net.nsaglobal.confirmationproject.repositorys;

import net.nsaglobal.confirmationproject.entitys.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import net.nsaglobal.confirmationproject.entitys.EntidadeTeste;

public interface CustomerRepository extends JpaRepository<Customers, Long>{

}