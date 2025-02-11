package com.sabbir.service;

import com.sabbir.model.Shop;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShopService {
    private List<Shop> shopList;
    public ShopService(){
        shopList = new ArrayList<>();
        shopList.add(new Shop(101, "best-deal", "departmental shop"));
        shopList.add(new Shop(102, "daraz", "online shop"));
        shopList.add(new Shop(103, "rokomari", "ecommerce shop"));
    }

    public List<Shop> getAllShop(){
        return shopList;
    }

    public void addNewShop(Shop shop){
        shopList.add(shop);
    }
}
