package tpe.programacion2.criterios;

import tpe.programacion2.Idioma;
import tpe.programacion2.Parrafo;

public class CriterioIdioma implements Criterio {
	private Idioma idiomab;

	public CriterioIdioma(Idioma idioma) {
		idiomab = idioma;
	}

	@Override
	public boolean cumpleCriterio(Parrafo parrafo) {
		// TODO Auto-generated method stub
		String aux = parrafo.getIdioma().getIdiomat();
//		System.out.println(aux);
//		System.out.println(idiomab.getIdiomat());
		return aux.equals(idiomab.getIdiomat());
	}

}
