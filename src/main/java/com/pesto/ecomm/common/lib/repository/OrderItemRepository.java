package com.pesto.ecomm.common.lib.repository;

import com.pesto.ecomm.common.lib.entity.OrderItem;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository  extends JpaRepository<OrderItem, String> {

    Page<OrderItem> findAllBySeller_UserId(String sellerId, Pageable pageable);


}
