public class mainListSize {
    public static void main(String[] args) {
        ListSize<Integer> ListInteger = new ListSize<>();
        ListInteger.add(1);
        ListInteger.add(2);
        ListInteger.add(3);
        ListInteger.add(4);
        ListInteger.add(5);

        System.out.println(ListInteger.get(4));
        System.out.println(ListInteger.get(1));
        System.out.println(ListInteger.get(2));
        System.out.println(ListInteger.get(4));

//        ListInteger.get(6);
//        System.out.println(ListInteger.get(6));

//        ListInteger.get(-1);
//        System.out.println(ListInteger.get(-1));
//    }

    }
}

