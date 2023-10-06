package com.apiRest.apiRest.application;

import com.apiRest.apiRest.domain.OfertaEmpleo;
import com.apiRest.apiRest.domain.OfertasRepository;

import java.util.List;

public class OfertasUseCases {
    private OfertasRepository ofertasRepository;
    public OfertasUseCases(OfertasRepository ofertasRepository){
        this.ofertasRepository=ofertasRepository;
    }
    public List<OfertaEmpleo> getAll(){
        return this.ofertasRepository.getAll();
    }
    public OfertaEmpleo getOfertaTitulo(String titulo){
        return this.ofertasRepository.getOfertaTitulo(titulo);
    }
    public OfertaEmpleo getOfertaNumero(Integer numero){
        return this.ofertasRepository.getOfertaNumero(numero);
    }
}
