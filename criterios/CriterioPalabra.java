package tpe.programacion2.criterios;

import tpe.programacion2.Parrafo;

public class CriterioPalabra implements Criterio{
	private String palabrab;
	
	public CriterioPalabra(String palabra) {
		this.palabrab=palabra;
	}
	
	@Override
	public boolean cumpleCriterio(Parrafo parrafo) {
		// TODO Auto-generated method stub
		return parrafo.contienePalabra(palabrab);
	}

}
