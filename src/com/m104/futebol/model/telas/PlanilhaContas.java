package com.m104.futebol.model.telas;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PlanilhaContas {
	
	public static int alignCenter(FontMetrics fm,int boxLargura,String texto){
		return (boxLargura/2) - (fm.stringWidth(texto)/2);
	}

	public static void main(String[] args) {
		
		int larguraA4 = 2480;
		int alturaA4 = 3508;
		
		BufferedImage bi = new BufferedImage(larguraA4, alturaA4, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2 = bi.createGraphics();
		
		String[] contas = {"","Aluguél","Condomínio","Luz","Celulares","Internet"};
		String[] meses = {"JAN","FEB","MAR","ABR","JUN","JUL","AGO","SET","OUT","NOV","DEZ"};
		
		//Estilo de fonte
		Font fonteTitulo = new Font("Arial", Font.BOLD, 80);
		Font fonteTexto = new Font("Arial",Font.PLAIN, 50);
		g2.setFont(fonteTitulo);
		
		//alignCenter
		FontMetrics fm = g2.getFontMetrics();
		
		//pading
		int padding = 20;
		
		//Stroke
		Stroke bold = new BasicStroke(2);
		
		//Estilo das cores
		Color corDoTopo = new Color(134,189,209);
		GradientPaint corGradiente = new GradientPaint(0, 0, corDoTopo, 2300, 0, Color.DARK_GRAY);

		//desenha a folha A4
		g2.setColor(Color.WHITE);
		g2.fillRect(0, 0, larguraA4, alturaA4);
		
		//topo
		g2.setPaint(corGradiente);
		g2.fillRect(padding, padding, larguraA4-40, 160);
		g2.setColor(Color.white);
		String titulo = "Contas a pagar - 2015";
		g2.drawString(titulo, alignCenter(fm, larguraA4, titulo), 130);
		
		int alturaDoProximoItem = 160+padding*2;
		
		//tabela
		g2.setColor(Color.BLACK);
		g2.setFont(fonteTexto);
		
		int alturaTexto = fonteTexto.getSize()+40;
		int yLinha = alturaTexto+alturaDoProximoItem;
		for (int i = 0; i < contas.length; i++) {
			g2.drawString(contas[i], padding, yLinha-25);
			g2.fillRect(padding, yLinha, larguraA4-(padding*2), 2);
			yLinha += alturaTexto;
		}
		
		
		int xLinha = 600;
		for (int i = 0; i < meses.length; i++) {
			g2.drawString(meses[i], xLinha, alturaTexto+alturaDoProximoItem-25);
			g2.setStroke(bold);
			yLinha = alturaTexto+alturaDoProximoItem+25;
			for (int j = 1; j < contas.length; j++) {
				g2.drawRect(xLinha+25, yLinha, 40, 40);
				yLinha += alturaTexto;
			}
			
			xLinha += ((larguraA4-(padding*2) - 600) / meses.length);
		}
		
		//salva a imagem em um arquivo png
		File outputfile = new File("planilha.png");
	    try {
			ImageIO.write(bi, "png", outputfile);
			System.out.println("imagem salva com sucesso");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
