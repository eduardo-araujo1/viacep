package com.eduardo.viacep.controller;

import com.eduardo.viacep.dto.ViaCepRequest;
import com.eduardo.viacep.dto.ViaCepResponse;
import com.eduardo.viacep.service.ViaCepService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/endereco")
public class ViaCepController {

    private final ViaCepService service;

    @GetMapping("/consulta")
    public ResponseEntity consultaCep(@RequestBody ViaCepRequest viaCepRequest){
        return ResponseEntity.ok(service.buscaCep(viaCepRequest));
    }
}
