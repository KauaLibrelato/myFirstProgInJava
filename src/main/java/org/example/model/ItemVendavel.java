package org.example.model;

public class ItemVendavel extends EntityId {
    private String descricao;
    private Double valorUnitario;
    private Boolean estocavel;

    public String getDescricao() {
        return descricao;
    }

    public Boolean getEstocavel() {
        return estocavel;
    }

    public void setEstocavel(Boolean estocavel) {
        this.estocavel = estocavel;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @Override
    public String toString() {
        return "ItemVendavel{" +
                "descricao='" + descricao + '\'' +
                ", valorUnitario=" + valorUnitario +
                ", estocavel=" + estocavel +
                '}';
    }
}
