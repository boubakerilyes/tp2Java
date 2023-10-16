public class Test {
    public static void main(String[] args) {
        Livre livre1=new Livre("bonjour","ilyes+",123,50);
        Livre livre2=new Livre("aaa","ee",183,1000);
        livre1.ToString();
        System.out.println("le auteur de livere 2 est :"+livre2.getAuteur());
        livre2.setAuteur("vvvv");
        System.out.println("le new auteur de livere 2 est :"+livre2.getAuteur());
        System.out.println("le nombre de livre est "+Livre.cpt);
    }
}
