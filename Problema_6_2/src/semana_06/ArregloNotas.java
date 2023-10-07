package semana_06;

public class ArregloNotas {
	private int[] nota;
	private int indice;
	
	public ArregloNotas(){
		nota = new int[10];
		indice = 0;
	}
	
	public int tamanio(){
		return indice;
	}
	
	public int obtener(int i){
		return nota[i];
	}
	public void adicionar(int numero) {
		if (indice == nota.length){
			ampliarArreglo();
		}
		nota[indice] = numero;
		indice ++;
	}
	private void ampliarArreglo() {
		int[] aux = nota;
		nota = new int[indice + 10];
		for (int i=0; i<indice; i++){
			nota[i] = aux[i];
		}
	}
	public void eliminarAlFinal() {
		indice --;
	}
	public void eliminarTodo() {
		indice = 0;
	}
	public int posUltimaNotaDesaprobatoria(){
		int posicion = -1;
		for (int i = indice -1; i >= 0 ; i--) {
			if (nota[i] < 13) {
				posicion = i;
				break;
			}
		}
		return posicion -1;
	}
	
	public void decrementarUltimaNotaDesaprobatoria(){
		int posicion = posUltimaNotaDesaprobatoria();
		if (posicion != -1) {
			int num = nota[posicion] - 2;
			if (num < 0) {
				nota[posicion] = 0;
			}else {
				nota[posicion] -= 2;
			}
		}
	}
	
	public void remplazarUltimaNotaDesaprobatoria(){
		int pos = posUltimaNotaDesaprobatoria();
		if(pos != -1){
			nota[pos]=posUltimaNotaDesaprobatoria();
		}
	}

}
