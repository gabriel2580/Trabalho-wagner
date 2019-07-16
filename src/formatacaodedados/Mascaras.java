package formatacaodedados;

public class Mascaras {

    public static String formataCpf(String cpf) {
        String cpfFormata = "";

        String cpfFormatado = cpf.substring(0, 3) + "." + cpf.substring(3, 6)
                + "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11);

        return cpfFormatado;
    }

    public static String formataCnpj(String cnpj) {
        String cnpjFormata = "";

        String cnpjFormatado = cnpj.substring(0, 2) + "." + cnpj.substring(2, 5)
                + "." + cnpj.substring(5, 8) + "/" + cnpj.substring(8, 12) + "-" + cnpj.substring(12, 14);

        return cnpjFormatado;
    }

    public static String formataCep(String cep) {
        char[] cepArray = cep.toCharArray();

        String cepFormatado = "";

        for (int i = 0; i < cepArray.length; i++) {
            cepFormatado = cepFormatado + cepArray[i];

            if (i == 1) {
                cepFormatado = cepFormatado + ".";
            }
            if (i == 4) {
                cepFormatado = cepFormatado + "-";
            }
        }

        return cepFormatado;
    }

    public static String formataTelefone(String telefone) {
        char[] telefoneArray = telefone.toCharArray();
        
        String telefoneFormatado = "";
        
        for (int i = 0; i < telefoneArray.length; i++) {
            
            if(i == 0) {
                telefoneFormatado = telefoneFormatado + "(";
            }
            
            telefoneFormatado = telefoneFormatado + telefoneArray[i];
                       
            if (i == 1) {
                telefoneFormatado = telefoneFormatado + ")";
            }
            if (i == 6) {
                telefoneFormatado = telefoneFormatado + "-";
            }
        }
 
    return telefoneFormatado;
    
    }

    public static String formataPlaca (String placa) {
        String placaFormata = "";
        
        String placaFormatado = placa.substring(0, 3) + "-" + placa.substring(3, 7);
           
        return placaFormatado.toUpperCase();
    }
    
    public static int letrasMaiusculas (String letras){
        int contLetraMaiuscula = 0;
        char[] palavraArray = letras.toCharArray();
        
        
        for(char c : palavraArray ) {
            
            if(Character.isUpperCase(c)) {
                contLetraMaiuscula++;
            }
            
        }
        return contLetraMaiuscula;
                            
    }
    
    public static int letrasMinusculas (String letras){
        int contLetraMinuscula = 0;
        char[] palavraArray = letras.toCharArray();
        
        
        for(char c : palavraArray ) {
            
            if(Character.isLowerCase(c)) {
                contLetraMinuscula++;
            }
            
        }
        return contLetraMinuscula;
    }
}
