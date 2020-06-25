package tpe.programacion2;

import java.util.Vector;

import tpe.programacion2.criterios.Criterio;
import tpe.programacion2.criterios.CriterioAnd;
import tpe.programacion2.criterios.CriterioCantidad;
import tpe.programacion2.criterios.CriterioIdioma;
import tpe.programacion2.criterios.CriterioOr;
import tpe.programacion2.criterios.CriterioPalabra;

public class Main {

	public static void main(String[] args) {
//		ASUMO QUE LIBRO, PAGINA Y DOCUMENTO SON INSTANCIAS DE ARTICULO
// 
		Sistema sistema = new Sistema();
		Traductor martin = new Traductor("martin");
		Traductor marcos = new Traductor("marcos");
		Traductor zazie = new Traductor("zazie");
		sistema.agregarTraductor(martin);
		sistema.agregarTraductor(marcos);
		sistema.agregarTraductor(zazie);

		Idioma aleman = new Idioma("aleman");
		aleman.agregarPalabra("hallo", "hello");
		aleman.agregarPalabra("käse", "cheese");

		Idioma espaniol = new Idioma("español");
		espaniol.agregarPalabra("omelette", "omelette");
		espaniol.agregarPalabra("queso", "cheese");
		espaniol.agregarPalabra("hola", "hello");

		Idioma frances = new Idioma("frances");
		frances.agregarPalabra("frommage", "cheese");
		frances.agregarPalabra("omelette", "omelette");
		frances.agregarPalabra("salut", "hello");

		martin.agregarIdioma(aleman);
		marcos.agregarIdioma(frances);
		zazie.agregarIdioma(espaniol);

		Parrafo parrafo1 = new Parrafo(espaniol);
		parrafo1.agregarPalabras("omelette");
		parrafo1.agregarPalabras("queso");
		parrafo1.agregarPalabras("hola");
		sistema.agregarElemento(parrafo1);
		Parrafo parrafo2 = new Parrafo(aleman);
		parrafo2.agregarPalabras("hallo");
		parrafo2.agregarPalabras("käse");
		Articulo meinkampf = new Articulo("Mein Kampf", aleman);
		meinkampf.agregarContenido(parrafo2);
		sistema.agregarElemento(meinkampf);
		Articulo meinkampf2 = new Articulo("Mein Kampf 2", aleman);
		meinkampf2.agregarContenido(parrafo2);

		Parrafo inmu = new ParrafoInmutable(espaniol);
		inmu.agregarPalabras("hola");
		inmu.agregarPalabras("computadora");
		inmu.agregarPalabras("silla");
		sistema.agregarElemento(inmu);

		sistema.traducir(parrafo1, frances);
		sistema.traducir(meinkampf2, espaniol);
		sistema.traducir(inmu, aleman);
		System.out.println(sistema.contarPalabras(meinkampf));
		System.out.println(sistema.consultarIdioma(meinkampf));

		System.out.println(sistema.mostrarElementos());

		Criterio critpalabra = new CriterioPalabra("hola");
		Criterio critidioma = new CriterioIdioma(aleman);
		Criterio critcant = new CriterioCantidad(3);
		Criterio and = new CriterioAnd(critpalabra, critcant);

		Vector<Parrafo> aux = sistema.buscarParrafos(critidioma);
		for (int i = 0; i < aux.size(); i++) {
			System.out.println(aux.get(i).toString());
		}

	}

}
