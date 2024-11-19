package com.RawgApi.GameDataFetcher.Principal;


import com.RawgApi.GameDataFetcher.model.DatosGame;
import com.RawgApi.GameDataFetcher.model.DatosListaJuegos;
import com.RawgApi.GameDataFetcher.service.ConsumoAPI;
import com.RawgApi.GameDataFetcher.service.ConvierteDatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Principal {

	private Scanner teclado = new Scanner(System.in);
	private final String URL_BASE = "https://api.rawg.io/api/games?search=";
	private final String API_KEY = "&key=5a257599d14b4fec8992cf14ee06f86d";

	ConsumoAPI consumoAPI = new ConsumoAPI();
	ConvierteDatos convierteDatos = new ConvierteDatos();

	public void mostrarInformacion(){
		List<DatosListaJuegos> listaJuegos = new ArrayList<>();
		System.out.printf("Digita el juego que quieres buscar: ");
		var juego = teclado.nextLine().toLowerCase();
		var json = consumoAPI.obtenerDatos(URL_BASE + juego.replace(" ", "+") + API_KEY);
		var datosListaJuegos = convierteDatos.obenerDatos(json, DatosListaJuegos.class );
		listaJuegos.add(datosListaJuegos);

		listaJuegos.stream()
					.filter(j-> !j.listaJuegos().contains(juego))
					.peek(System.out::println)
					.collect(Collectors.toList());

		}

	}



