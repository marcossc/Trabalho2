
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcos Castanheira
 */
public class Main {
    public static void main(String[] args) {
        
        ArrayList<Aluno> alunos = new ArrayList<>();
        
        alunos.add(new Aluno("Joaquim", 17, 4, 700));
        alunos.add(new Aluno("Manoel", 14, 8, 1000));
        alunos.add(new Aluno("Jarbas", 25, 1, 280));
        
        alunos.stream().forEach((aluno) -> {
            System.out.println(aluno.toStringAnual());
        });
        
        alunos.stream().forEach((aluno) -> {
            aluno.aumento(23.4);
        });
        
        alunos.stream().forEach((aluno) -> {
            System.out.println(aluno.toStringSemestral());
        });
        
    }
}
