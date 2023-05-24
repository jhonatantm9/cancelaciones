package com.udea.cancelaciones.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.udea.cancelaciones.DTO.DatosFormLoginDTO;
import com.udea.cancelaciones.DTO.LoginMensajeDTO;
import com.udea.cancelaciones.models.Estudiante;
import com.udea.cancelaciones.service.LoginService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/login")
public class LoginController {
    
    @Autowired
    private LoginService loginService;

    //Borrar
    @GetMapping("/autenticar")
    public ResponseEntity<Object> p(){
        return ResponseEntity.ok("Holaaa");
    }

    @PostMapping("/autenticar")
    public ResponseEntity<?> autenticarLogin(@RequestBody DatosFormLoginDTO loginDTO){
        System.out.println(loginDTO.getUsuario()+"----------------");//Borrar
        try{
            var estudiante = loginService.AutenticarLogin(loginDTO);
            return ResponseEntity.ok(estudiante);
        } catch(RuntimeException e){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
    }

    //Version antigua
    @PostMapping("/autenticarAn")
    public ResponseEntity<LoginMensajeDTO> autenticacionlogin(@RequestBody DatosFormLoginDTO loginDTO){
        var mensaje = loginService.AutenticarLoginAn(loginDTO);
        return ResponseEntity.ok(mensaje);
    }
}
