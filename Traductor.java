package tpe.programacion2;

import java.util.Vector;

public class Traductor {
	String nombre;
	private Vector<Idioma> idiomasConoce;

	public Traductor(String nombre) {
		this.nombre = nombre;
		idiomasConoce = new Vector<Idioma>();
	}

//	TRADUCIR EL ELEMENTOTEXTO QUE LE PASO
	public ElementoTexto traducirElem(ElementoTexto elem, Idioma idioma) {
		return elem.traducirse(idioma);
	}
	
//	PARA BUSCAR TRADUCTOR
	public boolean conoceIdioma(Idioma idioma) {
		boolean sabe = false;
		if (idiomasConoce.contains(idioma)) {
			sabe = true;
		}

		return sabe;
	}

//	BASE	

	public void agregarIdioma(Idioma idioma) {
		idiomasConoce.add(idioma);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
