package com.joh.epl.repository;

import com.joh.hooligans.entity.EplClub;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface EplClubRepository extends ReactiveCrudRepository<EplClub, Long> {

}
