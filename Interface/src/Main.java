public class Main {
    public static void main(String[] args) {

        DataSet dataset = new DataSet();

        dataset.add(new Coin(0.5));
        dataset.add(new Coin(1.0));
        dataset.add(new Coin(0.25));

        System.out.println("Soma total: " + dataset.getSum());
        System.out.println("Maior valor: " + dataset.getMaximum().getMeasure());
    }
}