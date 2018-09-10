package br.com.alfa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alfa.model.Empresa;

@Repository
public interface EmpresaDAO extends JpaRepository<Empresa, Long> {

}
