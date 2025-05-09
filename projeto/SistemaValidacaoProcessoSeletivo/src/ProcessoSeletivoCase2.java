
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivoCase2 {
    

	public static void main(String[] args) {
		System.out.println("Processo Seletivo");
		selecaoCandidatos();
	}
	static void selecaoCandidatos() {
		String [] candidatos = {"FELIPE" , "MARIA","JULIA","PAULO","AUGUSTO" , "MONICA" , "FABRICIO","MIRELA","DANIELA" , "JORGE"};
		
		int candidatosSelecionados = 0 ;
		int candidatoAtual = 0 ;
		double salarioBase = 2000.0 ;
		
		while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length ) {
			
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			System.out.println("O candidato " + candidato + " Solicitou este valor de salario" + salarioPretendido );
			
			if(salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
				candidatosSelecionados += 1 ;
			}
			candidatoAtual++ ;
		}
		
	}
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800 , 2200);
	}
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		
		if(salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		}else if(salarioBase == salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
		}else {
			System.out.println("AGUARDANDO RESULTADO DEMAIS CANDIDATOS");
		}
		
	}
}

