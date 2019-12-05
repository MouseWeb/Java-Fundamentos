package stringBuilder;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import stringBuilder.entities.Comment;
import stringBuilder.entities.Post;

public class StringBuilder {

	// Composi��o:
	// 		� � um tipo de associa��o que permite que um objeto contenha outro
	// 		� Rela��o "tem-um" ou "tem-v�rios"
	// 	� Vantagens:
	// 		� Organiza��o: divis�o de responsabilidades = dividi seu sistema em responsabilidades, cada Class tem a sua responsabilidade.
	// 		� Coes�o = cada Objeto � responsavel por uma �nica coisa, o obj tem uma responsabilidade simples e bem definida,
	//			n�o devemos misturar varioas coisa no mesmo lugar, cada Obj tem sua responsabilidade espec�fica.
	// 		� Flexibilidade = trabalha em um projeto que est� dividido em partes � mais f�cil do que trabalhar em um que est� mal dividido.
	// 		� Reuso = o mesmo objeto pode ser reaproveitado em mais de um lugar.
	// 		� Nota: embora o s�mbolo UML para composi��o (todo-parte) seja o diamante preto, neste contexto estamos chamando de composi��o
	// 			qualquer associa��o tipo "tem-um" e "tem-v�rios".

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
