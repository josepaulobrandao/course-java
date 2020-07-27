package estruturaCondicional;

public class Exercicio_4 {

	public static void main(String[] args) {

		int horaInicialDoJogo;
		int horaFinalDoJogo;

		for (int i = 0; i < 24; i++) {

			horaInicialDoJogo = (int) (Math.random() * 1);
			horaFinalDoJogo = (int) (Math.random() * 24);

			int resultado = horaInicialDoJogo + horaFinalDoJogo;

			if (resultado < 25) {
				System.out.printf("O JOGO DUROU %s HORAS", resultado);
			} else if (resultado > 25) {
				System.out.printf("O JOGO PASSOU EM %s HORAS", resultado);
			}
		}

	}

}
