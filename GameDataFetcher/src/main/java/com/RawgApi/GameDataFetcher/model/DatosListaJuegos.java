package com.RawgApi.GameDataFetcher.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)

public record DatosListaJuegos(@JsonAlias ("results") List<DatosGame> listaJuegos) {
}
