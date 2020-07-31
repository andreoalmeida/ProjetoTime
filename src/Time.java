import java.util.Scanner;

public class Time {

	public static void main(String args[]) {

		Scanner t = new Scanner(System.in);
		int h, m, s;

		h = t.nextInt();
		m = t.nextInt();
		s = t.nextInt();

		TesteTime time = new TesteTime(h, m, s);

		System.out.println("Hora Universal");
		System.out.println(time.exibirHoraUniversal());
		System.out.println("Hora Padrão");
		System.out.println(time.exibirHoraPadrao());

	}

}
