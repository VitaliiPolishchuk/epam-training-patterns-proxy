package the.best;

public class ImmutableRecipe implements Recipe{

    private final String instruction;
    private final int expiryDate;

    public ImmutableRecipe(String instruction, int expiryDate) {
        this.instruction = instruction;
        this.expiryDate = expiryDate;
    }

    @Override
    public String getInstruction() {
        return instruction;
    }

    @Override
    public int getExpiryDate() {
        return expiryDate;
    }
}
