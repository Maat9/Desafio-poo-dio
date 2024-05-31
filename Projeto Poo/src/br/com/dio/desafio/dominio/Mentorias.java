package br.com.dio.desafio.dominio;
import java.time.LocalDate;

public class Mentorias extends Conteudo {
    private LocalDate data;

    public Mentorias (String titulo, String descricao){
        this.titulo = titulo;
        this.descricao = descricao;
    }
    
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    @Override
    public String toString() {
        return "Mentorias [titulo=" + titulo + ", descricao=" + descricao + ", data=" + data + "]";
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 10;
    }
}
