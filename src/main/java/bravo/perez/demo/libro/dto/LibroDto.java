package bravo.perez.demo.libro.dto;

public class LibroDto {
    private Long id;
    private String titulo;
    private String autor;
    private Boolean disponible;

    public LibroDto(Long id, String titulo, String autor, Boolean disponible) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }

    public Long getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public Boolean getDisponible() { return disponible; }
}