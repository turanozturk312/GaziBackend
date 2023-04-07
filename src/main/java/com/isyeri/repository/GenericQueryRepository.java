package com.isyeri.repository;

import com.isyeri.controller.GenericQuery;
import com.isyeri.dto.OgrenciDto;
import com.isyeri.entity.Firma;
import com.isyeri.entity.Ogrenci;
import jakarta.persistence.MapKeyClass;
import net.minidev.json.JSONObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.Mapping;

import java.util.Collection;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "sorgular",path = "sorgular")
@CrossOrigin
public interface GenericQueryRepository extends JpaRepository<GenericQuery,Long> {

    GenericQuery findByQueryName(String queryName);

    @Query(value = "SELECT * from ogrenciler o LEFT JOIN firmalar f on o.firma_id = f.id ", nativeQuery = true)
    JSONObject getForm1Data();

}
