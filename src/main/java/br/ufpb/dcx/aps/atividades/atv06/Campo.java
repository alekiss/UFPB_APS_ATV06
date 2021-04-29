package br.ufpb.dcx.aps.atividades.atv06;

public class Campo {

        private String id;
        private String nome;
        private String valor;
        private boolean obrigatorio;

        public Campo(String id, String nome) {
            this.id = id;
            this.nome = nome;
            this.valor = "";
            this.obrigatorio = false;
        }

        public Campo(String id) {

            this.id = id;
            this.nome = "";
            this.valor = "";
            this.obrigatorio = false;
        }
        public Campo(String id, boolean obrigatorio){
            this(id);
            this.obrigatorio = obrigatorio;
            this.nome = "";
            this.valor = "";

        }
        public Campo(String id, boolean obrigatorio, String nome){
            this(id);
            this.obrigatorio = obrigatorio;
            this.nome = nome;
            this.valor = "";
        }

        public String getId() {

            return id;
        }

        public String getNome() {

            return nome;
        }

        public void setNome(String nome) {

            this.nome = nome;
        }
        public void setValor(String valor){

            this.valor = valor;
        }
        public String getValor(){

            return valor;
        }
        public boolean isPreenchido(){
            if(getValor() == ""){
                return false;
            }
            return true;
        }

        public boolean isObrigatorio(){
           if (obrigatorio == false){
               return false;
           }
           return true;
        }

        public Resultado validar() {
            Resultado resultado = new Resultado();
            if (this.obrigatorio && !this.isPreenchido()){
                resultado.setErro(true);
                resultado.addMensagem("Este campo é obrigatório e não foi preenchido");
            }
            return resultado;
        }

        public void setObrigatorio(boolean obrigatorio) {
            this.obrigatorio = obrigatorio;
         }


}


