import java.util.Calendar;
import java.util.Date;

public class Item {
   /*Cada Item � associado a um livro*/
	Livro livro;
    Date dataDevolucao;
 
    /*Constructor, quando uma instancia do item � criada
     * j� � associada a ela o livro*/
    public Item(Livro livro) {
		super();
		this.livro = livro;
	}
    
    /*M�todo getDataDevolucao*/
	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	/*M�todo setDataDevolucao*/
	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	
	/*M�todo getLivro*/
	public Livro getLivro() {
		return livro;
	}
	
	/*M�todo setLivro*/
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	public Date calculaDataDevolucao(Date data) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(data);
		calendar.add(Calendar.DATE, livro.verPrazo());
		dataDevolucao = calendar.getTime();
		return dataDevolucao;
	}
}
