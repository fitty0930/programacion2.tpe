package tpe.programacion2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sistema sistema= new Sistema();
		Traductor martin= new Traductor("martin");
		Traductor marcos= new Traductor("marcos");
		Traductor zazie= new Traductor("zazie");
		sistema.agregarTraductor(martin);
		sistema.agregarTraductor(marcos);
		sistema.agregarTraductor(zazie);
		
		Idioma aleman= new Idioma("aleman");
		aleman.agregarPalabra("hallo", "hello");
		aleman.agregarPalabra("käse", "cheese");
		
		Idioma espaniol = new Idioma("español");
		espaniol.agregarPalabra("omelette", "omelette");
		espaniol.agregarPalabra("queso","cheese");
		espaniol.agregarPalabra("hola", "hello");
		
		Idioma frances= new Idioma ("frances");
		frances.agregarPalabra("frommage","cheese");
		frances.agregarPalabra("omelette","omelette");
		frances.agregarPalabra("salut", "hello");
		
		
		martin.agregarIdioma(aleman);
		marcos.agregarIdioma(frances);
		zazie.agregarIdioma(espaniol);
		
		Parrafo parrafo1= new Parrafo(espaniol);
		parrafo1.agregarPalabras("omelette");
		parrafo1.agregarPalabras("queso");
		parrafo1.agregarPalabras("hola");
		sistema.agregarElemento(parrafo1);
		Parrafo parrafo2= new Parrafo(aleman);
		parrafo2.agregarPalabras("hallo");
		parrafo2.agregarPalabras("käse");
		Articulo meinkampf= new Articulo("Mein Kampf");
		meinkampf.agregarContenido(parrafo2);
		sistema.agregarElemento(meinkampf);
		
		sistema.traducir(parrafo1, frances);
		sistema.traducir(meinkampf, espaniol);
		System.out.println(sistema.mostrarElementos());
		
	}

}
