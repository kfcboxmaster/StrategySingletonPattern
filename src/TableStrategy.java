public class TableStrategy implements FurnitureStrategy {
    @Override
    public Furniture create() {
        return new Table();
    }
}
