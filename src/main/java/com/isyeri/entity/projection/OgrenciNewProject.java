package com.isyeri.entity.projection;

import com.isyeri.entity.Ogrenci;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "ogrencitest", types = Ogrenci.class)
public class OgrenciNewProject {
    String ad(){return "turanaaaa";}
}
