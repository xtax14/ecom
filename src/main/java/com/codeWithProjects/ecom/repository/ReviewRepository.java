package com.codeWithProjects.ecom.repository;

import com.codeWithProjects.ecom.entity.FAQ;
import com.codeWithProjects.ecom.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {

    List<Review> findAllByProductId(Long productsId);
}
