public class exercicio2 {

    public static void main(String[] args) {

        //calcular total
        int Janeiro = 15000;
        int Fevereiro = 23000;
        int Março = 17000;
        int GastoTotalNoTrimestre = (Janeiro + Fevereiro + Março);
        System.out.println("Gasto TOTAL no Trimestre foi de : " + GastoTotalNoTrimestre);

        //calcular a media mensal
        double MediaMensal = (Janeiro + Fevereiro + Março) / 3;
        System.out.println("Valor da MÉDIA MENSAL = " + MediaMensal);
    }
}
