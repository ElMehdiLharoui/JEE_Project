package Model;


import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class cart {
    List<Livre> livres=new LinkedList<Livre>();
    private static cart c=null;
   private  cart(){
         base();
    }
 public static cart getcart(){
       if(c==null)  c = new cart();
       return c;
 }


    public void addLivres(Livre l)
    {
        livres.add(l);
    }
    public List<Livre> getLivre(){
        return livres;
    }
    public void base(){
   Livre l = new Livre("ana",54,1);
        addLivres(l);
   Livre l2 = new Livre("howa",54,1);
        addLivres(l2);
    }
}
