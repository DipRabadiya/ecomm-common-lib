package com.pesto.ecomm.common.lib.entity;


import com.pesto.ecomm.common.lib.enums.OrderStatus;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.codehaus.jackson.annotate.JsonIgnore;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Table(name = "orders")
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Order {

    @Id
    @Column(name = "order_id", columnDefinition = "uniqueidentifier")
    private volatile String orderId = String.valueOf(UUID.randomUUID());

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    @JoinColumn(name = "buyer_id")
    private User buyer;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    @Column(name = "order_date")
    private Date orderDate;

    @Column(name = "total_price")
    private Double totalPrice;

    @OneToMany(mappedBy = "order", cascade = {CascadeType.DETACH, CascadeType.MERGE,  CascadeType.PERSIST}, fetch = FetchType.LAZY)
    private List<OrderItem> orderItems;

}
