public class DataSet {
    private double sum;
    private Measurable maximum;
    private int count;

    public void add(Measurable x) {
        sum = sum + x.getMeasure(); // Adiciona o valor medido à soma total.

        // Atualiza o máximo se for o primeiro item ou se o novo item tiver uma medida maior.
        if (count == 0 || maximum.getMeasure() < x.getMeasure()) {
            maximum = x;
        }

        count++; // Incrementa o contador de itens adicionados.
    }

    public Measurable getMaximum() {
        return maximum; // Retorna o item com a maior medida.
    }

    public double getSum() {
        return sum; // Retorna a soma das medidas.
    }

    public int getCount() {
        return count; // Retorna a contagem de itens adicionados.
    }
}
