package Interface;

import java.util.List;
import Entidades.Engenheiro;
import Entidades.Tarefa;

public interface InterfaceObra {

	int getId();
    String getNome();
    String getEndereco();
    Engenheiro getEngenheiroResponsavel();
    List<Tarefa> getTarefas();
    
    void setNome(String nome);
    void setEndereco(String endereco);
    void setEngenheiroResponsavel(Engenheiro engenheiro);
    void addTarefa(Tarefa tarefa);
}

