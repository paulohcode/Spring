package br.com.alfa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.alfa.model.Empresa;
import br.com.alfa.service.EmpresaService;
import br.com.alfa.util.CustomResponse;

@RestController
@RequestMapping(value = "/empresas")
public class EmpresaController {
	
	@Autowired
	EmpresaService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Empresa> empresaAll(){
		List<Empresa> listaEmpresas = service.getAll();
		return listaEmpresas;
	}
	
	
	@RequestMapping(value = "/{codigo}", method = RequestMethod.GET)
	public Empresa empresaGet(@PathVariable Long codigo) {
		return service.getById(codigo);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<CustomResponse> empresaPost(@RequestBody Empresa empresa){ 
		service.salvar(empresa);
		
		return new ResponseEntity<CustomResponse>(
				new CustomResponse(
						"Registro inserido com sucesso!", 
						true), HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<CustomResponse> empresaPut(@RequestBody Empresa empresa){
		service.salvar(empresa);
		
		return new ResponseEntity<CustomResponse>(
				new CustomResponse(
						"Registro atualizado com sucesso!", 
						true), HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/{codigo}", method = RequestMethod.DELETE)
	public ResponseEntity<CustomResponse> empresaDelete(@PathVariable Long codigo){
		service.deletar(codigo);
		
		return new ResponseEntity<CustomResponse>(
				new CustomResponse(
						"Registro apagado com sucesso!", 
						true), HttpStatus.OK);
	}	
	
	
	
	
	

}
