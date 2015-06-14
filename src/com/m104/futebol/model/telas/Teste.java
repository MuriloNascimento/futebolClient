package com.m104.futebol.model.telas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import com.m104.futebol.model.webservice.Time;
import com.m104.futebol.model.webservice.TimesWS;
import com.m104.futebol.model.webservice.TimesWSService;

public class Teste {
	
	private static String WS_URL = "http://localhost:8085/futebol/TimesWS?wsdl";

	public static void main(String[] args) {
		
		TimesWSService timesWSService = new TimesWSService();
		TimesWS timesWS = timesWSService.getTimesWSPort();
		Map<String, Object> req_ctx = ((BindingProvider)timesWS).getRequestContext();
        req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, WS_URL);
 
        Map<String, List<String>> headers = new HashMap<String, List<String>>();
        headers.put("Username", Collections.singletonList("futebol"));
        headers.put("Password", Collections.singletonList("1234"));
        req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
		
        List<Time> times = timesWS.buscarTodos();
        Class<Time> classe = Time.class;
        int totalAtributosClasse = classe.getDeclaredFields().length;
		

		BufferedImage bi = new BufferedImage(800, 600, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2 = bi.createGraphics();
		g2.setColor(Color.WHITE);
		g2.fillRect(0, 0, bi.getWidth(), bi.getHeight());
		Font fonte = new Font("Comics",Font.PLAIN,18);
		g2.setFont(fonte);
		
		int alturaTexto = fonte.getSize()+10;
		
		int yLinha = alturaTexto;
		for (int i = 0; i < (times.size()/2); i++) {
			g2.setColor(new Color(245,245,245));
			g2.fillRect(0, yLinha, bi.getWidth(), alturaTexto);
			yLinha += alturaTexto*2;
		}
		
		yLinha = alturaTexto-7;
		for (Time time : times) {
			
			g2.setColor(new Color(255,129,119));
			g2.drawString(time.getNome(), 6, yLinha);
		
			int xLinha = 160;
			for (int i = 1; i < totalAtributosClasse; i++) {
				g2.drawOval(xLinha, yLinha-alturaTexto+10, 20, 20);
				xLinha += ((600 - 160) / totalAtributosClasse);
			}
			
			yLinha += alturaTexto;
		}
		
		
		
		
		
	    File outputfile = new File("saved.png");
	    try {
			ImageIO.write(bi, "png", outputfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
