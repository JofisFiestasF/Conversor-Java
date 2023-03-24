package procesosDeConversion;

/**
 *
 * @author JOSE
 */
public class Temperatura {

    public double valor; //En Kelvin

    public Temperatura(double t, String s) {
        s = s.toUpperCase();

        switch (s) {
            //Valor de conversion de CELSIUS a KELVIN
            case "CELSIUS":
                this.valor = t + 273.15;
                break;
            //Valor de conversion KELVIN
            case "KELVIN":
                this.valor = t;
                break;
            //Valor de conversion FAHRENHEIT a KELVIN
            case "FAHRENHEIT":
                this.valor = (t - 32) * 5 / 9 + 273.15;
                break;
        }

    }

    public double Cambiar(String unidad) {
        unidad = unidad.toUpperCase();

        switch (unidad) {
            //Valor de conversion de KELVIN a CELSIUS
            case "CELSIUS":
                return this.valor - 273.15;
            //Valor de conversion KELVIN
            case "KELVIN":
                return this.valor;
            //Valor de conversion KELVIN a FAHRENHEIT
            case "FAHRENHEIT":
                return (this.valor - 273.15) * 9 / 5 + 32;
            default:
                System.out.printf("Unidad de temperatura %s desconocida\n", unidad);
                return 0;
        }
    }
}
