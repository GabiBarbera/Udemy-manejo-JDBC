import datos.PersonaDAO;
import domain.Persona;

import java.util.List;

public class TestManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();

        // Insertando un nuevo objeta de tipo Persona

        Persona personaNueva = new Persona("Pedro", "Manoto", "pedromanoto@gmail.com", "11213466677");
        personaDao.insertar(personaNueva);

        List<Persona> personas = personaDao.seleccionar();

        personas.forEach(persona -> {
            System.out.println("Persona = " + persona);
        });
    }
}