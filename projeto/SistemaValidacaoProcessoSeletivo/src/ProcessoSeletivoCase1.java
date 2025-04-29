public class ProcessoSeletivoCase1 {
        public static void main(String[] args) {
            System.out.println("Processo Seletivo");
            double alex = 1500.0;
            analisarCandidato(2222.0);
            analisarCandidato(2000.0);
            analisarCandidato(1900.0);
            analisarCandidato(alex);
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
