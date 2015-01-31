import br.com.issuenet.model.Manager;
import br.com.issuenet.model.NaoPodeGerenciar;
import br.com.issuenet.model.PodeResolverTarefa;
import br.com.issuenet.model.Usuario;


public class CriaUsuarioTest {

	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		
		usuario.setNome("Vicente");
		usuario.setEmail("vgsfilho@yahoo.com.br");
		usuario.setMatricula("234");
		usuario.setPerfil("Aluno");
		usuario.setSenha("123");
		usuario.setComportamentoGerenciador(new NaoPodeGerenciar());
		usuario.setComportamentoResolvedor(new PodeResolverTarefa());
		
	    System.out.println(Manager.salvarUsuario(usuario));		

	}

}
