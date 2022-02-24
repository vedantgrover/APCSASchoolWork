public class Fake {
    
    private String str;
    private int val;
    private boolean boo;

    public Fake(String str, int val, boolean boo) {
        this.str = str;
        this.val = val;
        this.boo = boo;
    }
    
    public String getStr() {
        return str;
    }
    public boolean isBoo() {
        return boo;
    }
    public void setBoo(boolean boo) {
        this.boo = boo;
    }
    public int getVal() {
        return val;
    }
    public void setVal(int val) {
        this.val = val;
    }
    public void setStr(String str) {
        this.str = str;
    }

    
}
