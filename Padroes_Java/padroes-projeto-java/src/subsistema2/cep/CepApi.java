package subsistema2.cep;

import desing_patterns.gof_Singleton.SingletonEager;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getInstancia(){

        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Matinhos";
    }

    public String recuperarEstado(String cep){
        return "PR";
    }
}
