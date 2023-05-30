package entities;

	

	public class Chamado {
	    private int id;
	    private String descricao;
	    private boolean requerAtendimentoEspecializado;

	    public Chamado(int id, String descricao, boolean requerAtendimentoEspecializado) {
	        this.id = id;
	        this.descricao = descricao;
	        this.requerAtendimentoEspecializado = requerAtendimentoEspecializado;
	    }

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		public boolean requerAtendimentoEspecializado() {
	        return requerAtendimentoEspecializado;

	   
	}
	}

