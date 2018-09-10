package br.com.alfa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alfa.dao.EmpresaDAO;
import br.com.alfa.model.Empresa;

@Service
public class EmpresaService {
	
	@Autowired
	private EmpresaDAO dao;
	
	public void salvar(Empresa empresa) {
		dao.save(empresa);
	}
	
	public void deletar(Long codigo) {
		dao.delete(codigo);
	}
	
	public Empresa getById(Long codigo) {
		return dao.findOne(codigo);
	}
	
	public List<Empresa> getAll(){
		return dao.findAll();
	}
	
	
	
	
	
	
	
	
	

}
