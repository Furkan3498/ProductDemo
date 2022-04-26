package com.example.productdemo.dto;

import com.example.productdemo.entity.Adres;
import com.sun.istack.NotNull;
import lombok.*;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(of = {"id"})
public class KisiDto {
    private Long id;
    @NotNull
    private String adi;
    private String soyadi;
    private List<String> adresler;

}
