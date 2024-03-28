package dio.gof.singleton;
/**
 * Singleton "apressado"
 * @author katriel
 **/
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
    }

    public static SingletonEager getInstance(){
        return instancia;
    }
}
