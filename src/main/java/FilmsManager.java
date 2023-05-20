public class FilmsManager {

    private String[] items = new String[0];
    private int lastNumbers;

    public FilmsManager(int lastNumbers) {
        this.lastNumbers = lastNumbers;
    }

    public FilmsManager() {
        this.lastNumbers = 5;
    }

    public void save(String item) {
        String[] tmp = new String[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        this.items = tmp;
    }


    public String[] findAll() {
        return items;
    }

    public String[] findLast() {
        int resultLength;
        if (items.length > lastNumbers) {
            resultLength = lastNumbers;
        } else {
            resultLength = items.length;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = items[items.length - 1 - i];
        }
        return tmp;
    }
}


