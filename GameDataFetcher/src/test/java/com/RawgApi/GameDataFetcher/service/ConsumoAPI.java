package com.RawgApi.GameDataFetcher.service;

import com.RawgApi.GameDataFetcher.DatosGames;
import com.RawgApi.GameDataFetcher.Principal.Principal;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class ConsumoAPI  {

	public String obtenerDatos(String url){

		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(url))
				.build();
		HttpResponse<String> response = null;
		try {
			 response = client
					.send(request, HttpResponse.BodyHandlers.ofString());
		} catch (IOException e) {
			throw new RuntimeException(e);

		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		String json = response.body();
		return json;
	}




}
