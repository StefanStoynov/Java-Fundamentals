package p11_Threeuple;

public class Threeuple <A,B,C> {
    private A field1;
    private B field2;
    private C field3;

    public Threeuple(A field1, B field2, C field3) {
        this.setField1(field1);
        this.setField2(field2);
        this.setField3(field3);
    }

    public A getField1() {
        return this.field1;
    }

    public B getField2() {
        return this.field2;
    }

    public C getField3() {
        return this.field3;
    }

    public void setField1(A field1) {
        this.field1 = field1;
    }

    public void setField2(B field2) {
        this.field2 = field2;
    }

    public void setField3(C field3) {
        this.field3 = field3;
    }


    @Override
    public String toString() {
        return String.format("%s -> %s -> %s",this.field1,this.field2, this.field3);
    }
}
