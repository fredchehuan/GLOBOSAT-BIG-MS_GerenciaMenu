package repositorios;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.mongodb.repository.Query;

import br.com.gsat.big.gerenciademenus.ENTIDADES.Menu;

public interface MenuRepositorio extends MongoRepository<Menu, String> {
	
	//@org.springframework.beans.factory.annotation.Autowired(required=true)
	public Menu findByTitulo(String titulo);
	
	/*@Query("{'menu_id':{}}");*/
	public List<Menu> findByMenuId(int menuId);

}
