package tpe.programacion2.criterios;

import tpe.programacion2.Parrafo;

public class CriterioOr implements Criterio {
	private Criterio c1;
	private Criterio c2;

	public CriterioOr(Criterio c1, Criterio c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public boolean cumpleCriterio(Parrafo parrafo) {
		// TODO Auto-generated method stub
		return c1.cumpleCriterio(parrafo) || c2.cumpleCriterio(parrafo);
	}

}
