package interfacePolimorfismo;

public class TvTeste {

	public static void main(String[] args) {
		
		TVLG tvlg = new TVLG();
		TvSansung tvsamsung = new TvSansung();
		
		tvlg.ligar();
		tvlg.mudarCanal(6);
		tvlg.desligar();
		tvlg.conectarInternet();
		
		System.out.println("");
		
		tvsamsung.ligar();
		tvsamsung.mudarCanal(9);
		tvsamsung.desligar();

	}

}
