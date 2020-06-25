package tpe.programacion2;

import java.util.Vector;

import tpe.programacion2.criterios.Criterio;

public class Sistema {
	private Vector<ElementoTexto> elementos;
	private Vector<Traductor> traductores;

	public Sistema() {
		elementos = new Vector<ElementoTexto>();
		traductores = new Vector<Traductor>();
//		CAMBIAR A IDIOMA
	}

	public void agregarElemento(ElementoTexto elem) {
		elementos.add(elem);
	}

	public void agregarTraductor(Traductor trad) {
		traductores.add(trad);
	}

	public boolean tenemosElemento(ElementoTexto elemento) {
		return elementos.contains(elemento);
	}

	public void traducir(ElementoTexto elemento, Idioma idioma) {
//		CHEQUEO ELEMENTO
		if (this.tenemosElemento(elemento)) {
//			CHEQUEO TRADUCTOR
			Traductor trad = buscarTraductor(idioma);
			if (trad != null) {
//				SI ENCONTRE TRADUCTOR LO PONGO A TRADUCIR Y AGREGO EL ELEMENTO TRADUCIDO
				agregarElemento(trad.traducirElem(elemento, idioma));
			}
		}
	}

	public Traductor buscarTraductor(Idioma idioma) {
		for (int i = 0; i < traductores.size(); i++) {
			if (traductores.get(i).conoceIdioma(idioma)) {
				return traductores.get(i);
			}
		}
		return null;
	}

//	CONSULTAR SI ESTO ES ASI
	public int contarPalabras(Articulo art) {
		return art.contarPalabras();
	}

	
	// busqueda
	public Vector<Parrafo> buscarParrafos(Criterio crit) {
		Vector<Parrafo> aux = new Vector<Parrafo>();
		for (int i = 0; i < elementos.size(); i++) {
			aux.addAll(elementos.get(i).buscarParrafos(crit));
		}

		return aux;
	}
	
	public String mostrarElementos() {
		String aux="";
		for(int i=0; i<elementos.size();i++) {
			aux+=". "+elementos.get(i).toString()+"\n";
		}
		
		return aux;
	}
}
