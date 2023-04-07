package com.isyeri.service;

import com.isyeri.dto.OgrenciDto;
import com.isyeri.repository.OgrenciRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OgrenciService {

    private final OgrenciRepository ogrenciRepository;

    public OgrenciDto getOgrenci (){
        return null;
    }

}
