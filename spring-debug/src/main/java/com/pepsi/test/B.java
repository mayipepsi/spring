package com.pepsi.test;

public class B {

    private A a;

    private String name;

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
    public String toString() {
        return "B{" +
                "a=" + a +
                '}';
    }
}
