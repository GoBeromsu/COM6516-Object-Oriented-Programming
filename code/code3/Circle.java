package code3;/*
 * Circle.java
 *
 * Copyright (c) University of Sheffield 2014
 */

public class Circle {

    // constructor
    public Circle(double r) {
        radius = r;
    }

    // class method
    public static double radToDeg(double angleRad) {
        return angleRad * 180.0 / PI;
    }

    // instance methods
    public double area() {
        // returns area of the circle
        return PI * radius * radius;
    }

    public double circumference() {
        // returns circumference of the circle
        return 2.0 * PI * radius;
    }

    // class field
    public static final double PI = 3.1415927;

    // instance field
    private double radius;

    // Override toString to show functions of Circle Object
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Circle area : " + this.area());
        builder.append("\ncircumference : " + this.circumference());
        return builder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        // 객체 참조가 동일한지 먼저 확인
        if (this == obj) return true;

        // 타입 검사: 클래스가 다르면 바로 false 반환
        if (obj == null || this.getClass() != obj.getClass()) return false;

        // 캐스팅 후 상태 값 비교
        Circle other = (Circle) obj;

        // radius 값이 같아야만 true 반환
        return this.radius == other.radius;
    }
}
