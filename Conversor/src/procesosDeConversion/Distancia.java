package procesosDeConversion;

/**
 *
 * @author JOSE
 */
public class Distancia {

    public double valor; // En metros

    public Distancia(double m, String s) {
        s = s.toUpperCase();

        switch (s) {
            //valor de conversion KILOMETRO a METRO
            case "KILOMETRO":
                this.valor = m * 1000;
                break;
            //valor de METRO
            case "METRO":
                this.valor = m;
                break;
            //valor de conversion CENTIMETRO a METRO
            case "CENTIMETRO":
                this.valor = m / 100;
                break;
            //valor de conversion MILIMETRO a METRO
            case "MILIMETRO":
                this.valor = m / 1000;
                break;
            //valor de conversion PULGADA a METRO
            case "PULGADA":
                this.valor = m / 39.37;
                break;
            //valor de conversion PIE a METRO
            case "PIE":
                this.valor = m / 3.281;
                break;
            //valor de conversion MILLA a METRO
            case "MILLA":
                this.valor = m * 1609.34;
                break;
        }
    }

    public double Cambiar(String unidad) {
        unidad = unidad.toUpperCase();

        switch (unidad) {
            //valor de conversion METRO a KILOMETRO
            case "KILOMETRO":
                return this.valor / 1000;
            //valor de Metro
            case "METRO":
                return this.valor;
            //valor de conversion METRO a CENTIMETRO
            case "CENTIMETRO":
                return this.valor * 100;
            //valor de conversion METRO a CENTIMETRO
            case "MILIMETRO":
                return this.valor * 1000;
            //valor de conversion METRO a PULGADA
            case "PULGADA":
                return this.valor * 39.37;
            //valor de conversion METRO a PIE
            case "PIE":
                return this.valor * 3.281;
            //valor de conversion METRO a MILLA
            case "MILLA":
                return this.valor / 1609.34;
            default:
                System.out.printf("Unidad de distancia %s desconocida\n", unidad);
                return 0;
        }
    }
}
