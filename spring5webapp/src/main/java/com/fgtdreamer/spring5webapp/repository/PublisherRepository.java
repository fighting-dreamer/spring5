package com.fgtdreamer.spring5webapp.repository;

import com.fgtdreamer.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
