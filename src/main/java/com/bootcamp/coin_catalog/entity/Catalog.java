package com.bootcamp.coin_catalog.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document
public class Catalog {
    @Id
    private String id;
    //Moneda al que se va cambiar
    private String currencyName;
    //Moneda origen
    private String currencyReference;
    private Double amountBuy;
    private Double amountSale;
    @CreatedDate
    //@DateTimeFormat(pattern = "yyyy-mm-dd")
    private LocalDate createDate;
}
