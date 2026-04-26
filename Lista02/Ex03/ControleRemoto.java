public class ControleRemoto {

    public static void main(String[] args) {

        Televisao tv = new Televisao();

        System.out.println(tv);

        tv.trocarCanal(5);
        System.out.println(tv);

        tv.aumentarVolume();
        System.out.println(tv);

   
        tv.diminuirVolume();
        System.out.println(tv);
    }
}