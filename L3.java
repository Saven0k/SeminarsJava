import Node;
import OneWayList;
import TwoWayList;


public class L3 {
    public static void main(String[] args) {

//        OneWayList<Integer> integerOneWayList = new OneWayList<>();

        TwoWayList<Integer> integerOneWayList = new TwoWayList<>();
        integerOneWayList.add(55);
        integerOneWayList.add(26);
        integerOneWayList.add(13);
        integerOneWayList.add(98);
//        integerOneWayList.add(122, 2);
        integerOneWayList.addLast(156);

//        System.out.println(integerOneWayList.size());
//        System.out.println(integerOneWayList.get(integerOneWayList.size() - 1));
        System.out.println();
    }
}
