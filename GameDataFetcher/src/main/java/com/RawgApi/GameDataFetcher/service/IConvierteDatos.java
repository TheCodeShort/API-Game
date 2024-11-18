package com.RawgApi.GameDataFetcher.service;

public interface IConvierteDatos {

	<T> T obenerDatos( String json, Class <T> clase);
}
