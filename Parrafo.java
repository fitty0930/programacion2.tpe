package tpe.programacion2;

import java.util.Vector;

import tpe.programacion2.criterios.Criterio;

public class Parrafo extends ElementoTexto {
	protected Vector<String> palabras;

	public Parrafo(Idioma idioma) {
		super.setIdioma(idioma);
		palabras = new Vector<String>();
	}

	public Parrafo(Vector<String> palabrasc) {
		palabras = new Vector<String>(palabrasc);
	}

	public void agregarPalabras(String palabra) {
		palabras.add(palabra);
	}

	public boolean contienePalabra(String palabra) {
		return palabras.contains(palabra);
	}

	public ElementoTexto traducirse(Idioma idioma) {
		Vector<String> traducido = new Vector<String>();
		String aux;
		for (int i = 0; i < palabras.size(); i++) {
			aux = this.getIdioma().pasarAlIngles(palabras.get(i)); // primero de mi idioma al ingles
			traducido.add(idioma.pasarAlIdioma(aux)); // despues del ingles al idioma buscado
		}
//		CREO EL NUEVO PARRAFO
		Parrafo parrafo = new Parrafo(idioma);
		for (int i = 0; i < traducido.size(); i++) {
			parrafo.agregarPalabras(traducido.get(i));
		}

		return parrafo;
	}

	public int contarPalabras() {
		return palabras.size();
	}

	public Vector<Parrafo> buscarParrafos(Criterio crit) {
		Vector<Parrafo> aux = new Vector<Parrafo>();
		if (crit.cumpleCriterio(this)) {
			aux.add(this);
		}

		return aux;
	}

	public String toString() {
		String aux = "";
		for (int i = 0; i < palabras.size(); i++) {
			aux += "," + palabras.get(i);
		}

		return aux;
	}
}
