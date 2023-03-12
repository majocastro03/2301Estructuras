import java.util.*;

public class Principal {
	public static void main(String[] args) {
		int N;
		int intentos = 0;
		do {
			N = ingresar();
			intentos = intentos + 1;
		} while ((N % 2 == 0 || N <= 0) && intentos < 3);
		if (intentos < 3) {
			int square[][] = new int[N][N];
			int i = 0;
			int j = N / 2;
			int currentNum = 1;
			int fila, columna;
			while (currentNum <= N * N) {
				square[i][j] = currentNum;
				currentNum++;
				fila = i;
				columna = j;
				i = i - 1;
				j = j + 1;
				if (i == -1)
					i = N - 1;
				if (j == N)
					j = 0;
				if (square[i][j] != 0) {
					i = fila + 1;
					j = columna;
				}
			}
			imprimir(square, N);
		} else {
			System.out.println("Maximo de intentos");
		}

	}

	public static int ingresar() {
		System.out.println("Ingresa un numero positivo, impar");
		Scanner leer = new Scanner(System.in);
		int N = leer.nextInt();
		return N;
	}

	public static void imprimir(int square[][], int N) {
		int contador = 0;
		for (int ii = 0; ii < square.length; ii++) {
			for (int jj = 0; jj < square.length; jj++) {
				System.out.print(square[ii][jj] + "|      ");
				contador++;
				if (contador == N) {
					System.out.print("\n");
					contador = 0;
				}
			}
		}
	}

}
