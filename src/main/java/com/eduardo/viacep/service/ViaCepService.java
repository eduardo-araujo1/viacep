package com.eduardo.viacep.service;

import com.eduardo.viacep.client.ViaCepClient;
import com.eduardo.viacep.dto.ViaCepRequest;
import com.eduardo.viacep.dto.ViaCepResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ViaCepService {

    private final ViaCepClient viaCepClient;

    public ViaCepResponse buscaCep(ViaCepRequest request){
        return viaCepClient.getCep(request.getCep());
    }

}
