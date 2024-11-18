package com.RawgApi.GameDataFetcher.Principal;

import com.RawgApi.GameDataFetcher.DatosGames;
import com.RawgApi.GameDataFetcher.service.ConvierteDatos;

public class Principal {

	private Consumo consumoAPI =new ConsumoAPI();
	private ConvierteDatos convierteDatos = new ConvierteDatos();


	public void mostrarDatos (){
		System.out.println("esta es la api");
		var json = consumoAPI.obtenerDatos("https://api.rawg.io/api/games?search=gear+of+war&key=5a257599d14b4fec8992cf14ee06f86d");
		var datos = convierteDatos.obenerDatos(json, DatosGames.class);



		System.out.println(datos);

	}
}
