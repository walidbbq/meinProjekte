<?php
require_once('person.php');

class daten {


    
    public static function get_telefonliste()
     {
      
     $telefonliste=array (new person(1,"Schickentanz","Lara","012112099"),
                          new person(2, "Rehfeld", "Jan","0221408987"),
                          new person(3, "Zieler", "Sarah","030435667"),
                          new person(4, "Becker", "Paul", "021444565"),
                          new person(5, "Heidel", "Tanja", "0151202365")
                        );
     
     return $telefonliste;
        
//      for ($i=0 ; $i<sizeof($telefonliste); $i++ ) {
            
//                     echo $telefonliste[$i] -> getID(). " "; 
//                     echo $telefonliste[$i] -> getVorname() . " " ;
//                     echo $telefonliste[$i] -> getNachname(). " ";
//                     echo $telefonliste[$i] -> getTelefonnummer();
//                     echo "<br>";      
           
           
//         }
    }
}




// $telefonliste=daten::get_telefonliste();


// echo  $telefonliste;

?>