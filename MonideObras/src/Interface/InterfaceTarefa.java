package Interface;

import Entidades.Engenheiro;

public interface InterfaceTarefa {

	int getId();
    String getDescricao();
    String getStatus(); 
    Engenheiro getResponsavel();
    
    void setDescricao(String descricao);
    void setStatus(String status);
    void setResponsavel(Engenheiro engenheiro);

}

