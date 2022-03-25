package es.spring.udemy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import es.spring.modelo.Usuario;

@Controller
@RequestMapping("/app")
public class controladorIndex {
	@GetMapping({"/index", "/", "/home"})
	public String index(Model model) {
		model.addAttribute("titulo", "Hola Spring Framework");
		return "index";
	}
	
	@GetMapping("/error")
	public String error(Model model) {
		model.addAttribute("titulo", "Adios Spring Framework");
		return "error";
	}
	
	@GetMapping("/prueba")
	public String prueba(Model model) {
		model.addAttribute("titulo", "Adios Spring Framework");
		return "prueba";
	}
	
	@RequestMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Guillermo");
		usuario.setApellido("Illera");
		usuario.setEmail("g@g.com"); 
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Perfil del usuario: ".concat(usuario.getNombre()));
		return "perfil";
	}
	
	@RequestMapping("/listar")
	public String listar(Model model) {
		return "listar";
	}
	
	@ModelAttribute("usuarios")
	public List<Usuario> poblarUsuarios(){
		List<Usuario> usuarios = Arrays.asList(new Usuario("Guillermazo", "Illera", "a@a.com"), 
				new Usuario("Janaza", "Blers", "b@b.com"));
		return usuarios;
	}
	
}
