package com.pesto.ecomm.common.lib.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pesto.ecomm.common.lib.enums.OrderStatus;
import com.pesto.ecomm.common.lib.enums.ShippingStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Table(name = "order_item")
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OrderItem {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_item_id", length = 36)
    private volatile String orderItemId = UUID.randomUUID().toString();

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    @JoinColumn(name = "seller_id")
    private User seller;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "offer_id")
    private Offer offer;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "price")
    private Double price;

    @Column(name = "shipping_status")
    @Enumerated(EnumType.STRING)
    private ShippingStatus shippingStatus;

}
