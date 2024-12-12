package pokemon;
public class Squirtle extends Pokemon{

    public Squirtle() {
    }



    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Squirtle y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Squirtle y este es mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Squirtle y este es mi ataque mordisco");
    }
}