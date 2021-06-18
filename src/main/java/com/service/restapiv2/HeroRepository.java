package com.service.restapiv2;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "hero", path = "hero")
public interface  HeroRepository extends PagingAndSortingRepository<Hero, Integer> {
    List<Hero> findById(@Param("id") int id);
}