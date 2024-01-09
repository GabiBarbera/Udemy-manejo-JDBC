import datos.PersonaJDBC;
import domain.Persona;

import java.util.List;

public class TestManejoPersonas {
    public static void main(String[] args) {
        PersonaJDBC personaJDBC = new PersonaJDBC();

        // Insertando un nuevo objeta de tipo Persona

//        Persona personaNueva = new Persona("Pedro", "Manoto", "pedromanoto@gmail.com", "11213466677");
//        personaJDBC
//       .insertar(personaNueva);

        // Modificar un objeto de persona existente

//        Persona personaModificar = new Persona(8, "Pedro Mujica", "Manoto", "pedromanoto@gmail.com", "1129134422");
//        personaJDBC
//       .actualizar(personaModificar);

        // Eliminar un registro tipo Persona

        Persona eliminarPersona = new Persona(4);
        personaJDBC.eliminar(eliminarPersona);

        // Listado Personas
        List<Persona> personas = personaJDBC.seleccionar();

        personas.forEach(persona -> {
            System.out.println("Persona = " + persona);
        });
    }
}
