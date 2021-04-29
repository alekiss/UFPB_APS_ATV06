package br.ufpb.dcx.aps.atividades.atv06;

import java.util.LinkedList;
import java.util.List;

public class Resultado {
    private boolean erro;
    private String msg;
    private List<String> mensagens = new LinkedList<>();

    public Resultado() {

        this.msg = "";
        this.erro = false;
    }

    public Resultado(boolean erro) {
        this.erro = erro;
        this.msg = "";
    }
    public Resultado(boolean erro, String msg) {
        this.erro = erro;
        this.msg = msg;
    }
    public void addMensagem(String msg){
        mensagens.add(msg);

    }
    public void setErro(boolean erro) {

        this.erro = erro;
    }

    public List<String> getMensagens(){

        return mensagens;
    }

    public boolean isErro(){
        if(this.erro == true){
            return true;
        }
        return false;
    }
}
