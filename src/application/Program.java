package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		List<Lesson>list=new ArrayList<>();
			
		System.out.print("Quantas aulas tem o curso? ");
		int n=sc.nextInt();
	
		System.out.println();
		for(int i=1;i<=n;i++) {
			System.out.println("Dados da "+i+"a aula");
			System.out.print("Vídeo ou tarefa(v/t)? ");
			char resp=sc.next().charAt(0);
			System.out.print("Titulo: ");
			sc.nextLine();
			String title=sc.nextLine();
			if(resp=='v') {
				System.out.print("URL do vídeo: ");
				String url=sc.next();
				System.out.print("Duracao em segundos: ");
				int duration=sc.nextInt();
				list.add(new Video(title, url, duration));
			}
			else {
				System.out.print("Descrição: ");
				String description=sc.nextLine();
				System.out.print("Quantidade de questoes: ");
				int questionCount=sc.nextInt();
				list.add(new Task(title, description, questionCount));
				}
		}
		
		int sum=0;
		for (Lesson l:list) {
			sum+=l.duration();
		}
		
		System.out.println();
		System.out.println("DURAÇÃO TOTAL DO CURSO = "+sum+" segundos");
	
	
		sc.close();
	}


}
	
	
