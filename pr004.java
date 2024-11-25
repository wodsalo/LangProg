class Block {
  private int a, b, c;
  private int v;

  public Block(int i, int j, int k) {
    a = i;
    b = j;
    c = k;
    v = a * b * c;
  }
  public boolean sameBlock(Block ob) {
    if((ob.a == a) & (ob.b == b) & (ob.c == c))
      return true;
    else
      return false;
  }

  public boolean sameV(Block ob) {
    if(ob.v == v)
      return true;
    else
      return false;
  }
}

class pr004 {
  public static void main(String[] args) {
    Block ob1 = new Block(10, 2, 5);
    Block ob2 = new Block(10, 2, 5);
    Block ob3 = new Block(5, 4, 5);
    System.out.println("ob1 эквивалентен ob2: " + ob1.sameBlock(ob2));
    System.out.println("ob1 эквивалентен ob3: " + ob1.sameBlock(ob3));
    System.out.println("Объём ob1 равен объёму ob2: " + ob1.sameBlock(ob3));
}
