package procesosDeConversion;

/**
 *
 * @author JOSE
 */
public class Moneda {
    public double valor; // En soles

    public Moneda(double m, String s) {
        s = s.toUpperCase();

        switch (s) {
            //valor de conversion DOLAR a SOL
            case "DOLAR":
                this.valor = m * 3.7705;
                break;
            //valor de SOL
            case "SOL":
                this.valor = m;
                break;
            //valor de conversion EURO a SOL
            case "EURO":
                this.valor = m * 4.0808;
                break;
            //valor de conversion LIBRA a SOL
            case "LIBRA":
                this.valor = m * 4.6272;
                break;
            //valor de conversion YEN a SOL
            case "YEN":
                this.valor = m * 0.02888;
                break;
            //valor de conversion WON a SOL
            case "WON":
                this.valor = m * 0.002918;
                break;
        }
    }
    
    public double Cambiar(String unidad) {
        unidad = unidad.toUpperCase();

        switch (unidad) {
            //valor de conversion SOL a DOLAR
            case "DOLAR":
                return this.valor / 3.7705;
            //valor de SOL
            case "SOL":
                return this.valor;
            //valor de conversion SOL a EURO
            case "EURO":
                return this.valor / 4.0808;
            //valor de conversion SOL a LIBRA
            case "LIBRA":
                return this.valor / 4.6272;
            //valor de conversion SOL a YEN
            case "YEN":
                return this.valor / 0.02888;
            //valor de conversion SOL a WON
            case "WON":
                return this.valor / 0.002918;
            default:
                System.out.printf("Unidad de distancia %s desconocida\n", unidad);
                return 0;
        }
    }
}
