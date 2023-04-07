package com.isyeri.repository;

import com.isyeri.entity.Ogrenci;
import lombok.RequiredArgsConstructor;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
@RepositoryEventHandler(Ogrenci.class)
public class OgrenciEventHandler {





}
