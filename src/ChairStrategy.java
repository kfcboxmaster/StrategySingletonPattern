public class ChairStrategy implements FurnitureStrategy {
    @Override
    public Furniture create() {
        return new Chair();
    }
}