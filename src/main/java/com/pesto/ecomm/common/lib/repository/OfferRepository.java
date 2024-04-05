package com.pesto.ecomm.common.lib.repository;

import com.pesto.ecomm.common.lib.entity.Offer;
import com.pesto.ecomm.common.lib.entity.Product;
import com.pesto.ecomm.common.lib.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OfferRepository extends JpaRepository<Offer, String> {

    Page<Offer> findBySeller_UserIdEqualsOrderByProduct(String sellerId, Pageable pageable);

    List<Offer> findByProduct_ProductId(String productId);
    @Query("select * from Offer  where seller=:seller and product=:product")
    Offer findBySeller_UserIdAndProduct_ProductId(User seller, Product product);

}
