public class Vendendor extends Empregado {
    private float percentualComissao;

    public void setPercentualComissao(float percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public float getPercentualComissao() {
        return percentualComissao;
    }

    public Vendendor() {

    }

    public Vendendor(String nome,float salario, float percentualComissao) {
        super(nome, salario);
        this.percentualComissao = percentualComissao;
    }
}
