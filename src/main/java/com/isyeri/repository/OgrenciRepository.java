package com.isyeri.repository;

import com.isyeri.dto.OgrenciDto;
import com.isyeri.entity.Ogrenci;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(collectionResourceRel = "ogrenciler",path = "ogrenciler")
@CrossOrigin
public interface OgrenciRepository extends JpaRepository<Ogrenci,Long> {

    Ogrenci save(Ogrenci ogrenci);
    Ogrenci findOgrenciByEposta(String eposta);

}
