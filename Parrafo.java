package tpe.programacion2;

import java.util.Vector;

import tpe.programacion2.criterios.Criterio;

public class Parrafo extends ElementoTexto {
	private Vector<String> palabras;

	public Parrafo(Idioma idioma) {
		super(idioma);
		palabras = new Vector<String>();
	}

	public Parrafo(Idioma idioma, Vector<String> palabrasc) {
		super(idioma);
		palabras = new Vector<String>(palabrasc);
	}

	public void agregarPalabras(String palabra) {
		palabras.add(palabra);
	}

	public boolean contienePalabra(String palabra) {
		return palabras.contains(palabra);
	}

	@Override
	public Vector<String> obtenerPalabras() {
		Vector<String> aux = new Vector<String>(palabras);
		return aux;
	}

	@Override
	public ElementoTexto traducirse(Idioma idioma) {
		Vector<String> traducido = new Vector<String>();
		String aux;
		for (int i = 0; i < palabras.size(); i++) {
			aux = this.getIdioma().pasarAlIngles(palabras.get(i)); // primero de mi idioma al ingles
			traducido.add(idioma.pasarAlIdioma(aux)); // despues del ingles al idioma buscado
		}
//		CREO EL NUEVO PARRAFO
		Parrafo parrafo = new Parrafo(idioma, traducido);

		return parrafo;
	}

	@Override
	public int contarPalabras() {
		return palabras.size();
	}
	
	@Override
	public Vector<Parrafo> buscarParrafos(Criterio crit) {
		Vector<Parrafo> aux = new Vector<Parrafo>();
		if (crit.cumpleCriterio(this)) {
			aux.add(this);
		}

		return aux;
	}
	
	@Override
	public String toString() {
		String aux = "";
		for (int i = 0; i < palabras.size(); i++) {
			aux += "," + palabras.get(i);
		}

		return aux;
	}

}
