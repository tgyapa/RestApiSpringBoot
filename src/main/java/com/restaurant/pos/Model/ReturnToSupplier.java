package com.restaurant.pos.Model;

import javax.persistence.*;

@Entity
@Table(name = "return_to_supplier")
public class ReturnToSupplier {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String dateReturn;

    private Integer supplierId;


}
