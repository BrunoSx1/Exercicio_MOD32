/**
 * 
 */
package br.com.rpires.dao;

import java.util.List;

import br.com.rpires.domain.Produto;

/**
 * @author rodrigo.pires
 *
 */
public interface IProdutoDAO {

	public Produto cadastrar(Produto produto);

	public void excluir(Produto produto);

	public List<Produto> buscarTodos();
}
