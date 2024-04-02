package dio.gof.facade;

import dio.gof.subsistema1.crm.CrmService;
import dio.gof.subsistema2.crm.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);

        CrmService.graverCliente(nome,cep,cidade,estado);
    }
}
