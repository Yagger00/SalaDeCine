public class SalaDeCine {
	private final int asientosMaximoEnHorizontal = 5;
	private final int asientosMaximosEnVertical = 5;
	Persona personaIngrefada;
	/*
	 * el primer cuadro corresponde al renglo y el segundo corresponde a las filas
	 */
	Persona asientosDeLaSalaDeCine[][];

	public SalaDeCine() {
		this.asientosDeLaSalaDeCine = new Persona [asientosMaximoEnHorizontal][asientosMaximosEnVertical];
	}

	public SalaDeCine(Persona personaIngresada) {
		this();
		this.personaIngrefada = personaIngresada;
	}

	public boolean laSalaSeEncuentraVacia() {
		// ITERAMOS RENGLONES Y COLUMNAS - SI EN ALGUNA COLUMNA ES DISTINTA DE NULL
		// LA SALTA NO SE ENTRUENTA VACIA
		for (int renglones = 0; renglones < asientosDeLaSalaDeCine.length; renglones++) {
			for (int columnas = 0; columnas < asientosDeLaSalaDeCine.length; columnas++) {
				if (asientosDeLaSalaDeCine[renglones][columnas] == null) {
					return true;
				}
			}
		}

		return false;

	}

	public boolean elAsientoSeEncuenTraOcupado(int fila, int columna) {
		// ITERAMOS RENGLONES DE FILAS Y COLUMNAS
		// SI EL ASIENTO INDICADO SE ENCUENTRA ACUOPADO RETORNA TRUE

		for (int renglones = 0; renglones < asientosDeLaSalaDeCine.length; renglones++) {
			for (int columnas = 0; columnas < this.asientosDeLaSalaDeCine[renglones].length; columnas++) {
				if (asientosDeLaSalaDeCine[fila][columnas] == null) {
					return true;
				}
			}
		}

		return false;
	}

	public boolean ocuparButaca(int fila, int columna, Persona persona) {
		// ITEREAMOS NUEVAMENTE RENGLONES Y FILAS
		// SI EL ASIENTO NO ESTA OCUPADO LE ASIGNAMOS UN NUMERO AlEATORIO QUE ASEEJA UN
		// DENI
		for (int renglones = 0; renglones < asientosDeLaSalaDeCine.length; renglones++) {
			for (int filas = 0; filas < asientosDeLaSalaDeCine[renglones].length; filas++) {
				if (asientosDeLaSalaDeCine[fila][columna] == null) {
					this.asientosDeLaSalaDeCine[fila][columna] = persona;
					// retorna True para saber si se asigno un dato al array
					return true;
				}

			}
		}

		return false;
	}

	public int consultarCantidadDeButacasOcupadas() {
		int contadorDeColumnasUsadas = 0;
		for (int renglones = 0; renglones < asientosDeLaSalaDeCine.length; renglones++) {
			for (int columnas = 0; columnas < asientosDeLaSalaDeCine.length; columnas++) {
				if(asientosDeLaSalaDeCine[renglones][columnas] != null) {
					contadorDeColumnasUsadas++;
				}
			}
		}
		
		return contadorDeColumnasUsadas;
	}

}
