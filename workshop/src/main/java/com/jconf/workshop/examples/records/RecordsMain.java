package com.jconf.workshop.examples.records;

public class RecordsMain {

    public static void main(String[] args) {
        Point point1 = new Point(2,3);
        Point point2 = new Point(2,3);

        System.out.println("======== Records =========");
        PointRecord pointRecord1 = new PointRecord(2,3);
        PointRecord pointRecord2 = new PointRecord(2,3);
        System.out.println("-------- Modificadores --------");
        System.out.println("Método x(): "+pointRecord1.x());
        System.out.println("Método y(): "+pointRecord1.y());

        System.out.println("-------- Constructor --------");
        PointRecord pointRecord3 = new PointRecord(12,3);

        System.out.println("-------- Equals, ToString --------");
        System.out.println("Records >> equals? "+ pointRecord1.equals(pointRecord2));
        System.out.println(pointRecord1);
        System.out.println(pointRecord3);
    }
}
