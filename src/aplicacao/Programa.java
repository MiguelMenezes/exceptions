package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entidades.Reserva;

public class Programa {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Informe o número do quarto: ");
		int nummeroQuarto = sc.nextInt();
		System.out.print("Data de CHECK-IN (dd/mm/aaaa) : ");
		Date checkin = sdf.parse(sc.next());
		System.out.print("Data de CHECK-OUT (dd/mm/aaaa) : ");
		Date checkout = sdf.parse(sc.next());

		// A classe Date tem o método after, que testa se uma data é posterior a outra:
		if (!checkout.after(checkin)) {

			System.out.println("ERRO NA RESERVA! A data de check-OUT deve ser POSTERIOR à data de check-IN");

		} else {

			Reserva res = new Reserva(nummeroQuarto, checkin, checkout);
			System.out.println(res);

		}

		sc.close();
	}

}
