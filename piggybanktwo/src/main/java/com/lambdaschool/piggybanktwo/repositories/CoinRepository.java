package com.lambdaschool.piggybanktwo.repositories;

import com.lambdaschool.piggybanktwo.models.Coin;
import org.springframework.data.repository.CrudRepository;

public interface CoinRepository extends CrudRepository<Coin, Long>
{
}
