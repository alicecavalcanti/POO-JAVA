package caminhao;

import java.util.ArrayList;
import java.util.List;

public class app_caminhao {
	public static void main(String [] args) {
		List<caminhao> listasCaminhoes = new ArrayList();
		
		caminhao_bau caminhaoBau1 = new caminhao_bau(11, "volvo 1", 2010, 2000, 'T', 10f, 4.20f, 3.50f);
		caminhao_bau caminhaoBau2 = new caminhao_bau(12, "volvo 2", 2020, 2000, 'T', 20f, 5.20f, 8.50f);
		caminhao_bau caminhaoBau3 = new caminhao_bau(13, "volvo 3", 2024, 2000, 'T', 30f, 6.20f, 7.50f);
		
		caminhao_tanque caminhaoTanque1 = new caminhao_tanque(21, "Iveco Day",2016, 4000, 'L');
		caminhao_tanque caminhaoTanque2 = new caminhao_tanque(22, "Iveco Day",2019, 1000, 'M');
		
		listasCaminhoes.add(caminhaoBau1);
		listasCaminhoes.add(caminhaoBau2);
		listasCaminhoes.add(caminhaoBau3);
		
		listasCaminhoes.add(caminhaoTanque1);
		listasCaminhoes.add(caminhaoTanque2);
	}
	
}
