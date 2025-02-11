package com.sabbir.controller;

import com.sabbir.model.Shop;
import com.sabbir.service.ShopService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shop")
public class ShopController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ShopController.class);
    private final ShopService shopService;

    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @GetMapping
    public ResponseEntity<?> getAllShopData(){
        LOGGER.info("API called - getAllShopData" + shopService.getAllShop());
        return new ResponseEntity<>(shopService.getAllShop(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<?> saveShopData(@RequestBody Shop shop){
        LOGGER.info("API called - saveNewShopData()" + shop);
        shopService.addNewShop(shop);
        return new ResponseEntity<>("Added", HttpStatus.CREATED);
    }
}
