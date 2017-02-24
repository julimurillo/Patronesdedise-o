package observador;

import observador.Observadores.SujetoC;
import observador.Sujetos.ObservadorC;

public class Cliente {

	public void NuevoVideo(Youtube you) {
		if (Youtube.getEstado().equals("Nuevo")) {
			SujetoC sujeto = new SujetoC();
			sujeto.getState();

		}
	}

	public static void main(String[] args) {
		SujetoC sujeto = new SujetoC();
		Cliente C = new Cliente();
		Youtube you = new Youtube();

		sujeto.subscribirse(new ObservadorC());

		you.setEstado("Nuevo");

		C.NuevoVideo(you);

	}

}
