package mum.swe.CRMSSpringApp.repository;

import mum.swe.CRMSSpringApp.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
