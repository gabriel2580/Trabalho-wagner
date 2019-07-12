package formatacaodedados;

public class FormatacaoDeDados {

    public static void main(String[] args) {

        String cpfFormatado = Mascaras.formataCpf("09008851903");
        System.out.println(cpfFormatado);

        String cnpjFormatado = Mascaras.formataCnpj("77637684000161");
        System.out.println(cnpjFormatado);

        String cepFormatado = Mascaras.formataCep("88352490");
        System.out.println(cepFormatado);
        
        String telefoneFormatdo = Mascaras.formataTelefone("47996859208");
        System.out.println(telefoneFormatado);
    }

}
