package com.isyeri.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "ogrenciler")
public class Ogrenci {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ad;

    private String soyad;

    private String eposta;

    @Column(name = "ogrenci_numarasi")
    private String ogrenciNumarasi;

    private String tckn;

    private String gsm;

    @Column(name = "akademik_birim")
    @FieldNameConstants.Exclude
    private String akademikBirim;

    private String bolum;

    private String parola;

    private String ikametgah;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "firma_id")
    private Firma isyeriEgitimFirma;

    @OneToOne
    @JoinColumn(name = "form_bir_id")
    private FormBir form1Data;

}
