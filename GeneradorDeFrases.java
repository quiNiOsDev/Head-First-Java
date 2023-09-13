public class GeneradorDeFrases {
    public static void main(String[] args) {
        String[] listaNombres={"Nilo","Jorge","Miguel","Wilder","Jhin","Jholbin","Pecas","Yohany","Juan Carlos"};
        String[] listaAdjetivo={"Estudioso","Genio","Borracho","Inteligente","Crack","Musculoso","Deportista","Feo"};
        String[] listaLugarDeTrabajo={"Disney","Netflix","La cachina","La calle","Google","Amazon","Cibertec","MIT","Xvideos","Su casa","Indra","Mc Donalds"};

        int cantElementosListaNombres=listaNombres.length;
        int cantElementosListaAdjetivo=listaAdjetivo.length;
        int cantElementosListaLugarDeTrabajo=listaLugarDeTrabajo.length;

        java.util.Random randomGenerator = new java.util.Random();
        int rand1 = randomGenerator.nextInt(cantElementosListaNombres);
        int rand2 = randomGenerator.nextInt( cantElementosListaAdjetivo);
        int rand3 = randomGenerator.nextInt(cantElementosListaLugarDeTrabajo);


        System.out.println("El es "+listaNombres[rand1]+" es un "+listaAdjetivo[rand2]+" y trabaja en "+ listaLugarDeTrabajo[rand3]);


    }
}
