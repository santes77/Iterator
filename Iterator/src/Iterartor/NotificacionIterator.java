package Iterartor;

import java.security.PublicKey;

public class NotificacionIterator 
    implements Iterartor{
        Notificacion []notificacionLIST;

        int pos = 0 ;
        public void notificacionIterator(Notificacion [] notificacionlist) {
            this.notificacionLIST= notificacionlist;



        }
public Object next (){
    Notificacion notificacion =
    notificacionLIST[pos];
    pos += 1;
    return notificacion;

     public boolean hasNext (){

    }
    if (pos>= notificacionLIST.length || notificacionLIST[pos]== null){
        return false;
    }else{

        return true;
}
    
}

}
    

