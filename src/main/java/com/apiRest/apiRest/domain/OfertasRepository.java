package com.apiRest.apiRest.domain;

import java.util.List;

public interface OfertasRepository {
    public List<OfertaEmpleo> getAll();
    public OfertaEmpleo getOfertaTitulo(String titulo);
    public OfertaEmpleo getOfertaNumero(Integer numero);
}
