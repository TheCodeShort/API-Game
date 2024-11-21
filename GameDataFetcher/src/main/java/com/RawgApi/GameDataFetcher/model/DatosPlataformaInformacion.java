package com.RawgApi.GameDataFetcher.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public record DatosPlataformaInformacion(@JsonAlias ("slug") String plataforma) {
}
