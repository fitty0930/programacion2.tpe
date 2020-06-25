package tpe.programacion2;

import java.util.HashMap;

public class Idioma {
	private String idioma;
	HashMap<String, String> palabras;
	private static String ERROR="ERROR";
	
	public Idioma(String idioma) {
		this.idioma = idioma;
		palabras= new HashMap<String, String>();
	}
	
	public void agregarPalabra(String palabra1, String palabra2) {
		palabras.put(palabra1, palabra2);
	}

	public String getIdiomat() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String pasarAlIdioma(String palabraIngles) {
//		System.out.println("llego "+palabraIngles);
		for(String palabra:palabras.keySet()) {
//			System.out.println(palabra);
			if(palabras.get(palabra).equals(palabraIngles)) {
				return palabra;
			}
		}
		
		return ERROR; 
	}

	public String pasarAlIngles(String palabraIdioma) {
//		CONTROLAR EXISTE
//		System.out.println(palabraIdioma);
		if(palabras.containsKey(palabraIdioma)) {
			return palabras.get(palabraIdioma);
		}
		
		return ERROR;
	}
}
