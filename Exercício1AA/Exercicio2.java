public class Exercicio2 
{
	public static void main(String[] args) 
	{	
		if(args.length == 0) 
		{
			System.out.println("Sem argumentos na string"); 
			return;
		}
		
		else
		{
			float soma = 0;
			float atual = 0, maior = Float.parseFloat(args[0]) , menor = Float.parseFloat(args[0]);
			for (int i = 0; i < args.length; i++) {
				atual = Float.parseFloat(args[i]);
				soma += atual;
				if (maior < atual) maior = atual;
				if (menor > atual) menor = atual;
				atual = Float.parseFloat(args[i]);
			}
			
			float media = soma / args.length;
			System.out.println("Soma: " + soma + " | Media: " + media + " | maior: " + maior + " | menor: " + menor);
		}
	}
}
