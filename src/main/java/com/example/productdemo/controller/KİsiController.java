package com.example.productdemo.controller;

import com.example.productdemo.dto.KisiDto;
import com.example.productdemo.service.KisiService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kisi")
@RequiredArgsConstructor
public class KİsiController {

    private final KisiService kisiService;


    @PostMapping
    public ResponseEntity<KisiDto> kaydet(@Validated @RequestBody KisiDto kisiDto){
        return ResponseEntity.ok(kisiService.save(kisiDto));
    }
    @GetMapping
    public ResponseEntity<List<KisiDto>> tumunuListele(){
        return ResponseEntity.ok(kisiService.getAll());
    }
}
