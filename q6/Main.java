public class Main {
    static class Box {
        int length;
        int width;
        int height;

        Box(int length, int width, int height) {
            this.length = length;
            this.width = width;
            this.height = height;
        }

        void checkSize() {
            if (length < 10)
                length += (10 - length);
            else if (length > 10)
                length -= (length - 10);

            if (width < 12)
                width += (12 - width);
            else if (width > 12)
                width -= (width - 12);

            if (height < 8)
                height += (8 - height);
            else if (height > 8)
                height -= (height - 8);
        }

        void display() {
            System.out.println("Length = " + length);
            System.out.println("Width = " + width);
            System.out.println("Height = " + height);
        }
    }

    public static void main(String[] args) {
        Box b1 = new Box(9, 15, 10);

        System.out.println("Before Correction:");
        b1.display();

        b1.checkSize();

        System.out.println("\nAfter Correction:");
        b1.display();
    }
}