package com.isyeri.repository;

import com.isyeri.entity.Firma;
import com.isyeri.entity.Ogrenci;
import lombok.RequiredArgsConstructor;
import org.springframework.data.rest.core.annotation.*;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
@RepositoryEventHandler(Firma.class)
public class FirmaEventHandler {
    @HandleBeforeCreate
    public void handleBeforeCreate(Firma firma){
        System.out.println(firma);
    }

    @HandleBeforeSave
    public void handleBeforeSave(Firma firma){
        System.out.println(firma);
    }

}
