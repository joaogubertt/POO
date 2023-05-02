public class Exercicio3
{
	public static void main(String[] args)
	{
		int qtd = args.length;
		for(int i = 0; i < qtd; i ++)
		{
			int atual = Integer.parseInt(args[i]);
			for(int j = 0; j < atual; j ++) 
			{	
				int alunoinfo = i + 1;
				if(j == 0) System.out.print("Aluno 0" + alunoinfo + " ");
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
	