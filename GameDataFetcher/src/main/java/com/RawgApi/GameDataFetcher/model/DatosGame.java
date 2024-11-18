package com.RawgApi.GameDataFetcher.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)


public record DatosGame(@JsonAlias ("name") String titulo,
                        @JsonAlias ("playtime") Integer horaDeJuego) {
}
