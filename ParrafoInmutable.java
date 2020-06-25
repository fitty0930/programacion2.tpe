package tpe.programacion2;



public class ParrafoInmutable extends Parrafo{
	
	public ParrafoInmutable(Idioma idioma) {
		super(idioma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ElementoTexto traducirse(Idioma idioma) {
		
		Parrafo parrafo = new Parrafo(palabras);
		return parrafo;
	}
}
