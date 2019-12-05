package stringBuilder;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import stringBuilder.entities.Comment;
import stringBuilder.entities.Post;

public class StringBuilder {

	// Composição:
	// 		• É um tipo de associação que permite que um objeto contenha outro
	// 		• Relação "tem-um" ou "tem-vários"
	// 	• Vantagens:
	// 		• Organização: divisão de responsabilidades = dividi seu sistema em responsabilidades, cada Class tem a sua responsabilidade.
	// 		• Coesão = cada Objeto é responsavel por uma única coisa, o obj tem uma responsabilidade simples e bem definida,
	//			não devemos misturar varioas coisa no mesmo lugar, cada Obj tem sua responsabilidade específica.
	// 		• Flexibilidade = trabalha em um projeto que está dividido em partes é mais fácil do que trabalhar em um que está mal dividido.
	// 		• Reuso = o mesmo objeto pode ser reaproveitado em mais de um lugar.
	// 		• Nota: embora o símbolo UML para composição (todo-parte) seja o diamante preto, neste contexto estamos chamando de composição
	// 			qualquer associação tipo "tem-um" e "tem-vários".

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);

		p1.addComment(c1);
		p1.addComment(c2);

		Comment c3 = new Comment("Good night");
		Comment c4 = new Comment("May the Force be with you");
		Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Good night guys", "See you tomorrow", 5);

		p2.addComment(c3);
		p2.addComment(c4);

		System.out.println(p1);
		System.out.println(p2);

	}

}
