package dio.gof.subsistema1.crm;

public class CrmService {
    private CrmService(){
    }
    public static void graverCliente(String nome, String cep, String estado, String cidade){
        System.out.println("Cliente salvo no sistema crm service 01");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
    }
}
