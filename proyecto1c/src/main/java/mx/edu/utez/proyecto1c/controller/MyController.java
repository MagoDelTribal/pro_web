
package mx.edu.utez.proyecto1c.controller;




import jakarta.validation.Valid;
import mx.edu.utez.proyecto1c.controller.dto.RequestBodyDTO;
import mx.edu.utez.proyecto1c.controller.dto.RequestCalculadoraDTO;
import mx.edu.utez.proyecto1c.service.MyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin({"*"})//todos los origenes de peticiones
@RequestMapping("/my-services")
public class MyController {


    private final MyService service;

    public MyController(MyService service) {
        this.service = service;
    }


    @GetMapping
    public String miPrimerServicio(){
        return "hello world";
    }




    @GetMapping("/servicio2")
    public String serviicio2(){


        return "segundo servicio";
    }


    @PostMapping
    public String servicio3(){
        return "este es el servicio 3";
    }






    @GetMapping("/path/{id}")
    public String pathvariable(@PathVariable String id){
        return "el path variable es: "+id;


    }


    @PostMapping("/body")
    public ResponseEntity<RequestBodyDTO> body(@RequestBody @Valid RequestBodyDTO payload){
        System.out.println(payload.getEdad());
        System.out.println(payload.getNombre());

        return ResponseEntity
                .status((HttpStatus.CREATED))
                .body(payload);
    }

    @PostMapping("/calculadora")
    public double calculadora(@RequestBody @Valid RequestCalculadoraDTO payload){
        return service.calculadora(payload);
    }




}




