package com.lambdaschool.piggybanktwo.controller;

import com.lambdaschool.piggybanktwo.models.Coin;
import com.lambdaschool.piggybanktwo.repositories.CoinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CoinController
{
    @Autowired
    CoinRepository coinrepos;

    @GetMapping(value = "/total", produces = "application/json")
    public ResponseEntity<?> getTotal()
    {
        List<Coin> myList = new ArrayList<>();
        coinrepos.findAll().iterator().forEachRemaining(myList::add);
        double sumCoin = 0;
        for (Coin c : myList)
        {
            sumCoin += c.getQuantity() * c.getValue();
            if(c.getQuantity() > 1)
            {
                System.out.println(c.getQuantity() + " " + c.getNameplural());
            } else
            {
                System.out.println(c.getQuantity() + " " + c.getName());
            }
        }
        System.out.println("The piggy bank holds " + sumCoin);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
