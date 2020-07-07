package principal;

public class DatosTemperaturas {

	public static void main(String[] args) {
		String temps= "24.3,26.7,31.4,22.9,10.3,17.8";
		double media=0;
		String[] datosTemp=temps.split(",");
		for(String tmp:datosTemp) {
			media+=Double.parseDouble(tmp);
		}
		System.out.printf("La temperatura media es %1$.2f",media/datosTemp.length);
	}

}
