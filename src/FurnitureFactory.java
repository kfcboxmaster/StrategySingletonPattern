class FurnitureFactory {
    private static FurnitureFactory instance;

    private FurnitureFactory() {
    }

    public static FurnitureFactory Singleton() {
        if (instance == null) {
            synchronized (FurnitureFactory.class) {
                if (instance == null) {
                    instance = new FurnitureFactory();
                }
            }
        }
        return instance;
    }

    public Furniture createFurniture(FurnitureStrategy strategy) {
        return strategy.create();
    }
}
