package program;

import entities.Chamado;

public class Main {

		    public static void main(String[] args) {
		        SuporteTecnico suporte = new SuporteTecnico(3);

		        
		        suporte.abrirChamado(new Chamado(1, "Problemas de conexão à internet", false));
		        suporte.abrirChamado(new Chamado(2, "Falha no sistema operacional", true));
		        suporte.abrirChamado(new Chamado(3, "Problemas com o hardware", false));
		        suporte.abrirChamado(new Chamado(4, "Configuração de rede", false));

		        
		        suporte.atenderChamados();

		        
		        double tempoMedio = suporte.calcularTempoMedioAtendimento();
		        System.out.println("Tempo médio de atendimento: " + tempoMedio + " minutos");
		    }
		}

	
