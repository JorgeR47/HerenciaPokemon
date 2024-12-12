package pokemon;
public class Pikachu extends Pokemon{

    public Pikachu() {
    }


    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Pikachu y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Pikachu y este es mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Pikachu y este es mi ataque mordisco");
    }

}
