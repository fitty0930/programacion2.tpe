package tpe.programacion2.criterios;

import tpe.programacion2.Parrafo;

public class CriterioNot implements Criterio {
	private Criterio c1;

	public CriterioNot(Criterio c1) {
		this.c1 = c1;
	}

	@Override
	public boolean cumpleCriterio(Parrafo parrafo) {
		// TODO Auto-generated method stub
		return !c1.cumpleCriterio(parrafo);
	}

}
