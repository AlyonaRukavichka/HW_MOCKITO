import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest {

    @Test
    public void SaveNewIterms() {
        FilmsManager manager = new FilmsManager();
        manager.save("Бладшот");
        manager.save("Вперед");
        manager.save("Отель Белград");
        manager.save("Джентельмены");
        manager.save("Человек-невидимка");
        manager.save("Номер один");

        String[] expected = {"Бладшот", "Вперед", "Отель Белград", "Джентельмены", "Человек-невидимка", "Номер один"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void SaveZeroIterms() {
        FilmsManager manager = new FilmsManager();
        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void SaveOneIterms() {
        FilmsManager manager = new FilmsManager();
        manager.save("Бладшот");

        String[] expected = {"Бладшот"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLastFive() {
        FilmsManager manager = new FilmsManager();
        manager.save("Бладшот");
        manager.save("Вперед");
        manager.save("Отель Белград");
        manager.save("Джентельмены");
        manager.save("Человек-невидимка");
        manager.save("Номер один");

        String[] expected = {"Номер один", "Человек-невидимка", "Джентельмены", "Отель Белград", "Вперед"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void FindLastTwo() {
        FilmsManager manager = new FilmsManager(2);
        manager.save("Бладшот");
        manager.save("Вперед");
        manager.save("Отель Белград");
        manager.save("Джентельмены");
        manager.save("Человек-невидимка");
        manager.save("Номер один");

        String[] expected = {"Номер один", "Человек-невидимка"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
