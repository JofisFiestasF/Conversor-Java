package procesosDeConversion;

/**
 *
 * @author JOSE
 */
public class Peso {

    public double valor; //En gramos

    public Peso(double d, String s) {
        s = s.toUpperCase();
        switch (s) {
            //valor de conversion de TONELADA a GRAMO
            case "TONELADA":
                this.valor = d * 1000000;
                break;
            //valor de conversion de KILOGRAMO a GRAMO
            case "KILOGRAMO":
                this.valor = d * 1000;
                break;
            //valor de GRAMO
            case "GRAMO":
                this.valor = d;
                break;
            //valor de conversion de MILIGRAMO a GRAMO
            case "MILIGRAMO":
                this.valor = d / 1000;
                break;
            //valor de conversion de LIBRA a GRAMO
            case "LIBRA":
                this.valor = d * 453.6;
                break;
            //valor de conversion de ONZA a GRAMO
            case "ONZA":
                this.valor = d * 28.35;
                break;
        }
    }

    public double Cambiar(String unidad) {
        unidad = unidad.toUpperCase();
        switch (unidad) {
            //valor de conversion GRAMO a TONELADA
            case "TONELADA":
                return this.valor / 1000000;
            //valor de conversion GRAMO a KILOGRAMO
            case "KILOGRAMO":
                return this.valor / 1000;
            //valor de GRAMO
            case "GRAMO":
                return this.valor;
            //valor de conversion GRAMO a MILIGRAMO
            case "MILIGRAMO":
                return this.valor * 1000;
            //valor de conversion GRAMO a LIBRA
            case "LIBRA":
                return this.valor / 453.6;
            //valor de conversion GRAMO a ONZA
            case "ONZA":
                return this.valor /28.35
;
                
            default:
                System.out.printf("Tipo de unidad de peso %s desconocida\n", unidad);
                return 0;
        }
    }
}
