package procesosDeConversion;

/**
 *
 * @author JOSE
 */
public class Tiempo {

    private double valor; // En segundos

    public Tiempo(double num, String s) {

        s = s.toUpperCase();
        switch (s) {
            //valor de conversion SEGUNDOS a DIA
            case "DIA":
                this.valor = num * 86400;
                break;
            //valor de conversion SEGUNDOS a HORA
            case "HORA":
                this.valor = num * 3600;
                break;
            //valor de conversion SEGUNDOS a MINUTO
            case "MINUTO":
                this.valor = num * 60;
                break;
            //valor de SEGUNDOS
            case "SEGUNDO":
                this.valor = num;
                break;
        }
    }

    public double Cambiar(String unidad) {
        unidad = unidad.toUpperCase();

        switch (unidad) {
            //valor de conversion DIA a SEGUNDOS
            case "DIA":
                return this.valor / 86400;
            //valor de conversion HORA a SEGUNDOS
            case "HORA":
                return this.valor / 3600;
            //valor de conversion MINUTO a SEGUNDOS
            case "MINUTO":
                return this.valor / 60;
            //valor de SEGUNDOS
            case "SEGUNDO":
                return this.valor;
            default:
                System.out.printf("Unidad de tiempo %s desconocida\n", unidad);
                return 0;
        }
    }
}
