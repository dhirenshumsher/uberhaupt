package com.dhirenshumsher.uberhaupt.repository;

import com.dhirenshumsher.uberhaupt.domain.PersistentToken;
import com.dhirenshumsher.uberhaupt.domain.User;
import java.time.LocalDate;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Spring Data MongoDB repository for the PersistentToken entity.
 */
public interface PersistentTokenRepository extends MongoRepository<PersistentToken, String> {

    List<PersistentToken> findByUser(User user);

    List<PersistentToken> findByTokenDateBefore(LocalDate localDate);

}