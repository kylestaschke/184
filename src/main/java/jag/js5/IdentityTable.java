package jag.js5;

public class IdentityTable {
    final int[] contents;

    public IdentityTable(int[] var1) {
        int size = 1;
        while (size <= (var1.length >> 1) + var1.length) {
            size <<= 1;
        }

        contents = new int[size + size];
        for (int i = 0; i < size + size; ++i) {
            contents[i] = -1;
        }

        int pos;
        for (int var3 = 0; var3 < var1.length; contents[pos + pos + 1] = var3++) {
            for (pos = var1[var3] & size - 1; contents[pos + pos + 1] != -1; pos = pos + 1 & size - 1) {

            }
            contents[pos + pos] = var1[var3];
        }
    }

    public int get(int identifier) {
        int size = (contents.length >> 1) - 1;
        int position = identifier & size;

        while (true) {
            int current = contents[position + position + 1];
            if (current == -1) {
                return -1;
            }

            if (contents[position + position] == identifier) {
                return current;
            }

            position = position + 1 & size;
        }
    }
}
