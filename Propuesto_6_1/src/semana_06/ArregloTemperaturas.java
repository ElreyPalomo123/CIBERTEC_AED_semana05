package semana_06;

public class ArregloTemperaturas {
	private double[] temperatura;
	private int indice;
	
	public ArregloTemperaturas(){
		temperatura = new double[10];
		indice = 0;
	}
	
	public int tamanio(){
		return indice;
	}
	
	public double obtener(int i){
		return temperatura[i];
	}
	
	public void adicionar(double num){
		if (indice == temperatura.length){
			ampliarArreglo();
		}
		temperatura[indice] = num;
		indice ++;
	}
	
	private void ampliarArreglo() {
		double[] aux = temperatura;
		temperatura = new double[indice + 10];
		for (int i=0; i<indice; i++){
			temperatura[i] = aux[i];
		}
	}
	
	public void eliminarAlFinal() {
		indice --;
	}
	public void eliminarTodo() {
		indice = 0;
	}
	
	public double temperaturaMenor(){
		double menor = 0;
		for (int i = 0; i < indice; i++) {
			if (temperatura[i] > menor) {
				temperatura[i] = menor;
			}
		}
		return menor;
	}
	
	public int posPrimeraTemperaturaNormal(){
		int pos = 0;
		for (int i = 0; i < indice; i++) {
			if (temperatura[i] >= 36.1 && temperatura[i] <= 37.2) {
				return i;
			}
		}
		return pos;
	}
	
	
	public void remplazarPrimeraTemperaturaNormal1(){
		int posN1 = posPrimeraTemperaturaNormal();
		if(posN1 != -1){
			temperatura[posN1]= temperaturaMenor();
		}
	}
	
	public void incrementarTemperaturas(){
		int pos = posPrimeraTemperaturaNormal();
		if(pos != -1){
			temperatura[pos]+=0.2;
		}
	}
}
