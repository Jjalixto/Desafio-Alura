package com.joel.desafioalura.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosLibros(
    @JsonAlias("title") String titulo,
    @JsonAlias("authors") List<DatosAutor> autor,
    @JsonAlias("languajes") List<String> idiomas,
    @JsonAlias("download_count") Double numeroDeDescargas) {
}
