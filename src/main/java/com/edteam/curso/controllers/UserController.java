package com.edteam.curso.controllers;

import com.edteam.curso.models.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    /**
     *
     * @return todos los usuarios
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<User> getAll() {
        List<User> list = new ArrayList<>();
        User user = new User();
        user.setNombre("Lucas");
        user.setApellido("Moncada");
        list.add(user);
        return list;
    }

    /**
     * Trae un solo usuario
     * @param id es el id del usuario a traer
     * @return un usuario segun su id
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    User get(@PathVariable long id) {
        User user = new User();
        user.setNombre("Miguel");
        user.setApellido("Chavez");
        return user;
    }


    /**
     * Pasaremos un usuario como parametro y este
     * sera guardado en base de datos
     * @param user tiene el cuerpo de un usuario
     * @return el usuario creado
     */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    User register(@RequestBody User user) {
        // TODO: Registrar en la base de datos al usuario
        return user;
    }

    /**
     * Actualizar usuario en base de datos segun parametros enviados
     * @param user usuario a cambiar
     * @return el usuario cambiado
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    User update(@RequestBody User user) {
        // TODO: Actualizar en la base de datos al usuario
        return user;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable long id) {
        // TODO: eliminar en la base de datos al usuario

    }
}
