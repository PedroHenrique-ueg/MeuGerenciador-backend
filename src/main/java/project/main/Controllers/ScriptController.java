package project.main.Controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import project.main.Models.ScriptModel;
import project.main.Repositories.ScriptRepository;

@RestController
@RequestMapping("/script")
public class ScriptController {
	
	//Injeção da repository dentro co controller
	@Autowired
	private ScriptRepository scriptRep;
	
	
	//Metodo Para criar um novo ticket
	@PostMapping
	@RequestMapping("/novo")
	public ScriptModel CriarNovo(@RequestBody @Valid ScriptModel script) {
		
		return scriptRep.save(script);
	}
	
	
	//Metodo para Alterar um Script existente
	@PutMapping
	@RequestMapping("/alterar")
	public ScriptModel AlterarScript(@RequestBody @Valid ScriptModel script) {
		
		return scriptRep.save(script);
	}
	
	//Metodo para deletar um script existente
	@DeleteMapping
	@RequestMapping("/deletar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void DeletarScript(@PathVariable long id) {
				
		scriptRep.deleteById(id);
	}
	
	
	
	//Metodo para buscar script pela id
	@GetMapping
	@RequestMapping("/detallhes{id}")
	public ScriptModel BucarPorId(@PathVariable long id) {
		
		return scriptRep.findById(id);
	}
	
	
	//Listar Todos os Scripts no banco de dados
	@GetMapping
	@RequestMapping("/listar")
	public List<ScriptModel> ListarScripts(){
		
		return scriptRep.findAll();
	}
	
	
	
}
