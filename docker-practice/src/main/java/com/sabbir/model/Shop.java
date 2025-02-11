package com.sabbir.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Shop {
    private Integer shopId;
    private String shopName;
    private String category;
}
