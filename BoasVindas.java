/*Os métodos setters (normalmente chamados de setAlgo) e getters (getAlgo) seguem essa lógica padrão:
-Setters (set): são usados para definir ou modificar o valor de um atributo privado de uma classe. Eles permitem que o valor de um atributo seja alterado de fora da classe, de forma controlada.
-Getters (get): são usados para retornar ou obter o valor de um atributo privado. Eles fornecem uma forma de acessar o valor do atributo de fora da classe. */

public class BoasVindas {
    private String nomeProfessor; // Atributo para armazenar o nome do professor
    // Método para DEFINIR o nome do professor
    public void setNomeProfessor(String nome) {
        nomeProfessor = nome;
    }
    // Método para RETORNAR o nome do professor
    public String getNomeProfessor() {
        return nomeProfessor;
    }
    // Método que exibe uma mensagem de boas-vindas, usando o nome do professor
    public void mostraMensagem() {
        System.out.printf("Bem vindo ao curso de Java da %s\n", getNomeProfessor());
    }
}
