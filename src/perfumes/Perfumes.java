package perfumes;

import java.util.Scanner;

public class Perfumes {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        PerfumeList perfume = new PerfumeList();
        int op = -1;
        String item;
        int ind = 0;
        
        while (op != 0) {
            System.out.println("Menu\n1. Adicionar perfume\n2. Alterar perfume\n3. Remover perfume\n4. Listar perfumes"
                    + "+\n5. Buscar perfume\n6. Quantidade de perfumes\n7. Ordenar perfumes\n0. Sair");
            op = ler.nextInt();

            switch (op) {

                case 1:

                    System.out.println("Digite o item: ");
                    ler.nextLine();
                    perfume.setPerfume(ler.nextLine());
                    break;

                case 2:
                    System.out.println("Qual item você alterar? Informe a posição.");
                    String oldName = ler.next();
                    System.out.println("Qual o novo item?");
                    String newName= ler.next();
                    perfume.replacePerfume(oldName, newName);
                    System.out.println("Alterado.");
                    break;
                    
                case 3:
                    System.out.println("Qual perfume você gostaria de remover?");
                    perfume.removePerfume(ler.next());
                    System.out.println("Removido.");
                    break;
                case 4:
                    System.out.println(perfume.listPerfume());
                    break;
                case 5:
                    System.out.println("Qual perfume você gostaria?");
                    System.out.println(perfume.getPerfume(ler.next()));
                    break;
                case 6:
                    perfume.sizeList();
                    break;
                case 7:
                    perfume.alphaticalOrder();
                    break;

                default:
                    if (op == 0) {
                        System.out.println("Obrigado!");
                    } else {
                        System.out.println("Opção inválida.");
                    }
            }
        }
    }

}
