//Creators: Pedro Augusto Martins G. and Vinicius P. Vieira
//Date: 09/11/2020
//From high school students 
//[Full Code] Noughts and Crosses/Jogo da Velha/Tic-Tac-Toe


import java.util.Scanner;
public class Velha{
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		String[][] tab = new String[4][4]; //tabuleiro 3 por 3 // board 3x3
		int i =0;
		
		tab[1][1]="7"; 
		tab[1][2]="8";
		tab[1][3]="9";
		tab[2][1]="4";
		tab[2][2]="5";
		tab[2][3]="6";
		tab[3][1]="1";
		tab[3][2]="2";
		tab[3][3]="3";
		
		System.out.print("Insira o nome do jogador 1: "); //Enter the name of the first player
		
		String p1 = s.nextLine(); //player 1 uses 'X'
		
		System.out.print("Insira o nome do jogador 2: "); //Enter the name of the second player
		String p2 = s.nextLine(); //player 2 uses 'O'
		
		boolean flag =true;
		while(flag) { //Esse while é um loop infinito, temos System.exit (0) para parar o codigo // This while is an infinite loop, we have System.exit (0) to finalize the code
			i++;
			
			System.out.println("      +---+---+---+");
			System.out.println("      | " + tab[1][1] + " | " + tab[1][2] + " | " + tab[1][3] + " |");
			System.out.println("      +---+---+---+");
			System.out.println("      | " + tab[2][1] + " | " + tab[2][2] + " | " + tab[2][3] + " |");
			System.out.println("      +---+---+---+");
			System.out.println("      | " + tab[3][1] + " | " + tab[3][2] + " | " + tab[3][3] + " |");
			System.out.println("      +---+---+---+");
			
			System.out.print("Jogador 1," + p1 + ",digite o quadrante desejado: "); //Player 1, "name", enter the first quadrant
			int q = s.nextInt();
			
			
			//verificador p1
			switch(q){
				case 1:
				if ((tab[3][1]=="O") || (tab[3][1]=="X")) {
					System.out.println("Quadrante repetido, perdeu a vez, preste mais atencao"); //Quadrant is already typed, you missed your turn, pay attention
					break;
					}else{
					tab[3][1]="X";
					break;
				}
				case 2:
				if ((tab[3][2]=="O") || (tab[3][2]=="X")) {
					System.out.println("Quadrante repetido, perdeu a vez, preste mais atencao");
					break;
					}else{
					tab[3][2]="X";
					break;
				}
				case 3:
				if ((tab[3][3]=="O") || (tab[3][3]=="X")) {
					System.out.println("Quadrante repetido, perdeu a vez, preste mais atencao");
					break;
					}else{
					tab[3][3]="X";
					break;
				}
				case 4:
				if ((tab[2][1]=="O") || (tab[2][1]=="X")) {
					System.out.println("Quadrante repetido, perdeu a vez, preste mais atencao");
					break;
					}else{
					tab[2][1]="X";
					break;
				}
				case 5:
				if ((tab[2][2]=="O") || (tab[2][2]=="X")) {
					System.out.println("Quadrante repetido, perdeu a vez, preste mais atencao");
					break;
					}else{
					tab[2][2]="X";
					break;
				}
				case 6:
				if ((tab[2][3]=="O") || (tab[2][3]=="X")) {
					System.out.println("Quadrante repetido, perdeu a vez, preste mais atencao");
					break;
					}else{
					tab[2][3]="X";
					break;
				}
				case 7:
				if ((tab[1][1]=="O") || (tab[1][1]=="X")) {
					System.out.println("Quadrante repetido, perdeu a vez, preste mais atencao");
					break;
					}else{
					tab[1][1]="X"; 
					break;
				}
				case 8:
				if ((tab[1][2]=="O") || (tab[1][2]=="X")) {
					System.out.println("Quadrante repetido, perdeu a vez, preste mais atencao");
					break;
					}else{
					tab[1][2]="X";
					break;
				}
				case 9:
				if ((tab[1][3]=="O") || (tab[1][3]=="X")) {
					System.out.println("Quadrante repetido, perdeu a vez, preste mais atencao");
					break;
					}else{
					tab[1][3]="X";
					break;
				}
				default:
				
				System.out.println("Quadrante invalido, perdeu a vez,  preste mais atencao"); //Quadrant does not exist, you missed your turn, pay attention
				break;
			}
			//empate p1 //draw player1
			int cont=0;
			for (int x=0;x<4;x++) {
				for (int w=0;w<4;w++) {
					if (tab[x][w] == "X" || tab[x][w] == "O") {
						cont++;
					}
				}
			}
			if(cont==9){
				System.out.println("Deu velha"); //No one won
				System.out.println();
				System.out.println("      +---+---+---+");
				System.out.println("      | " + tab[1][1] + " | " + tab[1][2] + " | " + tab[1][3] + " |");
				System.out.println("      +---+---+---+");
				System.out.println("      | " + tab[2][1] + " | " + tab[2][2] + " | " + tab[2][3] + " |");
				System.out.println("      +---+---+---+");
				System.out.println("      | " + tab[3][1] + " | " + tab[3][2] + " | " + tab[3][3] + " |");
				System.out.println("      +---+---+---+");
				System.exit(0);
			}
			
			//quem ganhou
			if (tab[3][1] == "X" && tab[3][2] == "X" && tab[3][3] == "X") {
				System.out.println("Jogador 1," + p1 + " ganhou!"); //Player 1 won
				System.out.println();
				System.out.println("      +---+---+---+");
				System.out.println("      | " + tab[1][1] + " | " + tab[1][2] + " | " + tab[1][3] + " |");
				System.out.println("      +---+---+---+");
				System.out.println("      | " + tab[2][1] + " | " + tab[2][2] + " | " + tab[2][3] + " |");
				System.out.println("      +---+---+---+");
				System.out.println("      | " + tab[3][1] + " | " + tab[3][2] + " | " + tab[3][3] + " |");
				System.out.println("      +---+---+---+");
				System.exit(0);
			}
			if (tab[2][1] == "X" && tab[2][2] == "X" && tab[2][3] == "X") {
				System.out.println("Jogador 1," + p1 + " ganhou!");
				System.out.println();
				System.out.println("      +---+---+---+");
				System.out.println("      | " + tab[1][1] + " | " + tab[1][2] + " | " + tab[1][3] + " |");
				System.out.println("      +---+---+---+");
				System.out.println("      | " + tab[2][1] + " | " + tab[2][2] + " | " + tab[2][3] + " |");
				System.out.println("      +---+---+---+");
				System.out.println("      | " + tab[3][1] + " | " + tab[3][2] + " | " + tab[3][3] + " |");
				System.out.println("      +---+---+---+");
				System.exit(0);
			}
			if (tab[1][1] == "X" && tab[1][2] == "X" && tab[1][3] == "X") {
				System.out.println("Jogador 1," + p1 + " ganhou!");
				System.out.println();
				System.out.println("      +---+---+---+");
				System.out.println("      | " + tab[1][1] + " | " + tab[1][2] + " | " + tab[1][3] + " |");
				System.out.println("      +---+---+---+");
				System.out.println("      | " + tab[2][1] + " | " + tab[2][2] + " | " + tab[2][3] + " |");
				System.out.println("      +---+---+---+");
				System.out.println("      | " + tab[3][1] + " | " + tab[3][2] + " | " + tab[3][3] + " |");
				System.out.println("      +---+---+---+");
				System.exit(0);
			}
			if (tab[1][1] == "X" && tab[2][1] == "X" && tab [3][1] == "X") { 
				System.out.println("Jogador 1," + p1 + " ganhou!");
				System.out.println();
				System.out.println("      +---+---+---+");
				System.out.println("      | " + tab[1][1] + " | " + tab[1][2] + " | " + tab[1][3] + " |");
				System.out.println("      +---+---+---+");
				System.out.println("      | " + tab[2][1] + " | " + tab[2][2] + " | " + tab[2][3] + " |");
				System.out.println("      +---+---+---+");
				System.out.println("      | " + tab[3][1] + " | " + tab[3][2] + " | " + tab[3][3] + " |");
				System.out.println("      +---+---+---+");
				System.exit(0);
			}
			if (tab[1][2] == "X" && tab[2][2] == "X" && tab[3][2] == "X") {
				System.out.println("Jogador 1," + p1 + " ganhou!");
				System.out.println();
				System.out.println("      +---+---+---+");
				System.out.println("      | " + tab[1][1] + " | " + tab[1][2] + " | " + tab[1][3] + " |");
				System.out.println("      +---+---+---+");
				System.out.println("      | " + tab[2][1] + " | " + tab[2][2] + " | " + tab[2][3] + " |");
				System.out.println("      +---+---+---+");
				System.out.println("      | " + tab[3][1] + " | " + tab[3][2] + " | " + tab[3][3] + " |");
				System.out.println("      +---+---+---+");
				System.exit(0);
			}
			if (tab[1][3] == "X" && tab[2][3] == "X" && tab[3][3] == "X") {
				System.out.println("Jogador 1," + p1 + " ganhou!");
				System.out.println();
				System.out.println("      +---+---+---+");
				System.out.println("      | " + tab[1][1] + " | " + tab[1][2] + " | " + tab[1][3] + " |");
				System.out.println("      +---+---+---+");
				System.out.println("      | " + tab[2][1] + " | " + tab[2][2] + " | " + tab[2][3] + " |");
				System.out.println("      +---+---+---+");
				System.out.println("      | " + tab[3][1] + " | " + tab[3][2] + " | " + tab[3][3] + " |");
				System.out.println("      +---+---+---+");
				System.exit(0);
			}
			if (tab[1][1] == "X" && tab[2][2] == "X" && tab[3][3] == "X") {
				System.out.println("Jogador 1," + p1 + " ganhou!");
				System.out.println();
				System.out.println("      +---+---+---+");
				System.out.println("      | " + tab[1][1] + " | " + tab[1][2] + " | " + tab[1][3] + " |");
				System.out.println("      +---+---+---+");
				System.out.println("      | " + tab[2][1] + " | " + tab[2][2] + " | " + tab[2][3] + " |");
				System.out.println("      +---+---+---+");
				System.out.println("      | " + tab[3][1] + " | " + tab[3][2] + " | " + tab[3][3] + " |");
				System.out.println("      +---+---+---+");
				System.exit(0);
			}
			if (tab[1][3] == "X" && tab[2][2] == "X" && tab[3][1] == "X") {
				System.out.println("Jogador 1," + p1 + " ganhou!");
				System.out.println();
				System.out.println("      +---+---+---+");
				System.out.println("      | " + tab[1][1] + " | " + tab[1][2] + " | " + tab[1][3] + " |");
				System.out.println("      +---+---+---+");
				System.out.println("      | " + tab[2][1] + " | " + tab[2][2] + " | " + tab[2][3] + " |");
				System.out.println("      +---+---+---+");
				System.out.println("      | " + tab[3][1] + " | " + tab[3][2] + " | " + tab[3][3] + " |");
				System.out.println("      +---+---+---+");
				System.exit(0);
			}
			
			// Player 2
			if (i!=5) {
				System.out.println("      +---+---+---+");
				System.out.println("      | " + tab[1][1] + " | " + tab[1][2] + " | " + tab[1][3] + " |");
				System.out.println("      +---+---+---+");
				System.out.println("      | " + tab[2][1] + " | " + tab[2][2] + " | " + tab[2][3] + " |");
				System.out.println("      +---+---+---+");
				System.out.println("      | " + tab[3][1] + " | " + tab[3][2] + " | " + tab[3][3] + " |");
				System.out.println("      +---+---+---+");
				
				System.out.print("Jogador 2," + p2 + ",digite o quadrante desejado: "); //Player 2, "name", enter the first quadrant
				q = s.nextInt();
				
				switch(q){
					case 1:
					if ((tab[3][1]=="O") || (tab[3][1]=="X")) {
						System.out.println("Quadrante repetido, perdeu a vez, preste mais atencao"); //Quadrant is already typed, you missed your turn, pay attention
						break;
						}else{
						tab[3][1]="O";
						break;
					}
					case 2:
					if ((tab[3][2]=="O") || (tab[3][2]=="X")) {
						System.out.println("Quadrante repetido, perdeu a vez, preste mais atencao");
						break;
						}else{
						tab[3][2]="O";
						break;
					}
					case 3:
					if ((tab[3][3]=="O") || (tab[3][3]=="X")) {
						System.out.println("Quadrante repetido, perdeu a vez, preste mais atencao");
						break;
						}else{
						tab[3][3]="O";
						break;
					}
					case 4:
					if ((tab[2][1]=="O") || (tab[2][1]=="X")) {
						System.out.println("Quadrante repetido, perdeu a vez, preste mais atencao");
						break;
						}else{
						tab[2][1]="O";
						break;
					}
					case 5:
					if ((tab[2][2]=="O") || (tab[2][2]=="X")) {
						System.out.println("Quadrante repetido, perdeu a vez, preste mais atencao");
						break;
						}else{
						tab[2][2]="O";
						break;
					}
					case 6:
					if ((tab[2][3]=="O") || (tab[2][3]=="X")) {
						System.out.println("Quadrante repetido, perdeu a vez, preste mais atencao");
						break;
						}else{
						tab[2][3]="O";
						break;
					}
					case 7:
					if ((tab[1][1]=="O") || (tab[1][1]=="X")) {
						System.out.println("Quadrante repetido, perdeu a vez, preste mais atencao");
						break;
						}else{
						tab[1][1]="O"; 
						break;
					}
					case 8:
					if ((tab[1][2]=="O") || (tab[1][2]=="X")) {
						System.out.println("Quadrante repetido, perdeu a vez, preste mais atencao");
						break;
						}else{
						tab[1][2]="O";
						break;
					}
					case 9:
					if ((tab[1][3]=="O") || (tab[1][3]=="X")) {
						System.out.println("Quadrante repetido, perdeu a vez, preste mais atencao");
						break;
						}else{
						tab[1][3]="O";
						break;
					}
					default:
					
					System.out.println("Quadrante invalido, perdeu a vez,  preste mais atencao"); //Quadrant does not exist, you missed your turn, pay attention
					break;
				}
				//empate p2 //draw player 2
				cont=0;
				for (int x=0;x<4;x++) {
					for (int w=0;w<4;w++) {
						if (tab[x][w] == "X" || tab[x][w] == "O") {
							cont++;
						}
					}
				}
				if(cont==9){
					System.out.println("Deu velha"); //No one has won
					System.out.println();
					System.out.println("      +---+---+---+");
					System.out.println("      | " + tab[1][1] + " | " + tab[1][2] + " | " + tab[1][3] + " |");
					System.out.println("      +---+---+---+");
					System.out.println("      | " + tab[2][1] + " | " + tab[2][2] + " | " + tab[2][3] + " |");
					System.out.println("      +---+---+---+");
					System.out.println("      | " + tab[3][1] + " | " + tab[3][2] + " | " + tab[3][3] + " |");
					System.out.println("      +---+---+---+");
					System.exit(0);
				}
				if (tab[3][1] == "o" && tab[3][2] == "o" && tab[3][3] == "o") {
					System.out.println("Jogador 2," + p2 + " ganhou!"); //Player 2 won
					System.out.println();
					System.out.println("      +---+---+---+");
					System.out.println("      | " + tab[1][1] + " | " + tab[1][2] + " | " + tab[1][3] + " |");
					System.out.println("      +---+---+---+");
					System.out.println("      | " + tab[2][1] + " | " + tab[2][2] + " | " + tab[2][3] + " |");
					System.out.println("      +---+---+---+");
					System.out.println("      | " + tab[3][1] + " | " + tab[3][2] + " | " + tab[3][3] + " |");
					System.out.println("      +---+---+---+");
					System.exit(0);
				}
				if (tab[2][1] == "o" && tab[2][2] == "o" && tab[2][3] == "o") {
					System.out.println("Jogador 2," + p2 + " ganhou!");
					System.out.println();
					System.out.println("      +---+---+---+");
					System.out.println("      | " + tab[1][1] + " | " + tab[1][2] + " | " + tab[1][3] + " |");
					System.out.println("      +---+---+---+");
					System.out.println("      | " + tab[2][1] + " | " + tab[2][2] + " | " + tab[2][3] + " |");
					System.out.println("      +---+---+---+");
					System.out.println("      | " + tab[3][1] + " | " + tab[3][2] + " | " + tab[3][3] + " |");
					System.out.println("      +---+---+---+");
					System.exit(0);
				}
				if (tab[1][1] == "o" && tab[1][2] == "o" && tab[1][3] == "o") {
					System.out.println("Jogador 2," + p2 + " ganhou!");
					System.out.println();
					System.out.println("      +---+---+---+");
					System.out.println("      | " + tab[1][1] + " | " + tab[1][2] + " | " + tab[1][3] + " |");
					System.out.println("      +---+---+---+");
					System.out.println("      | " + tab[2][1] + " | " + tab[2][2] + " | " + tab[2][3] + " |");
					System.out.println("      +---+---+---+");
					System.out.println("      | " + tab[3][1] + " | " + tab[3][2] + " | " + tab[3][3] + " |");
					System.out.println("      +---+---+---+");
					System.exit(0);
				}
				if (tab[1][1] == "o" && tab[2][1] == "o" && tab [3][1] == "o") { 
					System.out.println("Jogador 2," + p2 + " ganhou!");
					System.out.println();
					System.out.println("      +---+---+---+");
					System.out.println("      | " + tab[1][1] + " | " + tab[1][2] + " | " + tab[1][3] + " |");
					System.out.println("      +---+---+---+");
					System.out.println("      | " + tab[2][1] + " | " + tab[2][2] + " | " + tab[2][3] + " |");
					System.out.println("      +---+---+---+");
					System.out.println("      | " + tab[3][1] + " | " + tab[3][2] + " | " + tab[3][3] + " |");
					System.out.println("      +---+---+---+");
					System.exit(0);
				}
				if (tab[1][2] == "o" && tab[2][2] == "o" && tab[3][2] == "o") {
					System.out.println("Jogador 2," + p2 + " ganhou!");
					System.out.println();
					System.out.println("      +---+---+---+");
					System.out.println("      | " + tab[1][1] + " | " + tab[1][2] + " | " + tab[1][3] + " |");
					System.out.println("      +---+---+---+");
					System.out.println("      | " + tab[2][1] + " | " + tab[2][2] + " | " + tab[2][3] + " |");
					System.out.println("      +---+---+---+");
					System.out.println("      | " + tab[3][1] + " | " + tab[3][2] + " | " + tab[3][3] + " |");
					System.out.println("      +---+---+---+");
					System.exit(0);
				}
				if (tab[1][3] == "o" && tab[2][3] == "o" && tab[3][3] == "o") {
					System.out.println("Jogador 2," + p2 + " ganhou!");
					System.out.println();
					System.out.println("      +---+---+---+");
					System.out.println("      | " + tab[1][1] + " | " + tab[1][2] + " | " + tab[1][3] + " |");
					System.out.println("      +---+---+---+");
					System.out.println("      | " + tab[2][1] + " | " + tab[2][2] + " | " + tab[2][3] + " |");
					System.out.println("      +---+---+---+");
					System.out.println("      | " + tab[3][1] + " | " + tab[3][2] + " | " + tab[3][3] + " |");
					System.out.println("      +---+---+---+");
					System.exit(0);
				}
				if (tab[1][1] == "o" && tab[2][2] == "o" && tab[3][3] == "o") {
					System.out.println("Jogador 2," + p2 + " ganhou!");
					System.out.println();
					System.out.println("      +---+---+---+");
					System.out.println("      | " + tab[1][1] + " | " + tab[1][2] + " | " + tab[1][3] + " |");
					System.out.println("      +---+---+---+");
					System.out.println("      | " + tab[2][1] + " | " + tab[2][2] + " | " + tab[2][3] + " |");
					System.out.println("      +---+---+---+");
					System.out.println("      | " + tab[3][1] + " | " + tab[3][2] + " | " + tab[3][3] + " |");
					System.out.println("      +---+---+---+");
					System.exit(0);
				}
				if (tab[1][3] == "o" && tab[2][2] == "o" && tab[3][1] == "o") {
					System.out.println("Jogador 2," + p2 + " ganhou!");
					System.out.println();
					System.out.println("      +---+---+---+");
					System.out.println("      | " + tab[1][1] + " | " + tab[1][2] + " | " + tab[1][3] + " |");
					System.out.println("      +---+---+---+");
					System.out.println("      | " + tab[2][1] + " | " + tab[2][2] + " | " + tab[2][3] + " |");
					System.out.println("      +---+---+---+");
					System.out.println("      | " + tab[3][1] + " | " + tab[3][2] + " | " + tab[3][3] + " |");
					System.out.println("      +---+---+---+");
					System.exit(0);
				}
			}
		}
	}
}
