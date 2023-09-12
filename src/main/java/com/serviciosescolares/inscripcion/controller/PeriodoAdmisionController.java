package com.serviciosescolares.inscripcion.controller;

import com.serviciosescolares.inscripcion.entity.PeriodosAdmision;
import com.serviciosescolares.inscripcion.service.PeriodoAdmisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/periodo/admision")
public class PeriodoAdmisionController {


    @Autowired
    private PeriodoAdmisionService periodoAdmisionService;

    @PostMapping("/crear/periodo")
    public PeriodosAdmision crearPeriodo(@RequestBody PeriodosAdmision periodosAdmision) {
        return periodoAdmisionService.crearPeriodo(periodosAdmision);
    }

    @GetMapping("/obtener/todos")
    public List<PeriodosAdmision> getAllEstudiantes() {
        return periodoAdmisionService.obtenerLosPeriodos();
    }

    @GetMapping("/obtener/{idPeriodoAdmision}")
    public ResponseEntity<PeriodosAdmision> obtenerPeriodoPorId(@PathVariable Long idPeriodoAdmision) {
        PeriodosAdmision periodos = periodoAdmisionService.buscarPorId(idPeriodoAdmision);
        if(periodos == null){
            return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(periodos, HttpStatus.OK);
    }

    @GetMapping("/obtener/nombre/{nombrePeriodoAdmision}")
    public ResponseEntity<PeriodosAdmision> obtenerPeriodoPorNombre(@PathVariable String nombrePeriodoAdmision) {
        PeriodosAdmision periodos = periodoAdmisionService.buscarPeriodoPorNombre(nombrePeriodoAdmision);
        if(periodos == null){
            return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(periodos, HttpStatus.OK);
    }

    @PutMapping("/modificar/periodo/{idPeriodoAdmision}")
    public ResponseEntity<PeriodosAdmision> modificarPeriodo(@PathVariable Long idPeriodoAdmision, @RequestBody PeriodosAdmision periodosAdmision){
        System.out.println("hola");
        PeriodosAdmision periodos = periodoAdmisionService.cambiarPeriodo(idPeriodoAdmision, periodosAdmision);
        if(periodos == null){
            return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(periodos, HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/periodo/{idPeriodoAdmision}")
    public ResponseEntity<PeriodosAdmision> eliminarPeriodo(@PathVariable Long idPeriodoAdmision) {
        boolean periodoEliminado = periodoAdmisionService.eliminarPeriodo(idPeriodoAdmision);
        if(periodoEliminado == false){
            return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(null, HttpStatus.OK);
    }


}
