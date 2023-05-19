public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Endereco end = new Endereco();
        Telefone t1 = new Telefone();
        Telefone t2 = new Telefone();
        
        //dados do objeto
        p1.setNome("Maria");
        
        //dados endere�o
        end.setLogradoro("Rua das flores");
        end.setNumero(10);
        //associar o endere�o ao objeto Maria
        p1.setEnd(end);
        
        //dados telefone celular
        t1.setFone("99999-0000");
        t1.setDdd("61");
        
        //dados telefone fixo
        t2.setFone("3676-0000");
        t2.setDdd("38");
        
        //cria��o de arrey de objeto telefone
        Telefone[] telefones = new Telefone[2];
        
        telefones[0] = t1;
        telefones[1] = t2;
        
        //atribuir o array de telefones ao objeto Maria
        p1.setTelefones(telefones);
        
        //impress�o
        System.out.println("Nome: " + p1.getNome() + "\nEndere�o: " + p1.getEnd().getLogradoro() + " num " + p1.getEnd().getNumero());
        
        //impress�o array
        for(int i=0; i < telefones.length; i++){
            System.out.println("\nTelefones: " + telefones[i].getFone() + " DDD: " + telefones[i].getDdd());
    }
    }
    
}
