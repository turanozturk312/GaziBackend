package com.isyeri;

import com.isyeri.entity.Firma;
import com.isyeri.entity.Ogrenci;
import com.isyeri.repository.OgrenciRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DatabaseLoader {

    private final OgrenciRepository ogrenciRepository;

    @PostConstruct
    public void load(){

    }

    public void createOgrenci(){
        /*
        for(int i = 1; i <= 20; i++){
            Ogrenci ogrenci = new Ogrenci(
                    "Ogrenci",
                    Integer.toString(i),
                    "123456",
                    Integer.toString(i),
                    "ogrenci_mail_"+i+"@gazi.edu.tr"
            );
            ogrenciRepository.save(ogrenci);
        }

         */
    }

    public void createFirma(){
        for(int i = 1; i <= 20; i++){
            /*Firma firma = new Firma(
                    "Firma " + i,
                    "yetkili@firma.com.tr"
            );
            firmaRepository.save(firma);

             */
        }
    }

}
