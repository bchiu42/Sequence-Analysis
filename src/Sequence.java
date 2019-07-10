public class Sequence {
    private String seq;
    private int index;

    public Sequence( int index,String seq) {
        this.seq = seq;
        this.index = index;
    }



    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    @Override
    public String toString() {
        return seq;
    }
}
