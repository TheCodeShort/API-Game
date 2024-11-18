package com.RawgApi.GameDataFetcher;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties (ignoreUnknown = true)

public record DatosGames(@JsonAlias ("slug") String titulo,
                         @JsonAlias ("playtime") Integer horasDeJuego) {
}
