package EstruturaExcepcionais;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        Number valor =  Double.valueOf("1.75");

        try {
            valor = NumberFormat.getInstance().parse("1.79");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println(valor);
    }
}
