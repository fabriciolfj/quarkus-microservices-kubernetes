package com.github.fabriciolfj.entity;

import com.github.fabriciolfj.entity.enuns.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

    private String code;
    private String name;
    private BigDecimal price;
    private Status status;
}
