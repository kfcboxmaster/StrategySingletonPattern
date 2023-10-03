public interface Furniture {
    void assemble();
    void ship();
}
class Chair implements Furniture {
    int countdown = 3;
    @Override
    public void assemble() {
        System.out.println("Assembling a chair.");
        for (int i = countdown; i >= 1; i--) {
            System.out.println("Creating a chair in " + i + " seconds...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
    @Override
    public void ship() {
        System.out.println("Chair was packed and send. Will come in 2 work days.");
    }
}
class Table implements Furniture {
    int countdown = 6;
    @Override
    public void assemble() {
        System.out.println("Assembling a table.");
        for (int i = countdown; i >= 1; i--) {
            System.out.println("Creating a table in " + i + " seconds...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
    @Override
    public void ship() {
        System.out.println("Table was packed and send. Will come in 4 work days.");
    }
}
class Bed implements Furniture {
    int countdown = 12;
    @Override
    public void assemble() {
        System.out.println("Assembling a bed.");
        for (int i = countdown; i >= 1; i--) {
            System.out.println("Creating a bed in " + i + " seconds...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
    @Override
    public void ship() {
        System.out.println("Bed can not be shipped. Come to take out.");
    }
}
interface FurnitureStrategy {
    Furniture create();
}
