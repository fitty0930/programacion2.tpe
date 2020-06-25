package tpe.programacion2.criterios;

import tpe.programacion2.Parrafo;

public class CriterioCantidad implements Criterio{
	private int cantidadP;
	
	public CriterioCantidad(int cant) {
		this.cantidadP=cant;
	}
	@Override
	public boolean cumpleCriterio(Parrafo parrafo) {
		// TODO Auto-generated method stub
		return parrafo.contarPalabras()<cantidadP;
	}

}
