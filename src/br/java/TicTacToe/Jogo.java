package br.java.TicTacToe;

import java.util.Scanner;

public class Jogo {
    public static void jogar(){
        //Criação da Matriz
        String tab [][] = {{"1","2","3"}, {"4","5","6"}, {"7","8","9"}};
        String player1;
        String player2;
        //objeto de input player 1
        Scanner sc = new Scanner(System.in);
        //objeto de input player 2
        Scanner sca = new Scanner(System.in);
        //Variavel para marcar o X na matriz
        String pl1="X";
        //Variavel para marcar o O na matriz
        String pl2="O";
        //Variavel para tratamento de Input
        boolean cond;
        //Varivel para contar se deu jogo (Linha ou Coluna)
        int contl,contc;



        //Printar o jogo da velha na tela
        System.out.print("---Jogo da Velha---");
        System.out.print("\n     "+tab[0][0]+"  |"+"  " + tab[0][1]+"  |"+" "+tab[0][2]);
        System.out.print("\n"+"    --------------");
        System.out.print("\n     "+tab[1][0]+"  |"+"  " +tab[1][1]+"  |"+" "+tab[1][2]);
        System.out.print("\n"+"    --------------");
        System.out.print("\n     "+tab[2][0]+"  |"+"  " +tab[2][1]+"  |"+" "+tab[2][2]);

        //Laço de jogadas
        jogadas: //labeled break
        for(int i=1;i<=9;i++){


            if((i%2)!= 0) {
                cond=true;
                do{//laço para tratamento de input
                    System.out.print("\n" + "Escolha aonde marcar o X: ");
                    player1 = sc.next();


                    //Condição para alimentar o jogo da velha
                    for (int l = 0; l <= 2; l++) {
                        for (int k = 0; k <= 2; k++) {
                            if (tab[l][k].equals(player1)) { /* busca para encontrar a linha e coluna na matriz e marcar */
                                tab[l][k] = pl1;
                                cond = false;
                            }
                        }
                    }
                    if(cond==true){
                        System.out.print("Numero digitado não encontrado ou incorreto\n");
                    }
                    //Printar o jogo da velha na tela a cada jogada
                    System.out.print("---Jogo da Velha---");
                    System.out.print("\n     "+tab[0][0]+"  |"+"  " + tab[0][1]+"  |"+" "+tab[0][2]);
                    System.out.print("\n"+"    --------------");
                    System.out.print("\n     "+tab[1][0]+"  |"+"  " +tab[1][1]+"  |"+" "+tab[1][2]);
                    System.out.print("\n"+"    --------------");
                    System.out.print("\n     "+tab[2][0]+"  |"+"  " +tab[2][1]+"  |"+" "+tab[2][2]);
                } while(cond);

            }

            if((i%2)== 0){
                cond = true;
                do {
                    System.out.print("\n" + "Escolha aonde marcar o O: ");
                    player2 = sca.next();


                    //Condição para alimentar o jogo da velha
                    for (int l = 0; l <= 2; l++) {
                        for (int k = 0; k <= 2; k++) {
                            if (tab[l][k].equals(player2)) { /* busca para encontrar a linha e coluna na matriz e marcar */
                                tab[l][k] = pl2;
                                cond = false;
                            }

                        }
                    }
                    if(cond==true){
                        System.out.print("Numero digitado não encontrado ou incorreto\n");
                    }
                    //Printar o jogo da velha na tela a cada jogada
                    System.out.print("---Jogo da Velha---");
                    System.out.print("\n     "+tab[0][0]+"  |"+"  " + tab[0][1]+"  |"+" "+tab[0][2]);
                    System.out.print("\n"+"    --------------");
                    System.out.print("\n     "+tab[1][0]+"  |"+"  " +tab[1][1]+"  |"+" "+tab[1][2]);
                    System.out.print("\n"+"    --------------");
                    System.out.print("\n     "+tab[2][0]+"  |"+"  " +tab[2][1]+"  |"+" "+tab[2][2]);
                }while(cond);
            }

            //Verificação Linha

            for (int l = 0; l <= 2; l++) {
                contl=0;
                for (int k = 0; k <= 1; k++) {
                    if (tab[l][k].equals(tab[l][k+1])){
                        contl++;
                        if(contl==2){
                            System.out.print("\n  LINHA COMPLETADA");
                            break jogadas;
                        }
                    }

                }
            }

            //Verificacao coluna

            for (int l = 0; l <= 2; l++) {
                contc=0;
                for (int k = 0; k <= 1; k++) {
                    if (tab[k][l].equals(tab[k+1][l])){
                        contc++;
                        if(contc==2){
                            System.out.print("\n  COLUNA COMPLETADA");
                            break jogadas;
                        }
                    }

                }
            }

            if(i == 9){
                System.out.println("\n  DEU VELHA!!!");
            }

        }

    }
}
