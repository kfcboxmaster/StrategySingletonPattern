public class BedStrategy implements FurnitureStrategy{
    @Override
    public Furniture create() {
        return new Bed();
    }
}
