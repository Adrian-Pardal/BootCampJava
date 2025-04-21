package EstruturaExcepcionais.ExececoesCustomizadas;

public class CepInvalidoException extends Exception {
    public static void main(String[] args) {
        
        try {
            String cepFormatado = formatarCep("123456780");
            System.out.println(cepFormatado);
        } 
        catch (CepInvalidoException ex) {
            System.out.println("O cep nao corresponde, sao somente 8 digitos");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8){
            throw new CepInvalidoException();

            
        }
        //simulando um cep formatado
        return "23.765-064";
    }
}
