package com.RawgApi.GameDataFetcher.Principal;


import com.RawgApi.GameDataFetcher.model.DatosGame;
import com.RawgApi.GameDataFetcher.service.ConsumoAPI;
import com.RawgApi.GameDataFetcher.service.ConvierteDatos;

public class Principal {
	ConsumoAPI consumoAPI = new ConsumoAPI();
	ConvierteDatos convierteDatos = new ConvierteDatos();
	public void mostrarInformacion(){


		var json = consumoAPI.obtenerDatos("https://api.rawg.io/api/games?search=dota+2&key=5a257599d14b4fec8992cf14ee06f86d");
		var datos = convierteDatos.obenerDatos(json, DatosGame.class );
		System.out.println(datos);
	}

}

