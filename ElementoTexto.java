package tpe.programacion2;

import java.util.Vector;

import tpe.programacion2.criterios.Criterio;

public abstract class ElementoTexto {
	private Idioma idioma;

//	metodo traducir

	public Idioma getIdioma() {
		return idioma;
	}

	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}

	public abstract int contarPalabras();

	public abstract ElementoTexto traducirse(Idioma idioma);

	public abstract Vector<Parrafo> buscarParrafos(Criterio crit);
}
