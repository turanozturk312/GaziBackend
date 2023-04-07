package com.isyeri.entity.projection;

import com.isyeri.entity.Ogrenci;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "ogrenciNameSurname", types = { Ogrenci.class })
public interface OgrenciNameSurname {
    String getAd();
    String getSoyad();
}
