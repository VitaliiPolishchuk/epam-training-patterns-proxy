package the.best;

public class Main {
    public static void main(String[] args) {
        ImmutableRecipe immutableRcipe = new ImmutableRecipe("Instruction ...", 10);
        ProxyRecipe proxyRecipe = new ProxyRecipe(immutableRcipe);
        proxyRecipe.setExpiryDate(15);
        Recipe recipe = proxyRecipe;


        System.out.println(immutableRcipe.getExpiryDate());
        System.out.println(recipe.getExpiryDate());
    }
}
