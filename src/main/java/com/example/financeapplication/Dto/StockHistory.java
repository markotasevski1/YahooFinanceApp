package com.example.financeapplication.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
@Data
@AllArgsConstructor
public class StockHistory {
    private String symbol;
    private String date;
    private BigDecimal high;
    private BigDecimal low;
    private BigDecimal close;
}
