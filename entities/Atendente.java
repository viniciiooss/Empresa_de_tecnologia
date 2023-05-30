package entities;

public class Atendente {
	    private String nome;
	    private int chamadosAtendidos;
	    private int tempoTotalAtendimento;

	    public Atendente(String nome) {
	        this.nome = nome;
	        this.chamadosAtendidos = 0;
	        this.tempoTotalAtendimento = 0;
	        
	    }

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getChamadosAtendidos() {
			return chamadosAtendidos;
		}

		public void setChamadosAtendidos(int chamadosAtendidos) {
			this.chamadosAtendidos = chamadosAtendidos;
		}

		public int getTempoTotalAtendimento() {
			return tempoTotalAtendimento;
		}

		public void setTempoTotalAtendimento(int tempoTotalAtendimento) {
			this.tempoTotalAtendimento = tempoTotalAtendimento;
		}
		 public void atenderChamado(Chamado chamado) {
		        System.out.println("Atendente " + nome + " está atendendo o chamado #" + chamado.getId() + ": " + chamado.getDescricao());
		        
		        int tempoAtendimento = (int) (Math.random() * 10) + 1;
		        tempoTotalAtendimento += tempoAtendimento;

		        System.out.println("Tempo de atendimento: " + tempoAtendimento + " minutos");
		        chamadosAtendidos++;

		    }
		}

