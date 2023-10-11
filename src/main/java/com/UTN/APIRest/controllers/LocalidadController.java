package com.UTN.APIRest.controllers;

import com.UTN.APIRest.entities.Localidad;
import com.UTN.APIRest.services.LocalidadServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl> {
    //se o agregue por que me tiraba error
    @Override
    public ResponseEntity<?> getAll(Pageable pageable) throws Exception {
        return null;
    }
}
