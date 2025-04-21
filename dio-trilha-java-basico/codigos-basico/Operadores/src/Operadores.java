public class Operadores {
    public static void main(String[] args) throws Exception {
        int numero = 5;
        System.out.println("Operadores Aritmeticos");
        System.out.println("\n");
        System.out.println("Incrementar numero");
        numero = -numero; // mudando o valor para negativo
        numero = numero * -1;// usando a multiplicação para colocar o valor positivo multiplicando por -1
        numero = numero + 1; // incrementar mais um numero.
        numero++; //representa a mesma coisa numero = numero + 1
        numero += 3; // representar incrementação tabem
        System.out.println(numero);
        System.out.println("\n");
        System.out.println("Concatenar");
        // em java o "+" se estiver junto com um tipo string ele ira concatenar
        String nomeCompleto = "Jose " + "Vinicius";
        System.out.println(nomeCompleto);
        System.out.println("\n");
        System.out.println("Decrementar numero");
        // decremantando numero
        double decrementando_diminuicao = 15;
        decrementando_diminuicao = decrementando_diminuicao - 2;
        decrementando_diminuicao--;
        decrementando_diminuicao -= 2;
        System.out.println(decrementando_diminuicao);
        // invertando o valor da variavel boolean
        boolean EstouCerto = true ;
        System.out.println("\n");
        System.out.println("Inverter valor Boolean");
        //forma de inverter um valor boolean
        EstouCerto = !EstouCerto; // Aqui estamos reatribuindo a variavel para false
        EstouCerto = !EstouCerto;// se colocarmos de nova mudamos a variavel para true
        System.out.println(EstouCerto);
        System.out.println("\n");
        System.out.println("Operador Ternario");
        //Operador Ternario
        System.out.println("Operacao normal");
        //Operação normal
        int a , b;
        a = 5;
        b = 6 ;

        String resultado;
        if(a == b){
            resultado = "verdadeiro";
        }else{
            resultado = "falso" ;
        }
        System.out.println(resultado);

        //Operação ternario
        System.out.println("Operacao Ternario");
        // para usar o operador ternario sempre vamos usar uma operação boolean  que retorner true ou false
        int n1 = 4;
        int n2 = 4;
        String resultado2 = n1==n2 ?"verdadeiro" : "falso";
        System.out.println(resultado2);
        System.out.println("\n");
        //Operadores Relacionais
        System.out.println("Operadores Relacionais");
        int variavel1 = 1;
        int variavel2 = 2;
        boolean simNao = variavel1 == variavel2; // se a variavel1 e igual a variavel2
        System.out.println(" a variavel1 e igual a variavel2 : " + simNao);
        simNao = variavel1 != variavel2; // se a variavel1 e diferente da variavel2
        System.out.println(" a variavel1 e diferente da variavel2 :" + simNao);
        simNao = variavel1 > variavel2;//a variavel1 e maior que a variavel2
        System.out.println("a variavel1 e maior que a variavel2 : " + simNao);
        
        System.out.println("\n");
        System.out.println("Operadores Logicos");
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && (7 > 4) ){
            System.out.println("As duas sao verdadeiras");
        }
        if(condicao1 || condicao2){
            System.out.println("Uma das condicoes e verdadeira");
        }
    }
}
