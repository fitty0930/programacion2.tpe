package tpe.programacion2;

import java.util.Vector;

import tpe.programacion2.criterios.Criterio;

public class Articulo extends ElementoTexto {
	private String titulo;
	private Vector<ElementoTexto> contenido;

	public Articulo(String titulo, Idioma idioma) {
		super(idioma);
		this.titulo = titulo;
		contenido = new Vector<ElementoTexto>();
	}

	public void agregarContenido(ElementoTexto elem) {
		contenido.add(elem);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		String aux = this.getTitulo() + ": ";
		for (int i = 0; i < contenido.size(); i++) {
			aux += ", " + contenido.get(i).toString();
		}

		return aux;
	}

	@Override
	public int contarPalabras() {
		int aux = 0;
		for (int i = 0; i < contenido.size(); i++) {
			aux += contenido.get(i).contarPalabras();
		}
		return aux;
	}

	@Override
	public ElementoTexto traducirse(Idioma idioma) {
		Articulo artTrad = new Articulo("articulo " + this.getTitulo() + " traducido " + idioma.getIdiomat(), idioma);
		for (int i = 0; i < contenido.size(); i++) {
			artTrad.agregarContenido(contenido.get(i).traducirse(idioma));
		}
		return artTrad;
	}

	@Override
	public Vector<Parrafo> buscarParrafos(Criterio crit) {
		Vector<Parrafo> aux = new Vector<Parrafo>();
		for (int i = 0; i < contenido.size(); i++) {
			aux.addAll(contenido.elementAt(i).buscarParrafos(crit));
		}

		return aux;
	}

	@Override
	public Vector<String> obtenerPalabras() {
		Vector<String> aux = new Vector<String>();
		for (int i = 0; i < contenido.size(); i++) {
			aux.addAll(contenido.get(i).obtenerPalabras());
		}
		return aux;
	}
}
