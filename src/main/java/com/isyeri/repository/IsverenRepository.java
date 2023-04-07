package com.isyeri.repository;

import com.isyeri.entity.Isveren;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(collectionResourceRel = "isverenler",path = "isverenler")
@CrossOrigin
public interface IsverenRepository extends JpaRepository<Isveren,Long> {

    Isveren save(Isveren isveren);

}
