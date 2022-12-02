package transport;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import model.*;




public class TCP {
	
	
	public void init_TCP (User Expediteur, User Destinataire, User.Role role) throws IOException, IOException {
		
		String adresse_test = "127.0.0.1";
		int port_test = 1024;
		
		
		switch (role) {
		
		case EXPEDITEUR :
			
			//Pour plus tard
			//String adresse_destinataire = Destinataire.getIp();
			//int port = Expediteur.getPort();
			
			Socket link = new Socket(adresse_test,port_test);
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(link.getOutputStream()));

			
		case DESTINATAIRE :
			
			ServerSocket serveur = new ServerSocket(port_test);
			Socket link2 = serveur.accept();
				
		}
	}
	
	
	public void envoyer_msg_discussion (User Destinataire, Message msg) {	 
		
		
		
	}
	
	public void recevoir_msg_discussion () {
		BufferedReader in = new BufferedReader(new InputStreamReader(link2.getInputStream()));
		
		String recu = null;
		while (recu == null) recu = in.readLine() ;
		System.out.println(recu);
		
		link2.close();
		
	}
	
	

}
