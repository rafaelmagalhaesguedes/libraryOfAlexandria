package com.betrybe.alexandria.repository;

import com.betrybe.alexandria.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface Publisher repository.
 */
@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Long> {

}
