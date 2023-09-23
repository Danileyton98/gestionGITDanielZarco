public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int[] numeros = {34, 65, 234, 98, 93};
        int numMayor = 0;

        for(int i = 0; i < numeros.length; i++){
            if(numMayor < numeros[i]){
                numMayor = numeros[i];
            }
    }
    System.out.println(numMayor);
}
}