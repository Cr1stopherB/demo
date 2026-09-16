package bravo.perez.demo.libro.controller;

import bravo.perez.demo.libro.domain.Libro;
import bravo.perez.demo.libro.dto.LibroDto;
import bravo.perez.demo.libro.repository.LibroRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/libros")
@CrossOrigin(origins = "*")
public class LibroController {

    private final LibroRepository libroRepository;

    public LibroController(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    @GetMapping
    public List<LibroDto> obtenerTodos() {
        return libroRepository.findAll().stream()
                .map(libro -> new LibroDto(
                        libro.getId(),
                        libro.getTitulo(),
                        libro.getAutor(),
                        libro.getDisponible()
                ))
                .collect(Collectors.toList());
    }

    @PostMapping
    public Libro guardar(@RequestBody Libro libro) {
        return libroRepository.save(libro);
    }
}