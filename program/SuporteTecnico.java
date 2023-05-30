package program;

import java.util.LinkedList;
import java.util.Queue;


import entities.Atendente;
import entities.Chamado;

public class SuporteTecnico {
	    private Queue<Chamado> filaChamados;
	    private Atendente[] atendentes;

	    public SuporteTecnico(int numAtendentes) {
	        filaChamados = new LinkedList<>();
	        atendentes = new Atendente[numAtendentes];

	        for (int i = 0; i < numAtendentes; i++) {
	            atendentes[i] = new Atendente("Atendente " + (i + 1));
	        }
	    }

	    public void abrirChamado(Chamado chamado) {
	        filaChamados.offer(chamado);
	        System.out.println("Chamado #" + chamado.getId() + " aberto: " + chamado.getDescricao());
	    }

	    public void atenderChamados() {
	        while (!filaChamados.isEmpty()) {
	            Chamado chamado = filaChamados.poll();
	            Atendente atendente = selecionarAtendente(chamado.requerAtendimentoEspecializado());

	            if (atendente != null) {
	                atendente.atenderChamado(chamado);
	            } else {
	                System.out.println("Nenhum atendente disponível no momento para o chamado #" + chamado.getId() +
	                        ": " + chamado.getDescricao());
	                filaChamados.offer(chamado); 
	                break; 
	            }
	        }
	    }

	    private Atendente selecionarAtendente(boolean requerAtendimentoEspecializado) {
	        for (Atendente atendente : atendentes) {
	            if (requerAtendimentoEspecializado && atendente.getChamadosAtendidos() == 0) {
	                
	                return atendente;
	            } else if (!requerAtendimentoEspecializado && atendente.getChamadosAtendidos() > 0) {
	                
	                return atendente;
	            }
	        }

	        return null; 
	    }

	    public double calcularTempoMedioAtendimento() {
	        int totalAtendimentos = 0;
	        int totalTempoAtendimento = 0;

	        for (Atendente atendente : atendentes) {
	            totalAtendimentos += atendente.getChamadosAtendidos();
	            totalTempoAtendimento += atendente.getTempoTotalAtendimento();
	        }

	        if (totalAtendimentos > 0) {
	            return (double) totalTempoAtendimento / totalAtendimentos;
	        } else {
	            return 0;
	        }
	    }
	}

