import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Emprestimo {

	Date dataEmprestimo = new Date();
	/*metodo para gegar a variavel dataEmprestimo*/
	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}

	/*metodo para setar a variavel dataEmprestimo*/
	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	/*utilize essas v�riaveis para calcular a data final de devolu��o*/
    Date dataPrevista = new Date();
	Date data_aux = new Date();
	String nome;

        /*Cada Emprestimo � composto de v�rios itens*/
	List<Item> i = new ArrayList<Item>();
	
        //Metodo respons�vel por calcular a data de devolu��o
	public Date CalculaDataDevolucao() {   
		Date data_atual = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(data_atual);

		for(int j = 0; j < i.size(); j++) {
			if (j == 0) {
				dataPrevista = i.get(j).calculaDataDevolucao(data_atual);
			}
			else {
				data_aux = i.get(j).calculaDataDevolucao(data_atual);
				if (data_aux.getTime() > dataPrevista.getTime()) {
					dataPrevista = data_aux;
				}
			}
		}
		
		return dataPrevista;
	}
}