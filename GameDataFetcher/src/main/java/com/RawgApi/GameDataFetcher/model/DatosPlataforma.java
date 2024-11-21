package com.RawgApi.GameDataFetcher.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)

public record DatosPlataforma(@JsonAlias ("platform") List<DatosPlataformaInformacion> informacion ) {
}
