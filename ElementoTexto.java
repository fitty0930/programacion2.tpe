package tpe.programacion2;

import java.util.Vector;

import tpe.programacion2.criterios.Criterio;

public abstract class ElementoTexto {
	private Idioma idioma;

//	metodo traducir
	public ElementoTexto(Idioma idioma) {
		this.idioma = idioma;
	}

	public Idioma getIdioma() {
		return idioma;
	}

	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}

	public abstract int contarPalabras();

	public abstract ElementoTexto traducirse(Idioma idioma);

	public abstract Vector<Parrafo> buscarParrafos(Criterio crit);

	public abstract Vector<String> obtenerPalabras();

	@Override
	public boolean equals(Object objeto) {
//		SOLO ES IGUAL SI LOS DOS VECTORES OBTENIDOS SON IGUALES
		return ((ElementoTexto) objeto).obtenerPalabras().equals(this.obtenerPalabras());
//		vector. equals(Object obj) method of Vector class in Java is used verify the equality
//		of an Object with a vector and compare them. The list returns true only if both Vector contains
//		same elements with same order.
	}
}
