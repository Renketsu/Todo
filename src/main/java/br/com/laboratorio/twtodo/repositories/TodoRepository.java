package br.com.laboratorio.twtodo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.laboratorio.twtodo.models.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
