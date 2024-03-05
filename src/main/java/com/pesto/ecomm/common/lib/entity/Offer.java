package com.pesto.ecomm.common.lib.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.springframework.data.annotation.Version;

import java.util.UUID;

@Getter
@Setter
@Table(name = "offer")
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Offer {

    @Id
    @Column(name = "offer_id", columnDefinition = "uniqueidentifier")
    private volatile String offerId = String.valueOf(UUID.randomUUID());

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "seller_id")
    private User seller;

    @Column(name = "price")
    private Double price;

    @Column(name = "quantity_available")
    private Integer quantityAvailable;

    @Column(name = "entity_version")
    @Version
    private Long entityVersion;

}
