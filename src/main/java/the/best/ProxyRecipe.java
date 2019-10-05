package the.best;

public class ProxyRecipe implements Recipe{
    ImmutableRecipe realRecipe;
    Integer updatedExpiryDate;


    public ProxyRecipe(ImmutableRecipe realRecipe) {
        this.realRecipe = realRecipe;
    }

    public void setExpiryDate(Integer updatedExpiryDate) {
        this.updatedExpiryDate = updatedExpiryDate;
    }

    @Override
    public String getInstruction() {
        return realRecipe.getInstruction();
    }

    @Override
    public int getExpiryDate() {
        if (updatedExpiryDate != null){
            return updatedExpiryDate;
        }
        return realRecipe.getExpiryDate();
    }
}
