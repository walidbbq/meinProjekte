<?php

 function dividiere ($zaehler, $nenner){
    
     $z = gettype($zaehler);
     $n = gettype ($nenner);
     
     if ( ($z=="integer" OR $z=="double")And
          ($n=="integer" OR $n=="double") ) {
              
         $div=($zaehler/$nenner); 
         echo $div;
        
         }
         
         else {
             $fehler="Fehler";
             echo $fehler;
         }
}


dividiere(10, 9);
?>