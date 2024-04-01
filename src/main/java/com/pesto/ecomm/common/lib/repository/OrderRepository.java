package com.pesto.ecomm.common.lib.repository;

import com.pesto.ecomm.common.lib.entity.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, String> {

    Page<Order> findByBuyer_UserId(String buyerId, Pageable pageable);

    Order findByOrderIdAndBuyer_UserId(String orderId, String userId);

}
