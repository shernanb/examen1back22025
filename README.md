# Proyecto Backend - Examen

## Descripción
Este proyecto es en **Spring Boot** y conecta con una base de datos.  
Tiene tres tablas: **Usuario**, **Docente** y **Curso**.  
Se corrigieron errores de escritura y de código para que el proyecto pueda correr sin problemas.

---

## Errores que se corrigieron
- En `Curso.java`:
  - Corregí `@I` por `@Id`
  - Agregué bien `@GeneratedValue`
  - Faltaba punto y coma en algunas partes
  - Arreglé relación con `Docente`
- En `Usuario.java`:
  - Cambié `@Entit` por `@Entity`
  - Cambié `@Colun` por `@Column`
  - Cambié `contraseña` a `contrasena`
- En `Docente.java`:
  - Puse `@Entity` bien escrito
  - Agregué `@Id` en el campo id
  - Agregué los getters y setters que faltaban

