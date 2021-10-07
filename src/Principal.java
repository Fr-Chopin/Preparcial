import derivada.CajeroAutomaticoBanelco;
import derivada.CajeroAutomaticoLink;
import derivada.Cliente;

public class Principal {

	public static void main(String[] args) {
		CajeroAutomaticoLink cajeroLink = new CajeroAutomaticoLink(9000);
		CajeroAutomaticoBanelco cajeroBanelco = new CajeroAutomaticoBanelco(7000);
		
		Cliente santino = new Cliente("Santino", "LINK", 1000);
		Cliente guadalupe = new Cliente("Guadalupe", "BANELCO", 1100);
		Cliente leandro = new Cliente("Leandro", "BANELCO", 700);
		
		System.out.println(cajeroLink.extraerDinero(guadalupe, 500));
		System.out.println(guadalupe.getSaldo());
		
		System.out.println(cajeroLink.extraerDinero(santino, 10000));
		
		System.out.println(cajeroBanelco.extraerDinero(guadalupe, 650));
		System.out.println(guadalupe.getSaldo());
		
		System.out.println(cajeroBanelco.extraerDinero(santino, 100));
		System.out.println(santino.getSaldo());
		

	}

}
