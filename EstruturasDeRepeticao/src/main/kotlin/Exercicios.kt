fun main(){

    /*
    Uma empresa desenvolveu uma pesquisa para saber as características
    psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
    era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
    (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
    agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
    pessoas, calcule e mostre: (WHILE)
    o número de pessoas calmas;
    o número de mulheres nervosas;
    o número de homens agressivos;
    o número de outros calmos;
    o número de pessoas nervosas com mais de 40 anos;
    o número de pessoas calmas com menos de 18 anos.
     */

    /*
    var cont = 0
    var idade = 0
    var sexo = 0
    var opcao = 0
    var pCalmas = 0
    var mNerv = 0
    var hAgr = 0
    var outCalmos = 0
    var pNM40 = 0
    var pCM18 = 0

    while (cont < 6){

        println("***Pessoa ${cont + 1}***")

        println("Digite a idade: ")
        idade = readln().toInt()

        println("Digite o sexo (1-feminino / 2-masculino / 3-Outros): ")
        sexo = readln().toInt()

        println("Digite o comportamento " +
                "\n(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era\n" +
                "    agressiva)")
        opcao = readln().toInt()

        if(opcao == 1){
            pCalmas++
        }

        if(sexo == 1 && opcao == 2){
            mNerv++
        }

        if(sexo == 2 && opcao == 3){
            hAgr++
        }

        if(sexo == 3 && opcao == 1){
            outCalmos++
        }

        if(opcao == 2 && idade > 40){
            pNM40++
        }

        if(opcao == 1 && idade < 18){
            pCM18++
        }

        cont++
    }
    /*
    o número de pessoas calmas;
    o número de mulheres nervosas;
    o número de homens agressivos;
    o número de outros calmos;
    o número de pessoas nervosas com mais de 40 anos;
    o número de pessoas calmas com menos de 18 anos.
     */
    println("o número de pessoas calmas: $pCalmas")
    println("o número de mulheres nervosas: $mNerv")
    println("o número de homens agressivos: $hAgr")
    println("o número de outros calmos: $outCalmos")
    println("o número de pessoas nervosas com mais de 40 anos: $pNM40")
    println("o número de pessoas calmas com menos de 18 anos: $pCM18")
     */

    /*
    Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
    21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
    idade for =-99. (WHILE)
     */
    /*
    var idade = 0
    var p21 = 0
    var p50 = 0

    while (idade != -99){

        print("Digite uma idade: ")
        idade = readln().toInt()

        if(idade != -99){
            if(idade < 21){
                p21++
            }else if (idade > 50){
                p50++
            }
        }
    }

    println("O número de pessoas menores de 21 anos de idade é $p21")
    println("O número de pessoas maiores de 50 anos de idade é $p50")
     */

    /*
    Escrever um programa que receba vários números inteiros no teclado. E no
    final imprimir a média dos números múltiplos de 3. Para sair digitar
    0(zero).(DO...WHILE)
     */

    var soma = 0.0
    var cont = 0

    do{

        print("Digite um número: ")
        val num = readln().toInt()

        if(num % 3 == 0 && num != 0){
            soma += num
            cont++
        }

    }while (num != 0)

    val media = soma / cont

    println("A soma de todos os números múltiplos de 3 digitados é: $soma" +
            " e a média desses números é: $media")

}