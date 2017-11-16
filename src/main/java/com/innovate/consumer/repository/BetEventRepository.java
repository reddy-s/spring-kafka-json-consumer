package com.innovate.consumer.repository;

import com.innovate.consumer.entity.BetEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by reddys on 16/11/2017.
 */
@Repository
public interface BetEventRepository extends JpaRepository<BetEvent, Long> {

}
