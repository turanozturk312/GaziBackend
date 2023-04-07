package com.isyeri.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.NonNull;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "isverenler")
public class Isveren {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "isveren_adi")
    private String isverenAd;

    @Column(name = "isveren_soyadi")
    private String isverenSoyad;

    @Column(name = "isveren_gorev")
    private String isverenGorev;

    @Column(name = "isveren_eposta")
    private String isverenEposta;

    @Column(name = "isveren_sgk_tescil")
    private String isverenSgkTescil;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "firma_id")
    private Firma isverenFirma;


}
