package desing_patterns.gof_Singleton;

/*
*
* Singleton "Preguiçoso"
*
* @author JonhDev
*
*/

public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstancia(){
        if (instancia == null) {
            instancia = new SingletonLazy();
        }

        return instancia;
    }

}
