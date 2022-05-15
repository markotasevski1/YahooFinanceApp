package com.example.financeapplication.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class StockDto {
    private String name;
    private BigDecimal price;
    private BigDecimal change;
    private String currency;
    private BigDecimal bid;
    private BigDecimal priceHint;
    private String stockName;
}
