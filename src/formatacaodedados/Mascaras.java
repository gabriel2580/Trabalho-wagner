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
        String telefoneFormatado = "";
        
        String bloco1 = telefone.substring(0, 0);
        String bloco2 = telefone.substring(0, 2);
        String bloco3 = telefone.substring(2, 7); 
        String bloco4 = telefone.substring(7, 11);
        
        
        telefoneFormatado = bloco1 + "(" + bloco2 +") "+ bloco 3 + "-"+ bloco4;
 
    return telefoneFormatado;
    
    }

}
